
# CONVERSOR DE BASES

## Projeto

- Projeto avaliativo feito para a matéria de Introdução à Ciência da Computação (ICC), 1° Período.
- Função: Converter um número inteiro ou de ponto flutuante de uma base numérica para outra.
- Programa feito em Python utilizando uma interface gráfica (Tkinter).
- Programa com tratamento de erros.

## Funcionalidades

- Conversão de números de qualquer base (entre 2 e 36) para a base 10.
- Conversão de números da base 10 para qualquer base (entre 2 e 36).
- Interface gráfica amigável para facilitar a entrada de dados e exibição de resultados.

## Entradas

- **Base de origem**: Base em que o número se encontra (bases 2 - 36).
  - Exemplo 1: 13
  - Exemplo 2: 22
- **Número**: Valor numérico.
  - Exemplo 1: 214.56
  - Exemplo 2: 15
- **Base de destino**: Base para a qual deseja converter o número (bases 2 - 36).
  - Exemplo 1: 29
  - Exemplo 2: 10

## Saída

- Novo valor após a conversão.
  - Exemplo 1: C7.C56
  - Exemplo 2: 27.0

## Como usar

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/SeuUsuario/UFAL/ICC/Conversor_bases.git
   cd Conversor_Bases
   ```

2. **Instale as dependências:**

   O programa utiliza apenas bibliotecas padrão do Python, então não há necessidade de instalar pacotes adicionais.

3. **Execute o programa:**

   ```bash
   python Conversor_Bases.py
   ```

4. **Use a interface gráfica:**

   - Insira a base de origem.
   - Insira o número a ser convertido.
   - Insira a base de destino.
   - Clique no botão "Converter" para ver o resultado.

## Exemplo de Uso

1. Insira `16` como base de origem.
2. Insira `1A3F` como o número a ser convertido.
3. Insira `10` como base de destino.
4. Clique em "Converter".
5. O resultado será `6719`.

## Estrutura do Código

- `converterBase10(baseOrigem, numero)`: Converte um número da base especificada para a base 10.
- `conversaoGeral(baseDestino)`: Converte um número da base 10 para a base especificada.
- `converter()`: Função principal chamada pela interface gráfica para realizar a conversão.
- Interface gráfica construída utilizando Tkinter.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
