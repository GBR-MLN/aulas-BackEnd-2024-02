package dev.gabrielmilani.maosascompras;

import java.util.Timer;
import java.util.TimerTask;

public class MaosAsCompras {

    public static void main(String[] args) {
        
        Timer timer = new Timer();
        Caixa caixa1 = new Caixa(1, 0);
        // Caixa caixa2 = new Caixa(2, 0);

        timer.schedule( new TimerTask() {
            public void run() {
                
                caixa1.criarClienteFila(null, null, null);
                // caixa2.adicionarClienteCaixa();  

            }
        }, 0, 10*1000);

        timer.schedule( new TimerTask() {
            public void run() {
                System.out.println("Clientes e produtos caixa 1: " + caixa1.getProdutosClientesCaixa1());
                // System.out.println("Tamanho linha caixa 2: " + caixa1.getCaixa2Size());
            }
        }, 0, 10*1000);

    }
}
