package src;

public class Chapter14Paging {
    private static final int PAGE_SIZE = 1024;
    // 페이지 번호 0,1,2에 해당하는 프레임 번호. -1은 현재 미적재.
    private static final int[] pageTable = {3, -1, 7};

    private static void translate(int virtualAddress) {
        int page = virtualAddress / PAGE_SIZE;
        int offset = virtualAddress % PAGE_SIZE;
        if (virtualAddress < 0 || page >= pageTable.length) {
            throw new IllegalArgumentException("가상 주소 범위 초과");
        }
        if (pageTable[page] == -1) {
            System.out.println("페이지 폴트: " + page + "번 페이지 미적재");
            return;
        }
        int physicalAddress = pageTable[page] * PAGE_SIZE + offset;
        System.out.println("가상 주소 " + virtualAddress + " → 물리 주소 " + physicalAddress);
    }

    public static void main(String[] args) {
        translate(2500); // 페이지 2, 오프셋 452 → 프레임 7 → 7620
        translate(1500); // 페이지 1이 메모리에 없어서 페이지 폴트
    }
}
