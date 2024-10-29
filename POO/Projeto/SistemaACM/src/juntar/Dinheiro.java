package juntar;

import java.util.Scanner;

class Dinheiro extends TipoPagamento {
    private double quantidade;

    Scanner sc = new Scanner(System.in);

    public Dinheiro(double valor, double quantidade) {
        super(valor);
        this.quantidade = quantidade;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Digite o valor que irá utilizar no pagamento: ");
        quantidade = sc.nextDouble();

        if (quantidade >= valor) {
            quantidade -= valor;
            System.out.println("Pagamento de R$ " + valor + " realizado.");
            return true;
        }
        System.out.println("Saldo insuficiente para o pagamento.");
        return false;
    }

    @Override
    public boolean reembolso(double valor) {
        quantidade += valor;
        System.out.println("Reembolso de R$ " + valor + " realizado.");
        return true;
    }

    @Override
    public boolean cancelarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " cancelado.");
        return true;
    }

    public double verificarTroco(double valorPago, double valorConsulta) {
        return valorPago - valorConsulta;
    }
}
