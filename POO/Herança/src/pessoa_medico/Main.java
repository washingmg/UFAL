package Herança.src.pessoa_medico;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Medico("W", 19, 1234);
        Pessoa pessoa2 = new Pessoa("Juca", 40);

        pessoa1.mostrar();  // Devido ao polimorfismo, chama o método `mostrar` de `Medico`.
        pessoa2.mostrar();  // Chama o método `mostrar` de `Pessoa`.
    }
}
