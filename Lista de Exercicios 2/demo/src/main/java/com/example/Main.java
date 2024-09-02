package com.example;

import java.util.Scanner;

public class Main {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static final String digits = "0123456789ABCDEF";

    static String intToHex(Integer input) {
        if (input <= 0) {
            return "0";
        }
        StringBuilder hex = new StringBuilder();
        while (input > 0) {
            int remainder = input % 16;
            if (remainder < 10) {
                hex.insert(0, remainder);
            } else {
                hex.insert(0, (char) (remainder + 55));
            }
            input /= 16;
        }
        return hex.toString();
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Digite um valor inteiro positivo: ");
            Integer input = scanner.nextInt();

            clearScreen();

            if (input <= 0) {
                System.out.println("Valor invalido!");
            } else {

                String resultHex = intToHex(input);
                char c = (char) input.intValue();

                System.out.println("O valor em deciaml é: " + input.floatValue());
                System.out.println("O valor em hexadecimal é: " + resultHex);
                System.out.println("O valor em octal é: " + Integer.toOctalString(input));
                System.out.println("O valor em caracteres é: " + c);

            }
        }

    }
}