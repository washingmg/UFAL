# 5. Um professor teve uma ideia de como avaliar seus alunos em uma atividade que vale entre 0 e 10 
# de modo a incentivar a competição entre os alunos. Quem tirar a maior nota terá 10. 
# Quem tirar a menor nota, terá 0.  As outras notas serão algo entre 0 e 10 da seguinte forma:
# Nota = ((nota-min)/(max – min))*10
# Faça um programa para calcular as notas dos alunos segundo essa regra, utilizando funções


def geral(notas):
    maior, menor = maiorMenor(notas)
    notas_corrigidas = []
    for nota in notas:
        if nota == maior: 
            notas_corrigidas.append(10)
        elif nota == menor: 
            notas_corrigidas.append(0)
        else:
            notas = substituir(nota, maior, menor)
            notas_corrigidas.append(notas)
            
    return notas_corrigidas
 
def substituir(nota, maior, menor):
    calculo = ((nota - menor)/(maior - menor)) * 10
    return calculo 

def maiorMenor(notas):
    maior = -1
    menor = 10
    for num in notas:
        if num > maior:
            maior = num
    for num in notas:
        if num < menor:
            menor = num
    return maior, menor

alunos = [1,2,9,7,4,3,5]

a = maiorMenor(alunos)
print(a)
print(geral(alunos))
# print(notas_corrigidas)
