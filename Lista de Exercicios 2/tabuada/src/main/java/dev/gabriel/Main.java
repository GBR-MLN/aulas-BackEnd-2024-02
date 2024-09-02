package dev.gabriel;

import java.util.Scanner;

public class Main {

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite uma frase:");
            String frase = input.toString();

            clearScreen();

            

        }
    }
}