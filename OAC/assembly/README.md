# Projeto de Fatorial em Assembly MIPS - Disciplina de OAC

Este projeto implementa o cálculo de um fatorial utilizando a linguagem de Assembly MIPS, como parte da disciplina de Organização e Arquitetura de Computadores (OAC). O código realiza o cálculo de `n!`, onde `n` é o valor armazenado inicialmente no registrador `$t0`. A implementação é dividida em um loop externo e um loop interno para realizar as multiplicações necessárias para o cálculo do fatorial.

## Explicação do Código

### Inicialização
- `addi $t0, $zero, 5`: Inicializa o registrador `$t0` com o valor 5. Este é o valor de entrada para o cálculo do fatorial (`5!`).
- `add $t9, $t0, $zero`: Copia o valor de `$t0` para `$t9`. Isso é utilizado para controlar o número de iterações.
- `add $t1, $t0, $zero`: Copia o valor de `$t0` para `$t1`. Esse registrador será usado para acumular o resultado das multiplicações.
- `addi $t5, $zero, 1`: Inicializa o registrador `$t5` com o valor 1, usado como um valor de comparação no controle de fluxo.

### Loop Externo
O **loop externo** é responsável por controlar o número total de iterações do cálculo:
- `add $t0, $t1, $zero`: Copia o valor de `$t1` para `$t0`.
- `addi $t9, $t9, -1`: Decrementa o valor de `$t9` em 1, controlando o número de iterações restantes.
- `add $t8, $t9, $zero`: Copia o valor de `$t9` para `$t8`. Este é usado no loop interno.
- `beq $t9, $t5, end`: Verifica se `$t9` é igual a `$t5` (valor 1). Se for, o programa finaliza.

### Loop Interno
O **loop interno** realiza a multiplicação acumulada:
- `add $t1, $t1, $t0`: Soma o valor de `$t0` ao valor de `$t1`, acumulando o resultado.
- `addi $t8, $t8, -1`: Decrementa o valor de `$t8` por 1 a cada iteração.
- `beq $t8, $t5, loop_externo`: Quando o contador `$t8` atingir 1, o código retorna ao loop externo, decrementando o valor de `$t9` e recomeçando o ciclo de multiplicação.

### Finalização
O programa termina quando `$t9` chega ao valor de 1, o que sinaliza o fim do cálculo do fatorial:
- `end:` é o rótulo final, marcando o fim da execução.

## Fluxo do Programa

O programa realiza o seguinte fluxo de execução:
1. Inicializa os valores de entrada e variáveis de controle.
2. Entra no **loop externo**, onde o número de iterações do fatorial é controlado.
3. Dentro do **loop externo**, entra no **loop interno**, onde a multiplicação de cada número do fatorial é acumulada.
4. Quando o valor de `$t9` atinge 1, o programa termina e o cálculo do fatorial está completo.

## Exemplo de Execução

Para o valor de `n = 5` (conforme inicializado no código):
- A execução do programa calcula `5! = 5 × 4 × 3 × 2 × 1`.
- O valor resultante, 120, será armazenado no registrador `$t1` no final do programa.

## Observações

- A implementação utiliza os registradores `$t0`, `$t1`, `$t5`, `$t8`, e `$t9` para controle e armazenamento de valores intermediários.
- O cálculo de fatorial é feito de forma iterativa usando dois loops: um externo para controlar o número de iterações e outro interno para acumular o valor do fatorial.

## Conclusão

Este código em Assembly MIPS é uma implementação eficiente e bem estruturada para calcular o fatorial de um número, utilizando loops e registros de maneira controlada. Ele serve como uma boa base para entender como manipular dados e fluxos de controle em um ambiente de baixo nível, como o Assembly MIPS, no contexto da disciplina de OAC (Organização e Arquitetura de Computadores).
