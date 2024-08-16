package Encapsulamento.src.aula2.poo.pacote1;

public class Carro {
    protected String placa;
    private String modelo;
    private String marca;
    private Motorista motorista;

    public Carro() {
        // Não faz nada, padrão
    }

    public Carro(String placa, String modelo, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.motorista = null;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Motorista getMotorista() {
        return this.motorista;
    }

    public void mostrar() {
        System.out.println("Carro: " + marca + " " + modelo + ", Placa: " + placa);
        if (motorista != null) {
            System.out.println("Motorista: " + motorista.getNome());
        } else {
            System.out.println("Sem motorista");
        }
        System.out.println();
    }
}
