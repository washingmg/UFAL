package juntar;
import java.util.ArrayList;
import java.util.List;

public class Especialidade {
    private int id;
    private String nome;
    private List<Medico> medicos;

    public Especialidade(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.medicos = new ArrayList<>();  
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarMedico(Medico medico) {
        medicos.add(medico);
    }

    public List<Medico> listarMedicos() {
        return new ArrayList<>(medicos);  
    }

    public Medico escolherMedico(String nomeMedico) {
        for (Medico medico : medicos) {
            if (medico.getNome().equalsIgnoreCase(nomeMedico)) {
                return medico;  
            }
        }
        return null;
    }
}
