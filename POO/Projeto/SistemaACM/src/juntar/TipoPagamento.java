package juntar;

abstract class TipoPagamento implements IPagamento {
    protected double valor;

    public TipoPagamento(double valor) {
        this.valor = valor;
    }

    @Override
    public abstract boolean processarPagamento(double valor);

    @Override
    public abstract boolean reembolso(double valor);

    @Override
    public abstract boolean cancelarPagamento(double valor);

    @Override
    public double calcularJuros(double valor, double taxa, int meses) {
        return valor * Math.pow((1 + taxa), meses) - valor;
    }
}