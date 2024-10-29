package juntar;

import java.util.Date;

public class Paciente extends Pessoa {
    private String dataNascimento;
    private float peso;
    private float altura;
    private String genero;
    private String sintomas;
    private String endereco;


    public Paciente(int id, String nome, String telefone, String email, String cpf,
                    String dataNascimento, float peso, float altura, String genero, String sintomas, String endereco) {
        super(id, nome, telefone, email, cpf);
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.altura = altura;
        this.genero = genero;
        this.sintomas = sintomas;
        this.endereco = endereco;
    }

    public Agendamento solicitarAgendamento(Especialidade especialidade, String nomeMedico, Date dia, 
                                            String periodo, TipoPagamento pagamento, double valor) {
        Medico medico = especialidade.escolherMedico(nomeMedico);
        if (medico != null) {
            Agendamento agendamento = new Agendamento(1, medico, this, pagamento.toString(), dia.toString(), periodo, valor);
            agendamento.confirmarAgendamento();
            return agendamento;
        } else {
            System.out.println("Médico não encontrado para a especialidade " + especialidade.getNome());
            return null;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Data de Nascimento: " + dataNascimento + ", Peso: " + peso + 
               " kg, Altura: " + altura + " m, Gênero: " + genero + ", Sintomas: " + sintomas + 
               ", Endereço: " + endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do Paciente:");
        System.out.println("-----------------------------------------");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Email: " + getEmail());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Altura: " + getAltura() + " m");
        System.out.println("Gênero: " + getGenero());
        System.out.println("Sintomas: " + getSintomas());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("-----------------------------------------");
    }
}
