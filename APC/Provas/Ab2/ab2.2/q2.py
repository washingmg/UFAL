
def letra_mais_frequente(nome_arquivo):

    arquivo = open(nome_arquivo, 'r')
    texto = arquivo.read().lower() 
    arquivo.close()

    letras = [char for char in texto if 'a' <= char <= 'z']

    frequencia = {}
    for letra in letras:
        if letra in frequencia:
            frequencia[letra] += 1
        else:
            frequencia[letra] = 1

    letra_frequente = max(frequencia, key=frequencia.get)
    ocorrencias = frequencia[letra_frequente]
    porcentagem = (ocorrencias / len(letras)) * 100

    print(f"A letra mais frequente é '{letra_frequente}' com {porcentagem:.2f}% de ocorrências.")

nome_arquivo = r'C:\Users\wmede\Documents\GitHub\UFAL\APC\Provas\Ab2\ab2.2\palavras.txt'

letra_mais_frequente(nome_arquivo)
