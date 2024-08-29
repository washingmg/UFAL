import java.util.ArrayList;
import java.util.Iterator;

public class Agenda {

    public ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public void inserirPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    };

    public void removerPessoa(Pessoa pessoaRemover) {
        Iterator<Pessoa> iterator = pessoas.iterator();
        while (iterator.hasNext()) {
            Pessoa pessoa = iterator.next();
            if (pessoa.getEmail().equals(pessoaRemover.getEmail())) {
                iterator.remove();
                System.out.println(pessoa.getNome() + " foi removido!");
            }
        }
    }
    

    public void imprimirPessoas() {
        for (Pessoa pessoa : pessoas) {
            System.out.println("NOME: "+ pessoa.getNome() + " E-MAIL: " + pessoa.getEmail() + " TELFONE: " + pessoa.getTelefone());
        }
    }
}
