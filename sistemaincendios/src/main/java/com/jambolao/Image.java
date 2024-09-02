package com.jambolao;

import java.time.LocalDate;
import java.util.Scanner;

public class Image {

    private String link;
    private LocalDate date;
    private String sateliteName;

    public Image(String link, LocalDate date, String sateliteName){
        this.link = link;
        this.date = date;
        this.sateliteName= sateliteName;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLink() {
        return link;
    }

    public String getSateliteName() {
        return sateliteName;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setSateliteName(String sateliteName) {
        this.sateliteName = sateliteName;
    }

    public void coletaDadosImage() {

        date = LocalDate.now();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("==========================");
            System.out.println("Digite o link da imagem: ");
            this.link = scanner.nextLine();

            System.out.println("==========================");
            System.out.println("Digite o nome do satélite que capturou a imagem: ");
            this.sateliteName = scanner.nextLine();
        }

        System.out.println(
            "Link img: " + link +
            "\nData: " + date +
            "\nSatelite: " + sateliteName
        );
    }
    
}
