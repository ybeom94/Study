package src;

public class Chapter06CacheLocality {
    public static void main(String[] args) {
        int[] accessedIndexes = {0, 1, 2, 3, 8, 9, 0};
        int elementsPerBlock = 4;
        int cachedBlock = -1; // 한 번에 블록 하나만 저장하는 가상 캐시

        for (int index : accessedIndexes) {
            int block = index / elementsPerBlock;
            boolean hit = (block == cachedBlock);
            System.out.printf("인덱스 %d → %s%n", index, hit ? "HIT" : "MISS");
            if (!hit) cachedBlock = block;
        }
    }
}
