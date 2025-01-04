Simulação de Semáforo com Arduino

Este projeto implementa a simulação de um semáforo utilizando o Arduino para a disciplina de Organização e Arquitetura de Computadores (OAC). O objetivo é demonstrar o funcionamento de sequências lógicas em um sistema de controle, utilizando LEDs para representar os sinais de trânsito.

A simulação foi realizada utilizando o Tinkercad, uma ferramenta online para design e prototipagem de circuitos eletrônicos.

Hardware Utilizado

1 Arduino UNO

5 LEDs (representando sinais do semáforo)

LED 1 (Vermelho)

LED 2 (Amarelo)

LED 3 (Verde)

LED 4 (Auxiliar 1)

LED 5 (Auxiliar 2)

1 Botão (para acionar o semáforo)

Resistores (para LEDs e botão, conforme necessário)

Protoboard e fios de conexão

Funcionamento do Código

Configuração Inicial:

Os pinos do Arduino são configurados como saídas para os LEDs e como entrada para o botão.

Estado Inicial:

LED 3 e LED 4 são ligados para representar o semáforo no estado padrão.

Ao pressionar o botão:

Passo 1: LED 3 é desligado, e LED 2 (Amarelo) é ligado por 2 segundos.

Passo 2: LED 1 (Vermelho) e LED 5 são ligados, enquanto LED 2 e LED 4 são desligados. Este estado dura 5 segundos.

Passo 3: LEDs 1 e 5 são desligados, e os LEDs 3 e 4 são religados ao estado inicial.

Repete o Ciclo:

O semáforo volta ao estado inicial até que o botão seja pressionado novamente.

Trecho do Código

void setup() {
  // Configuração dos pinos
  pinMode(11, OUTPUT);  // LED 3
  pinMode(12, OUTPUT);  // LED 2
  pinMode(13, OUTPUT);  // LED 1
  pinMode(7, OUTPUT);   // LED 4
  pinMode(6, OUTPUT);   // LED 5
  pinMode(2, INPUT);    // Botão
}

void loop() {
  digitalWrite(11, HIGH);  // LED 3 aceso
  digitalWrite(12, LOW);   // LED 2 apagado
  digitalWrite(13, LOW);   // LED 1 apagado
  digitalWrite(7, HIGH);   // LED 4 aceso
  digitalWrite(6, LOW);    // LED 5 apagado

  if (digitalRead(2) == LOW) {
    digitalWrite(11, LOW);
    digitalWrite(12, HIGH);
    delay(2000);

    digitalWrite(12, LOW);
    digitalWrite(13, HIGH);
    digitalWrite(6, HIGH);
    digitalWrite(7, LOW);
    delay(5000);

    digitalWrite(13, LOW);
    digitalWrite(6, LOW);
    digitalWrite(7, HIGH);
    digitalWrite(11, HIGH);
    delay(1000);
  }
}

Imagem do Circuito

Segue abaixo uma representação visual do circuito criado no Tinkercad:


(Substitua o texto acima pelo link ou adicione a imagem correspondente ao circuito do Tinkercad.)

Instruções de Simulação

Acesse o Tinkercad.

Importe o código fornecido para o editor de código do Tinkercad.

Monte o circuito conforme especificado na lista de hardware.

Inicie a simulação e pressione o botão para observar o funcionamento do semáforo.

Conclusão

Este projeto demonstra como o Arduino pode ser utilizado para simular sistemas lógicos sequenciais, como um semáforo. O uso do Tinkercad permite a prototipagem e validação de ideias de forma rápida e eficiente, sendo uma excelente ferramenta de aprendizado para disciplinas como OAC.