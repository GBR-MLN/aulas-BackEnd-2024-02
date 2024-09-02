package dev.gabrielmilani.implementacaodeclasse;

import java.util.Date;

public class Emprestimo {
    private Livro livro;
    private Membro membro;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo(Livro livro, Membro membro, Date dataEmprestimo, Date dataDevolucao){
        this.livro = livro;
        this.membro = membro;
        this.dataDevolucao = dataDevolucao;
        this.dataEmprestimo = dataEmprestimo;
    }

    public void registrarEmprestimo() {
        System.out.println("Emprestimo de Livro: " + livro.getTitle());
    }

    public void registrarDevolucao() {
        System.out.println("Devolucao de Livro: " + livro.getTitle());
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public Membro getMembro() {
        return membro;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }
}
