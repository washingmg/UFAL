public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Washington", "1234", "washing@gmail.com", "12344");
        Pessoa p2 = new Pessoa("Manoel", "1432", "mano@gmail.com", "12345");
        Pessoa p3 = new Pessoa("Júlia", "1342", "ju@gmail.com", "12346");
        Pessoa p4 = new Pessoa("João", "1243", "joao@gmail.com", "12347");
        Pessoa p5 = new Pessoa("Chaves", "4512", "ju@gmail.com", "12348");

        Agenda agenda = new Agenda();
        agenda.inserirPessoa(p1);
        agenda.inserirPessoa(p2);
        agenda.inserirPessoa(p3);
        agenda.inserirPessoa(p4);
        agenda.inserirPessoa(p5);

        agenda.removerPessoa(p3);
        
        agenda.imprimirPessoas();
    }
}

// Associação: Vira atributo
