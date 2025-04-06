package org.example;

public class Calculator {
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0!");
        }
        return a / b;
    }
    public static int parseNumber(String input) {
        if (input == null) {
            throw new NullPointerException("Chuỗi đầu vào bị null!");
        }
        return Integer.parseInt(input);
    }
}
