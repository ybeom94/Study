package src;

import java.nio.charset.StandardCharsets;
import java.util.HexFormat;

public class Chapter02DataEncoding {
    public static void main(String[] args) {
        int number = 42;
        System.out.println("10진수: " + number);
        System.out.println("2진수: " + Integer.toBinaryString(number));
        System.out.println("16진수: " + Integer.toHexString(number));

        byte[] bytes = "가".getBytes(StandardCharsets.UTF_8);
        System.out.println("UTF-8 바이트: " + HexFormat.of().formatHex(bytes));
        System.out.println("디코딩: " + new String(bytes, StandardCharsets.UTF_8));
    }
}
