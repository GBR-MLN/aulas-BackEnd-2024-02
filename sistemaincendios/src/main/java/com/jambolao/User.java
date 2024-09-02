package com.jambolao;

import java.util.Scanner;

public class User {
    
    private String name;
    private String lastName;
    private String email;
    private String password;

    public User(String name, String lastName, String email, String password){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void coletaDadosUser(Scanner scanner) {
        
            System.out.println("=========================");
            System.out.println("Digite seu primeiro nome:");

            name = scanner.nextLine();

            System.out.println("=========================");
            System.out.println("Digite seu ultimo nome:");

            lastName = scanner.nextLine();

            System.out.println("=========================");
            System.out.println("Digite seu email:");

            email = scanner.nextLine();

            System.out.println("=========================");
            System.out.println("Digite sua senha:");

            password = scanner.nextLine();        

        System.out.println(
            "Nome: " + name + " " + lastName +
            "\nEmail: " + email +
            "\nSenha: " + password
        );
    }

}
