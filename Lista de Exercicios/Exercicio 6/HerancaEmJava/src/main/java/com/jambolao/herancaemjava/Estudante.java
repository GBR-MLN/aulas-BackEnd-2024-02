package com.jambolao.herancaemjava;

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
}
