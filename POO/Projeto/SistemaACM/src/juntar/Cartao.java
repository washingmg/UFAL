package juntar;

import java.util.Scanner;

class Cartao extends TipoPagamento {
    private String numeroCartao;
    private String validade;
    private String cvv;

    Scanner sc = new Scanner(System.in);

    public Cartao(double valor, String numeroCartao, String validade, String cvv) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.validade = validade;
        this.cvv = cvv;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public boolean verificarCartao() {
        while (true) {
            System.out.println("Digite o numero de cartão: ");
            numeroCartao = sc.nextLine();

            System.out.println("Digite o CVV: ");
            cvv = sc.nextLine();

            if (numeroCartao.length() == 16 && cvv.length() == 3) {
                System.out.println("Cartão verificado com sucesso.");
                sc.close();
                return true;
            } else {
                System.out.println("Número do cartão ou CVV inválido. Tente novamente.");
            }
        }
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (verificarCartao()) {
            System.out.println("Pagamento de R$ " + valor + " processado.");
            return true;
        }
        return false;
    }

    @Override
    public boolean reembolso(double valor) {
        System.out.println("Reembolso de R$ " + valor + " realizado.");
        return true;
    }

    @Override
    public boolean cancelarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " cancelado.");
        return true;
    }
}

