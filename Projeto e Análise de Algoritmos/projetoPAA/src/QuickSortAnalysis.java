public class QuickSortAnalysis {

    public static void main(String[] args) {
        int[] nValues = {100, 500, 1000, 5000, 10000, 20000, 50000, 100000, 1000000, 99999999};

        System.out.println("### Tabela de Desempenho do Quick Sort Recursivo (Java)\n");
        System.out.println("| Tamanho da Entrada (n) | Tempo (ms) | Comparações | Memória (bytes)|");
        System.out.println("|------------------------|------------|-------------|----------------|");

        for (int n : nValues) {
            int[] testArray = ArrayGenerator.generateRandomArray(n);

            
            long startTime = System.nanoTime();
            long numComparisons = QuickSort.sort(testArray);
            long endTime = System.nanoTime();
            
            // Memória aproximada usada pelo array (cada int = 4 bytes)
            long memoryUsed = testArray.length * Integer.BYTES;
            
            // Imprime arrays gerados aleatóriamente
            // {
            //     System.out.println("\nArray original (" + n + " elementos):");
            //     printArray(testArray);
            //     System.out.println();
            // }

            // Imprime array ordenado 
            // {
            //     System.out.println("Array ordenado (" + n + " elementos):");
            //     printArray(testArray);
            //     System.out.println();
            // }

            double executionTimeMs = (endTime - startTime) / 1_000_000.0;

            System.out.printf("| %-22d | %-10.4f | %-11d | %-14d |\n",
                    n, executionTimeMs, numComparisons, memoryUsed);
        }
    }

    // Função utilitária para imprimir arrays
    // private static void printArray(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }
}
