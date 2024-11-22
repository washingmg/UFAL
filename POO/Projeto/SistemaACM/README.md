# Sistema de Agendamento de Consultas Médicas (ACM)

Este projeto implementa um sistema de **agendamento de consultas médicas** utilizando conceitos de **Programação Orientada a Objetos (POO)** em **Java**. O sistema é modular e abrange funcionalidades como gerenciamento de médicos, pacientes, especialidades e agendamentos, garantindo um fluxo simples e eficiente para o agendamento de consultas.

## 📋 **Funcionalidades Principais**

1. **Cadastro de Médicos e Pacientes**  
   - Gerenciamento de médicos por especialidade.  
   - Cadastro de pacientes para agendamentos.

2. **Gerenciamento de Agendas**  
   - Controle de horários disponíveis para cada médico.  
   - Adição, verificação e reserva de horários.

3. **Agendamento de Consultas**  
   - Seleção de especialidade e médico.  
   - Escolha de data e horário.  
   - Confirmação e cancelamento de agendamentos.

## 🛠️ **Arquitetura do Projeto**

O projeto utiliza o padrão **MVC (Model-View-Controller)** para estruturar suas responsabilidades:

- **Model**: Representa a lógica de negócios, como as classes `Agendamento`, `Medico`, `Paciente`, `Especialidade`, e `Agenda`.  
- **View**: Responsável por apresentar informações para o usuário.  
- **Controller**: Gerencia a interação entre a `View` e o `Model`, processando entradas do usuário e atualizando os modelos.

### **Padrões de Projeto Implementados**

1. **Singleton**  
   - Garante que certas classes possuam apenas uma única instância no sistema.  
   - Exemplo: Classe de gerenciamento de configurações ou serviços compartilhados --> AgendamentoController.  

2. **State**  
   - Utilizado no controle de estados do médico (`Ativo`, `Inativo`).  
   - Permite que o comportamento de um médico seja alterado dinamicamente dependendo de seu estado.
   - Padrão implementado, mas n funcional no projeto.


O projeto está estruturado em classes representando os principais elementos do sistema.  

- **Classes Principais**  
  - `Pessoa`: Classe abstrata para generalizar atributos e métodos de pessoas.  
  - `Medico`: Extensão de `Pessoa`, representa os médicos do sistema.  
  - `Paciente`: Extensão de `Pessoa`, representa os pacientes.  
  - `Especialidade`: Gerencia especialidades médicas e médicos associados.  
  - `Agenda`: Controle de horários e disponibilidade por médico.  
  - `Agendamento`: Lida com a reserva e confirmação de consultas.  

- **Outras Classes**  
  - `Horario`: Define os horários de início e fim de consultas.  
  - `Disponibilidade`: Representa a ocupação de horários.
    
- **Interfaces**
  - `IAgenda`: Contrado de AgendarConsulta e CancelarConsulta (métodos)
  - `IEstadoMedico`: contrado de EstadoMedicoAtivo e EstadoMedicoInativo (classes)

## 🔄 **Fluxo do Sistema**

1. Paciente solicita um agendamento.  
2. Seleciona o médico disponível.  
3. Escolhe a especialidade médica.  
4. Verifica a agenda do médico para um horário conveniente.    
5. Recebe a confirmação e os detalhes da consulta.  

## 💡 **Conceitos de POO Utilizados**

- **Encapsulamento**: Uso de getters e setters para controle de acesso aos atributos.  
- **Herança**: Classe `Pessoa` como base para `Medico` e `Paciente`.  
- **Polimorfismo**: Métodos que se comportam de forma específica em subclasses.  
- **Composição**: Relação entre classes como `Agenda`, `Medico`, e `Especialidade`.

## 🖥️ **Tecnologias Utilizadas**

- Linguagem: **Java**  
- IDE: Qualquer IDE compatível com projetos Java, como **IntelliJ IDEA** ou **Eclipse**.  
- Gerenciamento de dependências: **Maven** (se configurado).  

## 🚀 **Como Executar**

1 - Clone o repositório:  
 
    git clone https://github.com/washingmg/UFAL.git
   
2 - Navegue para a pasta do projeto:
 
    cd UFAL/POO/Projeto/SistemaACM
   
3 - Compile e execute o projeto utilizando sua IDE ou terminal:

    javac -d bin src/**/*.java
    java -cp bin Main
**Desenvolvido como parte do curso de Programação Orientada a Objetos (POO) na Universidade Federal de Alagoas (UFAL).**
