package Aula;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        // p1.nome = "Juca";
        p1.cpf = 12345;
        // p1.altura = 1.7f;
        
        p1.falar("Opa meu chapa!");
        p1.aprensetarSe();

        Pessoa p2 = new Pessoa();

        p2.nome = "LeBron James";
        p2.cpf = 1233445;
        p2.altura = 2.10f;
        
        p2.falar("\nChama!");
        p2.aprensetarSe();

        Pessoa p3 = new Pessoa("Washintgon", 0001, 1.68f);

        p3.falar("\nOLá");
        p3.aprensetarSe();
        
        System.out.println();
        System.out.println(p1);
        System.out.println(p2.nome);
    }
}
