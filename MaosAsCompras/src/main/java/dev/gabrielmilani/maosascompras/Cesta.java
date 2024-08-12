package dev.gabrielmilani.maosascompras;

import java.util.LinkedList;
import java.util.Random;

public class Cesta {

    private LinkedList<String> cesta1 = new LinkedList<>();
    private LinkedList<String> cesta2 = new LinkedList<>();
    private LinkedList<String> cesta3 = new LinkedList<>();

    private int randomnumber;

    Random random = new Random();

    Produto produto1 = new Produto("Arroz", 14.99, 1.00);
    Produto produto2 = new Produto("Feijão", 17.99, 1.00);
    Produto produto3 = new Produto("Macarrão", 10.00, 0.50);
    Produto produto4 = new Produto("Chocolate", 7.49, 0.45);

    public void adicionarProduto(Produto produto) {
        randomnumber = random.nextInt(4) + 1;

        if (randomnumber == 1) {
            cesta1.add(produto2.getNome());
        }
    }
    
}
