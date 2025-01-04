# Simulação de Semáforo com Arduino

Este projeto implementa a simulação de um semáforo utilizando o Arduino para a disciplina de Organização e Arquitetura de Computadores (OAC) ministrada pelo professor Dr. Patrick Brito. O objetivo é demonstrar o funcionamento de sequências lógicas em um sistema de controle, utilizando LEDs para representar os sinais de trânsito.

A simulação foi realizada utilizando o [Tinkercad](https://www.tinkercad.com/), uma ferramenta online para design e prototipagem de circuitos eletrônicos.

## Hardware Utilizado

- **1 Arduino UNO**
- **5 LEDs** (representando sinais do semáforo):
  - LED 1 (Vermelho)
  - LED 2 (Amarelo)
  - LED 3 (Verde)
  - LED 4 (Auxiliar 1)
  - LED 5 (Auxiliar 2)
- **1 Botão** (para acionar o semáforo)
- **Resistores** (para LEDs e botão, conforme necessário)
- **Protoboard e fios de conexão**

## Funcionamento do Código

### Configuração Inicial

Os pinos do Arduino são configurados como saídas para os LEDs e como entrada para o botão.

### Estado Inicial

- LED 3 e LED 4 são ligados para representar o semáforo no estado padrão.

### Ao pressionar o botão:

1. **Passo 1**: LED 3 é desligado, e LED 2 (Amarelo) é ligado por 2 segundos.
2. **Passo 2**: LED 1 (Vermelho) e LED 5 são ligados, enquanto LED 2 e LED 4 são desligados. Este estado dura 5 segundos.
3. **Passo 3**: LEDs 1 e 5 são desligados, e os LEDs 3 e 4 são religados ao estado inicial.

### Repete o Ciclo

O semáforo volta ao estado inicial até que o botão seja pressionado novamente.

## Imagem do Circuito
 ![IMagem](https://github.com/user-attachments/assets/a03dc86d-7d26-430a-bbba-00171285fcfe)
- [Link para o projeto no Tinkercad](https://www.tinkercad.com/things/6GsmoWGoY7i-semaforo-20)
## Instruções de Simulação

1. Acesse o [Tinkercad](https://www.tinkercad.com/).
2. Importe o código fornecido para o editor de código do Tinkercad.
3. Monte o circuito conforme especificado na lista de hardware.
4. Inicie a simulação e pressione o botão para observar o funcionamento do semáforo.

## Conclusão

Este projeto demonstra como o Arduino pode ser utilizado para simular sistemas lógicos sequenciais, como um semáforo. O uso do Tinkercad permite a prototipagem e validação de ideias de forma rápida e eficiente, sendo uma excelente ferramenta de aprendizado para disciplinas como OAC.
