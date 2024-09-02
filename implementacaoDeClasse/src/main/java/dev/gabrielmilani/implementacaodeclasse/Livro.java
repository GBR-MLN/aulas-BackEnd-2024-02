package dev.gabrielmilani.implementacaodeclasse;

public class Livro {

    private String title;
    private String autor;
    private String isbn;
    private Boolean disponibilidade;
   
    public Livro(String title, String autor, String isbn, Boolean disponibilidade){
        this.title = title;
        this.autor = autor;
        this.isbn = isbn;
        this.disponibilidade = true;
    }

    public String getAutor() {
        return autor;
    }

    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean isDisponibilidade(){
        return this.disponibilidade;
    }

    public void emprestar(){
        this.disponibilidade = false;
    }

    public void devolver(){
        this.disponibilidade = true;
    }
    
}
