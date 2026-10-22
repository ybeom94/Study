package src;

public class Chapter11RoundRobin {
    public static void main(String[] args) {
        int[] remaining = {5, 3}; // P1, P2의 남은 CPU 실행 시간
        int quantum = 2;        // 한 번에 최대 2만큼 실행
        int time = 0;

        while (remaining[0] > 0 || remaining[1] > 0) {
            for (int i = 0; i < remaining.length; i++) {
                if (remaining[i] == 0) continue;
                int used = Math.min(quantum, remaining[i]);
                System.out.printf("%d~%d : P%d 실행%n", time, time + used, i + 1);
                time += used;
                remaining[i] -= used;
            }
        }
    }
}
