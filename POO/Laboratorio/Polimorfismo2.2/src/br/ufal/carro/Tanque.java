package br.ufal.carro;

public class Tanque {
    private int capacidade;
    private int quantidadePresente;

    public Tanque(int capacidade) {
        this.capacidade = capacidade;
        this.quantidadePresente = 0;
    }

    public void abastecer(int quantidade) {
        if (quantidade + this.getQuantidadePresente() <= this.capacidade) {
            this.quantidadePresente += quantidade;
            System.out.println("Abastecendo " + quantidade + " litros. Combustível presente: " + this.getQuantidadePresente() + " litros.");
        } else {
            System.out.println("Não é possível abastecer. Quantidade além da capacidade do tanque.");
        }
    }

    public int usarCombustivel(int quantidade) {
        if (this.getQuantidadePresente() >= quantidade) {
            this.quantidadePresente -= quantidade;
            return quantidade;
        } else {
            int quantidadeUsada = this.quantidadePresente;
            this.quantidadePresente = 0;
            return quantidadeUsada;
        }
    }

    public int getQuantidadePresente() {
        return quantidadePresente;
    }
}
