package Calcula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operacao operacao = null;
        String letra = "";

        System.out.println("Digite A para realizar a adição");
        System.out.println("Digite S para realizar a subtração");
        System.out.println("Digite M para realizar a multiplicação");
        System.out.println("Digite D para realizar a divisão");
        System.out.println("Digite 0 (zero) para SAIR");

        while (!letra.equals("0")) {
            System.out.print("Escolha a operação: ");

            letra = scanner.next().toUpperCase();

            if (!letra.matches("[ASMD0]")) { 
                System.out.println("Operação inválida!");
                continue;
            }
            
            if (!letra.equals("0")) {
                System.out.print("Digite o primeiro número: ");
                float num1 = scanner.nextFloat();
                System.out.print("Digite o segundo número: ");
                float num2 = scanner.nextFloat();
                scanner.nextLine();

                switch (letra) {
                    case "A":
                        operacao = new Adicao();
                        break;
                    case "S":
                        operacao = new Subtracao();
                        break;
                    case "M":
                        operacao = new Multiplicacao();
                        break;
                    case "D":
                        operacao = new Divisao();
                        break;
                }
                operacao.calcular(num1, num2);
            }
        }
        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
