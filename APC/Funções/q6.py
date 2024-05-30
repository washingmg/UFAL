#verifique se a permutação de uma palavra é igual a outra> roma = amor

def verificar_permutacao(palavra1, palavra2):
    # Verifica se o comprimento das palavras é o mesmo
    if len(palavra1) != len(palavra2):
        return False
    
    # Cria dicionários para contar a frequência de cada caractere nas palavras
    contagem_palavra1 = {}
    contagem_palavra2 = {}

    for letra in palavra1:
        for num in contagem_palavra1:
            if letra == num:
                contagem_palavra1[letra] +=1
        else:
            contagem_palavra1[letra] = 1

    for letra in palavra2:
        for num in contagem_palavra2:
            if letra == num:
                contagem_palavra2[letra] +=1
        else:
            contagem_palavra2[letra] = 1
    
    # Compara as contagens se for vvd retornará true
    return contagem_palavra1 == contagem_palavra2

# Exemplos de uso
print(verificar_permutacao("aamor", "roama"))  # Deve retornar True
print(verificar_permutacao("metro", "morte"))  # Deve retornar True
print(verificar_permutacao("abc", "def"))  # Deve retornar False
