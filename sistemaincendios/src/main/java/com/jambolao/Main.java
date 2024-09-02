package com.jambolao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        User user = new User(null, null, null, null);
        Leader leader = new Leader(false, null);
        ParkAddres pa = new ParkAddres(null, null, null, null);
        CombatTeam ct = new CombatTeam(0, leader, user, pa);

        Scanner scanner = new Scanner(System.in);

        user.coletaDadosUser(scanner);
        leader.coletaDadosLeader(scanner);                
        pa.coletaDadosParkAddres(scanner);
        ct.coletaDadosCombatTeam(scanner);
    }
}