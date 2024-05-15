def vencedor(numeros):
    for indice, valor in enumerate(numeros,1):
        if indice == int(valor):
            return (valor) + '\n'

caminho = 'Quermesse.txt'
arquivo = open(caminho,'r')
arquivoEscrita = open('SaidaQuermesse.txt', 'w')


conteudo = arquivo.readlines()
adicionar = ''
e = 1
for i in range(1,len(conteudo),2): #o range permite pular as linhas, como acessar o valor da linha
    valores = (conteudo[i].strip().split())
    if valores == 0:
        pass #pare
    else:
        resultado = vencedor(valores)
        if resultado is not None:
            adicionar+= 'Teste' +' '+ str(e) + '\n'
            adicionar+= resultado
            e+=1
arquivoEscrita.write(adicionar)
arquivoEscrita.close
arquivo.close()