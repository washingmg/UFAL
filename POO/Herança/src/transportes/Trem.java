package Herança.src.transportes;

public class Trem extends Transporte {
    private int quantidadeDeVagoes;

    public Trem(String nome, String cor, String fabricante, int quantidadeDeVagoes) {
        super(nome, cor, fabricante); 
        this.quantidadeDeVagoes = quantidadeDeVagoes;
    }

    public int getQuantidadeDeVagoes() {
        return quantidadeDeVagoes;
    }

    public void setQuantidadeDeVagoes(int quantidadeDeVagoes) {
        this.quantidadeDeVagoes = quantidadeDeVagoes;
    }
    
    @Override
    public void acelerar() {
        System.out.println("Acelerando Trem...");
    }

    @Override
    public void desacelerar() {
        System.out.println("Desacelerando Trem...");
    }

    // Método para mostrar informações do trem (opcional)
    @Override
    public void mostrar() {
        super.mostrar(); 
        System.out.println("Quantidade de vagões: " + quantidadeDeVagoes);
    }
}

