package src;

public class Chapter07RaidParity {
    public static void main(String[] args) {
        int diskA = 0b1010;
        int diskB = 0b1100;
        int parity = diskA ^ diskB;       // XOR 패리티 생성
        int recoveredB = diskA ^ parity; // B 디스크 데이터 복원

        System.out.println("패리티: " + Integer.toBinaryString(parity)); // 110
        System.out.println("복원된 B: " + Integer.toBinaryString(recoveredB)); // 1100
    }
}
