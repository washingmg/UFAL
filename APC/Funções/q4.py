# 4. Faça um algoritmo que copie o conteúdo de uma lista para outra, eliminando valores repetidos.
# Implemente funções para isso

def copia(lista):
    copia_lista = lista[:]
    return copia_lista


def sem_duplos(lista):
    copia_lista = copia(lista)
    numeros_sem_duplos.append(set(copia_lista))
    return numeros_sem_duplos
    

numeros_sem_duplos = []
numeros = [1,2,2,5,6,7,7,8]
s = copia(numeros)
g = sem_duplos(numeros)
print(f'Lista com dulpos {s}')
print(f'Lista sem duplos {g}')
