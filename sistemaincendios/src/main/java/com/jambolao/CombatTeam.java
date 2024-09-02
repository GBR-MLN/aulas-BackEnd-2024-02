
package com.jambolao;

import java.util.Scanner;

public class CombatTeam {
    
    private int numberMembers;
    private Leader leader;
    private User members;
    private ParkAddres location;

    public CombatTeam(int numberMembers, Leader leader, User members, ParkAddres location) {
        this.numberMembers = numberMembers;
        this.leader = leader;
        this.members = members;
        this.location = location;
    }

    public void coletaDadosCombatTeam(Scanner scanner) {
            System.out.println("Digite o número de membros: ");
            numberMembers = scanner.nextInt();
        
        System.out.println("Numero de membros na equipe:" + numberMembers + "\nLider: " + leader.getIsAdmin() + leader.getTeam() + "\nMembro: " + members.getName() + members.getLastName() + "\nLocalização: " + location);
    }

}