package src;

public class Chapter04InstructionCycle {
    public static void main(String[] args) {
        String[] program = {"LOAD 5", "ADD 3", "SUB 2", "HALT"};
        int pc = 0;          // 다음에 읽을 명령어의 위치
        int accumulator = 0; // 연산 결과를 저장하는 가상 레지스터

        while (pc < program.length) {
            String instruction = program[pc++]; // 인출(Fetch)
            String[] parts = instruction.split(" "); // 해석(Decode)

            switch (parts[0]) { // 실행(Execute)
                case "LOAD" -> accumulator = Integer.parseInt(parts[1]);
                case "ADD" -> accumulator += Integer.parseInt(parts[1]);
                case "SUB" -> accumulator -= Integer.parseInt(parts[1]);
                case "HALT" -> {
                    System.out.println("최종 결과: " + accumulator); // 6
                    return;
                }
                default -> throw new IllegalArgumentException("알 수 없는 명령어");
            }
        }
    }
}
