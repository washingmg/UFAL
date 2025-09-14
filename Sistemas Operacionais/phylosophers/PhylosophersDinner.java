package phylosophers;
import java.util.concurrent.Semaphore;

public class PhylosophersDinner {
    public static void main(String[] args) {
        int N = 5; // número de filósofos
        Semaphore[] hashis = new Semaphore[N];

        // Inicializa cada hashi como disponível (1 = livre)
        for (int i = 0; i < N; i++) {
            hashis[i] = new Semaphore(1);
        }

        Phylosopher[] filosofos = new Phylosopher[N];
        for (int i = 0; i < N; i++) {
            Semaphore hashiEsq = hashis[i];
            Semaphore hashiDir = hashis[(i + 1) % N];

            // Estratégia simples para evitar deadlock:
            // O último filósofo pega os hashis na ordem invertida
            if (i == N - 1) {
                filosofos[i] = new Phylosopher(i, hashiDir, hashiEsq);
            } else {
                filosofos[i] = new Phylosopher(i, hashiEsq, hashiDir);
            }

            filosofos[i].start();
        }
    }
}
