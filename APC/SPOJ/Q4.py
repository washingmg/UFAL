def separaLinhas(votos):
    print(votos)
    separados = []

    aindaOK = True
    while aindaOK:
        qtd = int(votos.pop(0))
        if qtd == 0: #parada
            aindaOK = False
        else:
            valores = votos[:qtd]
            separados.append(valores)
            votos = votos[qtd:]
              
    return separados  

arquivo = open(r'C:\Users\wmede\Desktop\Wpy\Arquivos.py\Exerc.Arq\dd.txt')
arquivoEscrita = open('SaidaEleicao.txt','w')

conteudo = []
for linha in arquivo.readlines():
    conteudo.append((linha.strip()))

separado = separaLinhas(conteudo)
print(separado)

resultado = ''
for votosSeparados in separado:
    contagem = {}
    for voto in votosSeparados:
        if voto not in contagem:
            contagem[voto] = 1
        else:
            contagem[voto] += 1
    
    maior = 0
    vencedor = 0
    e = 1
    for voto in contagem:
        if contagem[voto] > maior:
            maior = contagem[voto]
            vencedor = (voto)
    resultado += 'Teste' +' ' + str(e) + '\n'
    resultado += str(vencedor)+'\n\n'
    e+=1

arquivoEscrita.write(resultado)
arquivo.close()
arquivoEscrita.close()

print('++++++++++++++++++++++++++++++++')
    


arquivo = open(r'C:\Users\wmede\Desktop\Wpy\Arquivos.py\Exerc.Arq\dd.txt')
arquivoEscrita = open('SaidaEleicao.txt','w')

conteudo = []
for linha in arquivo.readlines():
    conteudo.append((linha.strip()))

resultado = ''

contagem = {}
for voto in conteudo:
    if voto not in contagem:
        contagem[voto] = 1
    else:
        contagem[voto] += 1

maior = 0
vencedor = 0
e = 1
for voto in contagem:
    if contagem[voto] > maior:
        maior = contagem[voto]
        vencedor = (voto)
print(vencedor)




