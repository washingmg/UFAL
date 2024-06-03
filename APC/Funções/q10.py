# 1. Escreva uma função que conta a quantidade de vogais em um texto e a
# rmazena tal quantidade em um dicionário, onde a chave é a vogal considerada.



def Tratar_palavra(texto):
    texto = texto.lower()
    texto = texto.replace('á','a').replace('é','e').replace('ã','a').replace('â','a').replace('à','a').replace('é','e').replace('í','i')
    return texto


def contar_vogal(texto):
    texto = Tratar_palavra(texto) 
    contagem_vogal = {'a':0,'e':0,'i':0,'o':0,'u':0} 
    
    for letra in texto: 
        for vogal in contagem_vogal: 
            if vogal == letra: 
                contagem_vogal[vogal]+=1 
    return contagem_vogal
                
                
palavra = 'dinossauro'
Tratar_palavra(palavra)
print(contar_vogal(palavra))