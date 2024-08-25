package Herança.src.transportes;

public class Transporte {
    private String nome;
    private String cor;
    private String fabricante;

    // Construtor da classe Transporte
    public Transporte(String nome, String cor, String fabricante) {
        this.nome = nome;
        this.cor = cor;
        this.fabricante = fabricante;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void registrar() {
        System.out.println("Metodo genérico! Todos os meios de transportes devem ser registrados!"); 
    }

    public void acelerar() {
        System.out.println("Acelerando transporte...");
    }

    public void desacelerar() {
        System.out.println("Desacelerando transporte...");
    }

    public void herdar() {
        System.out.println("A classe que está instânciada está herdando de transporte mesmo sem ter esse método.");
    }
    // Método para mostrar informações do transporte
    public void mostrar() {
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);
        System.out.println("Fabricante: " + fabricante);
    }

}
