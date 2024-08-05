package com.jambolao.polimorfismoemjava;

public class Pessoa {
    private String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void dizerOla() {
        System.out.println("Olá, meu nome é " + nome);
    }
}
