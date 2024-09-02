package dev.gabrielmilani.calculadora;

import java.util.Scanner;

public class CalculadoraMetodos {

    static double num1;
    static double num2;

    public static void addNums(double num12, double num22) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("==========================");
            System.out.println("Digite o primeiro valor:");

            num1 = scanner.nextDouble();

            System.out.println("==========================");
            System.out.println("Digite o segundo valor:");

            num2 = scanner.nextDouble();

        } catch (Exception e) {

            System.out.println("Valor inválido");

        } finally {

            System.out.println("==========================");
            System.out.println("SOMA DOS DOIS NÚMEROS");
            System.out.println(num1 + num2);
            System.out.println("==========================");
            
        }
    }

    public static void subNums(double num12, double num22) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("==========================");
            System.out.println("Digite o primeiro valor:");

            num1 = scanner.nextDouble();

            System.out.println("==========================");
            System.out.println("Digite o segundo valor:");

            num2 = scanner.nextDouble();
        } catch (Exception e) {

            System.out.println("Valor inválido");

        } finally {

            System.out.println("==========================");
            System.out.println("SUBTRAÇÃO DOS DOIS NÚMEROS");
            System.out.println(num1 - num2);
            System.out.println("==========================");

        }
    }

    public static void multNums(double num12, double num22) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("Digite o primeiro valor:");

        num1 = scanner.nextDouble();

        System.out.println("==========================");
        System.out.println("Digite o segundo valor:");

        num2 = scanner.nextDouble();

        System.out.println("==========================");
        System.out.println("MULTIPLICAÇÃO DOS DOIS NÚMEROS");
        System.out.println(num1 * num2);
        System.out.println("==========================");
    }

    public static void divNums(double num12, double num22) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("==========================");
            System.out.println("Digite o primeiro valor:");

            num1 = scanner.nextDouble();

            System.out.println("==========================");
            System.out.println("Digite o segundo valor:");

            num2 = scanner.nextDouble();
        }

        if (num2 == 0) {
            System.out.println("Impossivel dividir por zero");
        } else {
            System.out.println("==========================");
            System.out.println("DIVISÃO DOS DOIS NÚMEROS");
            System.out.println(num1 / num2);
            System.out.println("==========================");
        }

    }

    public static void restNums(double num12, double num22) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("==========================");
            System.out.println("Digite o primeiro valor:");

            num1 = scanner.nextDouble();

            System.out.println("==========================");
            System.out.println("Digite o segundo valor:");

            num2 = scanner.nextDouble();
        }

        System.out.println("==========================");
        System.out.println("RESTO DA DIVISÃO DOS DOIS NÚMEROS");
        System.out.println(num1 % num2);
        System.out.println("==========================");
    }

    public static void fatNums(double num12, double num22) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("==========================");
            System.out.println("Digite o primeiro valor:");

            num1 = scanner.nextDouble();

            System.out.println("==========================");
            System.out.println("Digite o segundo valor:");

            num2 = scanner.nextDouble();
        }

        int fatorial = 1;
        System.out.println("==========================");

        for (int i = 1; i <= num1; i++) {
            fatorial = i * fatorial;
        }

        System.out.println("FATORIAL DO PRIMEIRO NÚMERO");
        System.out.println(fatorial);

        fatorial = 1;
        for (int i = 1; i <= num2; i++) {
            fatorial = i * fatorial;
        }
        System.out.println("==========================");

        System.out.println("FATORIAL DO SEGUNDO NÚMERO");
        System.out.println(fatorial);

        System.out.println("==========================");
        System.out.println("==========================");
    }

}