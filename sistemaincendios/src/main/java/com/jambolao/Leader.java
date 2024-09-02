package com.jambolao;

import java.util.Scanner;

public class Leader {

    private boolean isAdmin;
    private String team;

    public Leader(boolean isAdmin, String team) {
        this.isAdmin = isAdmin;
        this.team = team;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public String getTeam() {
        return team;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void coletaDadosLeader(Scanner scanner) {

        System.out.println("=======================");
        System.out.println("O lider é um admin?");
        System.out.println("1: Sim");
        System.out.println("2: Não");

        int inputIsAdmin = scanner.nextInt();
        System.out.println("=======================");

        if (inputIsAdmin == 1) {
            this.isAdmin = true;
        } else {
            this.isAdmin = false;
        }

        System.out.println("=======================");
        System.out.println("Digite o nome da equipe:");

        this.team = scanner.nextLine();
        System.out.println("=======================");

        System.out.println(
                "É admin: " + isAdmin +
                        "\nEquipe: " + team);

    }
}
