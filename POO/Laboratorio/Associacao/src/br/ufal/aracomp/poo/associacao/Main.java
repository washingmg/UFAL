package br.ufal.aracomp.poo.associacao;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Washington", "1234", "washing@gmail.com", "12344");
        Pessoa p2 = new Pessoa("Manoel", "1432", "mano@gmail.com", "12345");
        Pessoa p4 = new Pessoa("João", "1243", "joao@gmail.com", "12347");

        Agenda agenda = new Agenda();
        agenda.inserirPessoa(p1);
        agenda.inserirPessoa(p2);
        agenda.inserirPessoa(new Pessoa("Júlia", "1342", "ju@gmail.com", "12346"));
        agenda.inserirPessoa(p4);
        agenda.inserirPessoa(new Pessoa("Chaves", "4512", "mano@gmail.com", "12348"));

        // agenda.imprimirPessoas();

        agenda.removerPessoa(p2);
        agenda.imprimirPessoas();
    }
}

