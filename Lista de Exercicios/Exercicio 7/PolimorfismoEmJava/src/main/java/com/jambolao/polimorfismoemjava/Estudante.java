package com.jambolao.polimorfismoemjava;

public class Estudante extends Pessoa{
    private String matricula;

    Estudante(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    String getMatricula() {
        return matricula;
    }

    void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    void mostrarMatricula() {
        System.out.println("Matrícula: " + matricula);
    }

    @Override
    void dizerOla() {
        System.out.println("Olá, sou estudante e meu nome é " + getNome());
    }
}