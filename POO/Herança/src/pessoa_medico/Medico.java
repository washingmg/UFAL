package Herança.src.pessoa_medico;

public class Medico extends Pessoa {
    private int matricula;

    public Medico(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // Método específico da classe Medico
    public void realizarCirurgia() {
        System.out.println("Realizando cirurgia...");
    }
    
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Matrícula: " + getMatricula() + " é um médico.");
    }
}
