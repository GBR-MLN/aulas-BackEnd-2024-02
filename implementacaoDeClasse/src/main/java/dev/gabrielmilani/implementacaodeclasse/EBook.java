package dev.gabrielmilani.implementacaodeclasse;

public class EBook extends Livro{

    private Double tamanhoArquivo;
    private String formato;

    public EBook(String title, String autor, String isbn, Boolean disponibilidade, Double tamanhoArquivo, String formato) {
        super(title, autor, isbn, disponibilidade);
        this.tamanhoArquivo = tamanhoArquivo;
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public Double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setTamanhoArquivo(Double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }
    
}
