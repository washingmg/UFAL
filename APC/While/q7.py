'Verifique se existe um valor n em um conjunto de inteiros'
lista = [1,3,8,4,6,10,8]
n = 5
i = 0 #começa no índice 0
#condição específica seja atendida
while (i < len(lista) and lista[i] != n): # tem que ser != para que acondição se torne vdd
    i +=1 #indica a posição,além de ser obrigatório para atende o comando do while
if (i == len(lista)):
    print('Não existe')
else:
    print('Achou na posião:', i)
print('='*50)




lista = [1,3,8,4,6,10,8] #1° criamos uma lista com os N°
n = int(input('Digite um N° n:  ')) #2° definimos uma valor para n

i = 0 #definimos como 0 para que comece a contar do ìndice 0
while (i < len(lista) and lista[i] != n): #condição que preisa estar entre () para pegar tudo
    i +=1 #SERVE PARA DIZER EM QUAL ÍNDICE ESTÁ, encremena ao decorrer da lista
#3° enquanto i for menor que o tamanho da lista e o indice da lista for  diferente de n
#O i < tamanho significa dizer que para o while ficar como verdade ele não pode ser igual ou maior que a lista
#O and lista[i] diferente de n singifica dizer que enquanto 
     #SERVE PARA DIZER EM QUAL ÍNDICE ESTÁ         
if i == len(lista):  #5° se i for igual ao tamanho da lista significa que foi percorrida a lista toda e não encontrou n
    print('Não existe')
else:
    print('Achou na posião:', i)