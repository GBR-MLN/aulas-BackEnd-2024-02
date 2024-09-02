
package com.jambolao;

import java.util.Scanner;

public class ParkAddres{

    private String city;
    private String state;
    private String country;
    private String parkName;
    
    public ParkAddres(String city, String state, String country, String parkName) {
        
        this.city = city;
        this.state = state;
        this.country = country;
        this.parkName = parkName;

    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public void coletaDadosParkAddres(Scanner scanner) {

        scanner.nextLine();
            System.out.println("Digite o nome da cidade do incendio:");
            this.setCity(scanner.nextLine());

            System.out.println("Digite o nome do estado do incendio:");
            this.setState(scanner.nextLine());

            System.out.println("Digite o nome do país do incendio:");
            this.setCountry(scanner.nextLine());

            System.out.println("Digite o nome do parque afetado pelo incendio:");
            this.setParkName(scanner.nextLine());
        
    }
}
