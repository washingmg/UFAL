package juntar;

import java.util.Scanner;

class Pix extends TipoPagamento {
    private String chavePix = "0987654321";
    public String chaveInserida;

    Scanner sc = new Scanner(System.in);

    public Pix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public boolean processarPagamento(double valor) {
        while (true) {
            System.out.println("Insira chave Pix: ");
            chaveInserida = sc.nextLine();

            if (verificarChave()) {
                System.out.println("Pagamento de R$ " + valor + " processado.");
                sc.close();
                return true;
            } else {
                System.out.println("Chave Pix inválida. Tente novamente.");
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

    public boolean verificarChave() {
        return chavePix.equals(chaveInserida);
    }
}
