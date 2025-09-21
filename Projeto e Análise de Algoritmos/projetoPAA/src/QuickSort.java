public class QuickSort {

    // Classe interna para permitir a passagem do contador por referência.
    static class Counter {
        long count = 0;
    }

    /**
     * Função principal que inicia o algoritmo Quick Sort e retorna o número de comparações.
     *
     * @param arr O array a ser ordenado.
     * @return O número total de comparações realizadas.
     */
    public static long sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        Counter comparisons = new Counter();
        quickSortRecursive(arr, 0, arr.length - 1, comparisons);
        return comparisons.count;
    }

    /**
     * Função recursiva que implementa a lógica do Quick Sort.
     */
    private static void quickSortRecursive(int[] arr, int low, int high, Counter comparisons) {
        if (low < high) {
            int pi = partition(arr, low, high, comparisons);

            quickSortRecursive(arr, low, pi - 1, comparisons);
            quickSortRecursive(arr, pi + 1, high, comparisons);
        }
    }

    /**
     * Particiona o array e coloca o pivô na posição correta.
     */
    private static int partition(int[] arr, int low, int high, Counter comparisons) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            comparisons.count++;
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    // Função utilitária para troca de elementos
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
