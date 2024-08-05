package com.jambolao.classesabstratas;

public class ClassesAbstratas {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        
        cachorro.fazerSom();
        gato.fazerSom();
    }
}
