package Encapsulamento.src.aula.poo;

public class Carro {
    private String placa;
    private String modelo;
    private String marca;

    public String getPlaca() {
        return this.placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    private String getMarca() {
        return this.marca;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        if (marca.length() > 1) {
            this.marca = marca;
        }
    }
    public void mostrar(){
        System.out.println("Placa = " +this.getPlaca());
        System.out.println("Marca = "+this.getMarca());
        System.out.println("Modelo = "+this.getModelo());
    }
}
