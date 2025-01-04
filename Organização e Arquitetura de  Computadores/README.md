# Projetos de Organização e Arquitetura de Computadores - Dr. Patrick Brito

Este repositório contém dois projetos desenvolvidos como parte da disciplina de **Organização e Arquitetura de Computadores (OAC)**, ministrada pelo **Dr. Patrick Brito**. Os projetos abordam conceitos fundamentais de programação, controle de fluxo e manipulação de dados, aplicados em diferentes contextos de hardware e arquitetura de computadores.

## Projetos

### 1. **Projeto Arduino: Simulador de Semáforo**

Este projeto foi desenvolvido utilizando a plataforma **Arduino** e simulado em um software de simulação de circuitos, com o objetivo de controlar os LEDs de um semáforo (vermelho, amarelo e verde) de acordo com um ciclo de temporização. Embora o hardware real não tenha sido utilizado, o projeto foi completamente simulado para fins de aprendizado e demonstração de controle de dispositivos.

#### Software Utilizado:
- **Tinkercad** (ou outro simulador de Arduino)

#### Componentes Simulados:
- Arduino Uno
- LEDs (Vermelho, Amarelo, Verde)
- Resistores

#### Fluxo do Programa:
1. O semáforo inicia com a luz vermelha acesa.
2. Após o tempo definido, a luz vermelha apaga e a luz verde acende.
3. O tempo de cada cor é controlado por temporizadores, criando um ciclo contínuo de mudanças de estado.

#### Objetivo:
Este projeto visa demonstrar o controle de LEDs utilizando o Arduino, com a simulação de temporizadores e a criação de um ciclo contínuo de um semáforo. A simulação foi realizada para entender os princípios de controle de dispositivos e temporização sem a necessidade de hardware físico.

---

### 2. **Projeto Assembly MIPS: Cálculo de Fatorial**

Este projeto foi implementado em **Assembly MIPS**, com o objetivo de calcular o fatorial de um número. O código utiliza um loop externo para controlar o número de iterações do cálculo e um loop interno para acumular o valor das multiplicações. O programa calcula o fatorial de maneira eficiente utilizando a arquitetura MIPS.

#### Fluxo do Programa:
1. O valor inicial de `n` é armazenado no registrador `$t0`.
2. O código entra em um loop externo que controla o número de iterações para calcular o fatorial.
3. Dentro do loop externo, o loop interno realiza a multiplicação acumulada do número de 1 até `n`.
4. O fatorial é calculado quando o valor de `$t9` atinge 1, encerrando a execução.

#### Exemplo de Execução:
- Para o valor `n = 5`, o programa calcula `5! = 5 × 4 × 3 × 2 × 1`, resultando em 120.

#### Objetivo:
Este projeto serve para entender como realizar operações de cálculo utilizando Assembly MIPS, manipulação de registradores, controle de fluxo e execução de loops, abordando conceitos de arquitetura de computadores em nível de código de máquina.

---

## Comparação Entre os Projetos

### **Arduino vs. Assembly MIPS**

- **Arduino (Simulado)**:
  - Focado em controle de hardware e dispositivos periféricos.
  - Utiliza programação em alto nível e simulação para testar funcionalidades de controle de dispositivos.
  - Ideal para protótipos rápidos e controle físico de dispositivos, com a vantagem de simulação para testes sem hardware físico.

- **Assembly MIPS**:
  - Focado em arquitetura de processadores e programação de baixo nível.
  - Manipula diretamente os registradores e o fluxo de execução do processador.
  - Utilizado para estudar a organização interna de computadores e a eficiência de código em nível de máquina.

---

## Conclusão

Os dois projetos abordam diferentes aspectos da disciplina **Organização e Arquitetura de Computadores**, com o **simulador de semáforo no Arduino** focando no controle de dispositivos periféricos e a **implementação de fatorial em Assembly MIPS** oferecendo uma visão de baixo nível sobre manipulação de registradores e execução de loops. Ambos os projetos ajudam a construir uma base sólida para a compreensão dos conceitos essenciais da área de arquitetura de computadores, com o uso de simulação para facilitar o aprendizado sem necessidade de hardware físico.
