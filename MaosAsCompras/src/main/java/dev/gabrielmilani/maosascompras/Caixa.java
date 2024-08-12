package dev.gabrielmilani.maosascompras;

import java.util.LinkedList;
import java.util.Random;

public class Caixa {

    private int id;
    private int fila;

    Caixa(int id, int fila){
        this.id = id;
        this.fila = fila;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int randomNumber;
    private LinkedList<Integer> caixa1 = new LinkedList<>();
    private LinkedList<Integer> caixa2 = new LinkedList<>();
    Cliente cliente;

    Random random = new Random();

    public void criarClienteFila() {
        randomNumber = random.nextInt(4) + 1;

        if (randomNumber == 1) {
            cliente = new Cliente(1);
        } else if (randomNumber == 2) {
            cliente = new Cliente(2);
        } else if (randomNumber == 3) {
            cliente = new Cliente(1);
        } else if (randomNumber == 4) {
            cliente = new Cliente(2);
        } else {
            cliente = new Cliente(1);
        }

        return;
    }

    public void adicionarClienteCaixa1() {
        criarClienteFila();
        caixa1.add(cliente.getTipo());
    }

    public void adicionarClienteCaixa2() {
        criarClienteFila();
        caixa2.add(cliente.getTipo());
    }

    public LinkedList<Integer> getLinkedList1() {
        return caixa1;
    }

    public LinkedList<Integer> getLinkedList2() {
        return caixa2;
    }
    
}
