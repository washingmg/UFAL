package juntar;

import java.util.Random;
import java.util.Scanner;

class Boleto extends TipoPagamento {
    private String codigoBarras;

    Scanner sc = new Scanner(System.in);

    public Boleto(double valor, String codigoBarras) {
        super(valor);
        this.codigoBarras = codigoBarras;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public boolean processarPagamento(double valor) {
        while (true) {
            System.out.println("Digite o código do boleto para pagamento: ");
            String codigofornecido = sc.nextLine();

            if (codigofornecido.equals(codigoBarras)) {
                System.out.println("Pagamento de R$ " + valor + " realizado.");
                sc.close();
                return true;
            } else {
                System.out.println("Código inválido. Tente novamente.");
            }
        }
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

    public String gerarBoleto() {
        Random random = new Random();
        StringBuilder codigoBarras = new StringBuilder();

        for (int i = 0; i < 13; i++) {
            int digito = random.nextInt(10);
            codigoBarras.append(digito);
        }

        System.out.println("Código de barras gerado: " + codigoBarras);
        return "";
    }
}
