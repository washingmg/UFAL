package juntar;

interface IPagamento {
    boolean processarPagamento(double valor);
    boolean reembolso(double valor);
    boolean cancelarPagamento(double valor);
    double calcularJuros(double valor, double taxa, int meses);
}
