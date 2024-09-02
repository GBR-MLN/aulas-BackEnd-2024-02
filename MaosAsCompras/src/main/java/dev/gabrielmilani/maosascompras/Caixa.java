package dev.gabrielmilani.maosascompras;

import java.util.LinkedList;
import java.util.Random;

public class Caixa {

    private int id;
    private int fila;

    Caixa(int id, int fila) {
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
    private LinkedList<Cliente> caixa1 = new LinkedList<>();
    private LinkedList<Cliente> caixa2 = new LinkedList<>();

    Random random = new Random();
    Cliente cliente;
    Cesta cesta;
    Produto produto;

    public void criarClienteFila(Cesta cesta1, Cesta cesta2, Cesta cesta3) {
        randomNumber = random.nextInt(6) + 1;

        if (randomNumber == 1) {
            cliente = new Cliente(1, cesta1.getCesta1());
        } else if (randomNumber == 2) {
            cliente = new Cliente(2, cesta2.getCesta2());
        } else if (randomNumber == 3) {
            cliente = new Cliente(1, cesta3.getCesta3());
        } else if (randomNumber == 4) {
            cliente = new Cliente(2, cesta1.getCesta1());
        } else if (randomNumber == 5) {
            cliente = new Cliente(1, cesta2.getCesta2());
        } else if (randomNumber == 6) {
            cliente = new Cliente(2, cesta3.getCesta3());
        }

        adicionarClienteCaixa(cliente);
    }

    public void adicionarClienteCaixa(Cliente cliente) {
        criarClienteFila(cesta, cesta, cesta);
        if (cliente.getTipo() == 1) {
            caixa1.add(cliente);
        } else if (cliente.getTipo() == 2) {
            caixa2.add(cliente);
        }
    }

    public int getCaixa1Size() {
        return caixa1.size();
    }

    public int getCaixa2Size() {
        return caixa2.size();
    }

    public String getProdutosClientesCaixa1() {

        StringBuilder produtos = new StringBuilder();

        for (Cliente cliente : caixa1) {
            produtos.append("Cliente ").append(cliente.getTipo()).append(": ");
            for (Produto produto : cesta.getProdutos()) {
                produtos.append(produto.getNome()).append(",");
            }
            produtos.setLength(produtos.length() - 2);
            produtos.append("\n");
        }
        return produtos.toString();
    }
}
