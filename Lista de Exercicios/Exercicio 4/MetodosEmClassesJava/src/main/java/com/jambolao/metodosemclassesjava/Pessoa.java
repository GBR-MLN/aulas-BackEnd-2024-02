package com.jambolao.metodosemclassesjava;

public class Pessoa {
    String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }

    void dizerOla() {
        System.out.println("Olá, meu nome é " + nome);
    }
}
