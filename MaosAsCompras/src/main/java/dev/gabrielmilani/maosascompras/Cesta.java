package dev.gabrielmilani.maosascompras;

import java.util.LinkedList;
import java.util.Random;

public class Cesta {

    private LinkedList<Produto> cesta1 = new LinkedList<>();
    private LinkedList<Produto> cesta2 = new LinkedList<>();
    private LinkedList<Produto> cesta3 = new LinkedList<>();

    private int randomnumber;

    Random random = new Random();

    Produto produto1 = new Produto("Arroz", 14.99, 1.00);
    Produto produto2 = new Produto("Feijão", 17.99, 1.00);
    Produto produto3 = new Produto("Macarrão", 10.00, 0.50);
    Produto produto4 = new Produto("Chocolate", 7.49, 0.45);

    public void adicionarProduto(Produto produto) {
        randomnumber = random.nextInt(4) + 1;

        if (randomnumber == 1) {
            cesta1.add(produto);
            cesta2.add(produto);
            cesta3.add(produto);
        } else if (randomnumber == 2) {
            cesta2.add(produto);
            cesta2.add(produto);
            cesta3.add(produto);
        } else if (randomnumber == 3) {
            cesta3.add(produto);
            cesta2.add(produto);
            cesta3.add(produto);
        } else {
            cesta1.add(produto);
            cesta2.add(produto);
            cesta3.add(produto);
        }
    }

    public LinkedList<Produto> getCesta1() {
        return cesta1;
    }

    public LinkedList<Produto> getCesta2() {
        return cesta2;
    }

    public LinkedList<Produto> getCesta3() {
        return cesta3;
    }

    public LinkedList<Produto> getProdutos() {
        LinkedList<Produto> produtos = new LinkedList<>();
        produtos.addAll(cesta1);
        produtos.addAll(cesta2);
        produtos.addAll(cesta3);
        return produtos;
    }
    
}
