package dev.gabrielmilani.maosascompras;

import java.util.Timer;
import java.util.TimerTask;

public class MaosAsCompras {

    public static void main(String[] args) {
        
        Timer timer = new Timer();

        timer.schedule( new TimerTask() {
            public void run() {

                Caixa caixa = new Caixa(1, 0);
                
                caixa.criarClienteFila();
                caixa.adicionarClienteCaixa1();

                System.out.println("Tipo do cliente: "+ caixa.cliente.getTipo());
                
            }
        }, 0, 30*1000);

    }
}
