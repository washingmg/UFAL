import java.util.Random;

public class ArrayGenerator {

    /**
     * Gera um array de inteiros aleatórios.
     * @param n O tamanho do array.
     * @return Um array com 'n' inteiros aleatórios.
     */
    public static int[] generateRandomArray(int n) {
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100000); // Números entre 0 e 99999
        }
        return arr;
    }
}
