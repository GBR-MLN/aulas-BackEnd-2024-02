
package com.jambolao;

import java.util.Scanner;

class SensorRead extends Sensor {
    private String value;
    private String date;

    public SensorRead(float latitude, float longitude, String status, String name, String value, String date) {
        super(latitude, longitude, status, name);
        this.value = value;
        this.date = date;
    }

    public void dadosSensorRead() {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite o valor da leitura do sensor:");
            value = input.next();
            input.nextLine();
            System.out.println("Digite a data da leitura do sensor (formato: yyyy-MM-ddTHH:mm:ss.SSSSSS):");
            date = input.nextLine();
            System.out.println("Digite o nome do sensor:");
            name = input.nextLine();
            System.out.println("Digite o status do sensor:");
            status = input.nextLine();
            System.out.println("Digite a latitude do sensor:");
            latitude = input.nextFloat();
            System.out.println("Digite a longitude do sensor:");
            longitude = input.nextFloat();
        }

            System.out.println("SensorRead [value=" + value + ", date=" + date + ", " + super.toString() + "]");
    }

}
