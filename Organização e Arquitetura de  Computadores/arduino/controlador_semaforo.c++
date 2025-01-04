void setup()
{
  // Configura os pinos como saídas ou entradas
  pinMode(11, OUTPUT);  // LED 3
  pinMode(12, OUTPUT);  // LED 2
  pinMode(13, OUTPUT);  // LED 1
  pinMode(7, OUTPUT);   // LED 4
  pinMode(6, OUTPUT);   // LED 5
  pinMode(2, INPUT);    // Botão de entrada
}

void loop()
{
  // Define o estado inicial dos LEDs
  digitalWrite(11, HIGH);  // LED 3 aceso
  digitalWrite(12, LOW);   // LED 2 apagado
  digitalWrite(13, LOW);   // LED 1 apagado
  digitalWrite(7, HIGH);   // LED 4 aceso
  digitalWrite(6, LOW);    // LED 5 apagado

  // Verifica se o botão foi pressionado (LOW significa pressionado)
  if (digitalRead(2) == LOW) {
    // Sequência de LEDs quando o botão é pressionado

    // Passo 1: Liga LED 2, desliga LED 3
    digitalWrite(11, LOW);
    digitalWrite(12, HIGH);
    delay(2000); // Espera 2000 ms (2 segundos)

    // Passo 2: Liga LED 1 e LED 5 ao mesmo tempo, desliga LED 4 e LED 2
    digitalWrite(12, LOW);   // Desliga LED 2
    digitalWrite(13, HIGH);  // Liga LED 1
    digitalWrite(6, HIGH);   // Liga LED 5
    digitalWrite(7, LOW);    // Desliga LED 4
    delay(5000); // Espera 3000 ms (3 segundos)

    // Passo 3: Desliga LED 1 e LED 5 ao mesmo tempo, e religa os LEDs 4 e 3 juntos
    digitalWrite(13, LOW);  // Desliga LED 1
    digitalWrite(6, LOW);   // Desliga LED 5
    digitalWrite(7, HIGH);  // Religa LED 4
    digitalWrite(11, HIGH); // Religa LED 3 junto com o LED 4
    delay(1000); // Espera 1000 ms (1 segundo)
  }
}
