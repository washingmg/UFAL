# 5. Um professor teve uma ideia de como avaliar seus alunos em uma atividade que vale entre 0 e 10
# de modo a incentivar a competição entre os alunos.
# uem tirar a maior nota terá 10.
# Quem tirar a menor nota, terá 0.
# As outras notas serão algo entre 0 e 10 da seguinte forma:
# Nota = ((nota-min)/(max – min))*10
# Faça um programa para calcular as notas dos alunos segundo essa regra, utilizando funções

# 1° criamos uma função geral
def calcularNota(notas):
    
    maior, menor = maiorMenor(notas)
    notas_finais = []

    for nota in notas:
        if nota == maior:
            notas_finais.append(10)
        elif nota == menor:
            notas_finais.append(0)
        else:
            notas_finais.append(notaEntre(maior, menor, nota))
    
    return notas_finais

def notaEntre(maior, menor, nota):
    calculo = ( (nota - menor) / (maior - menor) ) * 10
    return calculo

def maiorMenor(notas):
    
    maior = 0
    menor = 10
    for nota in notas:
        if nota >= maior:
            maior = nota
        elif nota <= menor:
            menor = nota
    print(maior,menor)
    return maior, menor
notas = [7, 8, 5.5, 4, 6, 9, 5, 6, 7.5]

notas_finais = calcularNota(notas)
print(notas_finais)