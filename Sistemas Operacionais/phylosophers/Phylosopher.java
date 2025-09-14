package phylosophers;
import java.util.concurrent.Semaphore;

public class Phylosopher extends Thread{
    private int id;
    private Semaphore hashiEsquerdo;
    private Semaphore hashiDireito;

    public Phylosopher(int id, Semaphore hashiEsquerdo, Semaphore hashiDireito) {
        this.id = id;
        this.hashiEsquerdo = hashiEsquerdo;
        this.hashiDireito = hashiDireito;
    }

    private void think() throws InterruptedException {
        System.out.println("Filósofo " + id + " está pensando...");
        Thread.sleep((int)(Math.random() * 2000));
    }

    private void eat() throws InterruptedException {
        System.out.println("Filósofo " + id + " está comendo!");
        Thread.sleep((int)(Math.random() * 2000));
    }

    @Override
    public void run() {
        try {
            while (true) {
                think();

                // Tenta pegar os hashis
                hashiEsquerdo.acquire();
                System.out.println("Filósofo " + id + " pegou o hashi ESQUERDO.");
                
                hashiDireito.acquire();
                System.out.println("Filósofo " + id + " pegou o hashi DIREITO.");

                // Come
                eat();

                // Devolve os hashis
                hashiEsquerdo.release();
                System.out.println("Filósofo " + id + " largou o hashi ESQUERDO.");

                hashiDireito.release();
                System.out.println("Filósofo " + id + " largou o hashi DIREITO.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
