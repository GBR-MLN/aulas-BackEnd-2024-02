package dev.gabrielmilani.maosascompras;

import java.util.LinkedList;

public class Cliente {

    private int tipo;
    private LinkedList<Produto> cesta;

    Cliente(int tipo, LinkedList<Produto> cesta) {
        this.tipo = tipo;
        this.cesta = cesta;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public LinkedList<Produto> getCesta() {
        return cesta;
    }
    
    public void setCesta(LinkedList<Produto> cesta) {
        this.cesta = cesta;
    }
}
