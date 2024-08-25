package Herança.src.transportes;

public class Carro extends Transporte {
    private int quantidadeDePortas;

    public Carro(String nome, String cor, String fabricante, int quantidadeDePortas) {
        super(nome, cor, fabricante); 
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando carro...");
    }
    
    @Override
    public void desacelerar() {
        System.out.println("Desacelerando carro...");
    }

    // Método para mostrar informações do carro (opcional)
    @Override
    public void mostrar() {
        super.mostrar(); 
        System.out.println("Quantidade de portas: " + quantidadeDePortas);
    }
}
