package dev.gabrielmilani.implementacaodeclasse;

public class Revista extends Livro{

    private int edicao;
    private String mesPublicado;

    public Revista(String title, String autor, String isbn, Boolean disponibilidade, int edicao, String mesPublicado) {
        super(title, autor, isbn, disponibilidade);
        this.edicao = edicao;
        this.mesPublicado = mesPublicado;
    }

    public int getEdicao() {
        return edicao;
    }

    public String getMesPublicado() {
        return mesPublicado;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public void setMesPublicado(String mesPublicado) {
        this.mesPublicado = mesPublicado;
    }
    
}
