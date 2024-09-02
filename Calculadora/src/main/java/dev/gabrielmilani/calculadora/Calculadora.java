package dev.gabrielmilani.calculadora;

import java.util.Scanner;

public class Calculadora extends CalculadoraMetodos {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {

        try (Scanner operacaoInput = new Scanner(System.in)) {
            System.out.println("==========================");
            System.out.println("Qual operação você quer:");
            System.out.println("1: Adição");
            System.out.println("2: Subtração");
            System.out.println("3: Multiplicação");
            System.out.println("4: Divisão");
            System.out.println("5: Resto da divisão dos números");
            System.out.println("6: Fatorial dos números");
            System.out.println("==========================");

            int operacao = operacaoInput.nextInt();

            switch (operacao) {
                case 1:

                    clearScreen();
                    CalculadoraMetodos.addNums(num1, num2);
                    break;

                case 2:

                    CalculadoraMetodos.subNums(num1, num2);
                    break;

                case 3:

                    CalculadoraMetodos.multNums(num1, num2);
                    break;

                case 4:

                    CalculadoraMetodos.divNums(num1, num2);
                    break;

                case 5:

                    CalculadoraMetodos.restNums(num1, num2);
                    break;

                case 6:

                    CalculadoraMetodos.fatNums(num1, num2);
                    break;

                default:
                    System.out.println("Operação inválida");
                    break;
            }
        }

    }
}
