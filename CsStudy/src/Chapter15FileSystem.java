package src;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Chapter15FileSystem {
    public static void main(String[] args) throws Exception {
        Path file = Files.createTempFile("cs-study-", ".txt");
        try {
            Files.writeString(file, "컴퓨터 구조와 운영체제", StandardCharsets.UTF_8);
            System.out.println("파일: " + file.getFileName());
            System.out.println("내용: " + Files.readString(file, StandardCharsets.UTF_8));
            System.out.println("크기(byte): " + Files.size(file));
        } finally {
            Files.deleteIfExists(file); // 실습용 임시 파일 정리
        }
    }
}
