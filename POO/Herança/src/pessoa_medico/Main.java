package Herança.src.pessoa_medico;

public class Main {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("João Silva", 30);
        pessoa.mostrar();

        System.out.println();
        
        Medico medico = new Medico("Maria Oliveira", 45, 12345);
        medico.mostrar();
        medico.realizarCirurgia();

        System.out.println();

        //Como o tipo é Pessoa, só consegue acessar os métodos de Pessoa, mas o que é executado é a classe da instância
        Pessoa estagiario = new Medico("Maria Oliveira", 45, 12345);
        estagiario.mostrar();
        
    }
}

