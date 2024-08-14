package Aula;

public class Pessoa {
    String nome;
    int cpf;
    float altura;

    Pessoa() { //Valores padrão
        this.nome = "Sem nome";
        this.cpf = -1;
        this.altura = -1f;
    }

    Pessoa(String nome, int cpf, float altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.altura = altura;
    }

    void falar(String fala) {
        System.out.println(fala);
    }

    void aprensetarSe() {
        String frase = "Oi, sou " + this.nome;
        if (this.altura > 2) frase += " e sou gigante!";
        else frase += " e tenho altura mediana";
        falar(frase);
    }
}
