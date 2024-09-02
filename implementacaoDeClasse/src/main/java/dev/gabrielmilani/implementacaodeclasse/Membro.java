package dev.gabrielmilani.implementacaodeclasse;

import java.util.List;

public class Membro extends Livro {

    private String nome;
    private int id;
    private List<Livro> livrosEmprestados;

    public Membro(String title, String autor, String isbn, Boolean disponibilidade, String nome, int id) {
        super(title, autor, isbn, disponibilidade);
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void emprestarLivro() {
        if (getDisponibilidade() == true) {
            setDisponibilidade(false);
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro não está disponível!");
        }
    }

    public void devolverLivro() {
        if (getDisponibilidade() == false) {
            setDisponibilidade(true);
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Livro já está disponível!");
        }
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

}
