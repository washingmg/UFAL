def separarLinha(lista):
    separado = []
    aindaOK = True

    while aindaOK:
        qtd = int(lista.pop(0))
        if qtd == 0:
            aindaOK = False
        else:
            valores = lista[:qtd]
            separado.append(valores)
            lista = lista[qtd:]
    return separado

def vencedor(lista):
    codigos = []
    medias = []
    for i in lista:
        c, m = i.split()
        codigos.append(c)
        medias.append(int(m))
    
    maior = max(medias)
    codigos_filtrados = ''

    for i in range(len(medias)):
        if medias[i] == maior:
            codigos_filtrados += f'{codigos[i]} '
            
    return codigos_filtrados


arquivo = open(r'C:\Users\wmede\Desktop\Wpy\Arquivos.py\Exerc.Arq\cc.txt')
arquivoEscrita = open('SaidaEstagio.txt','w')
conteudo = []
for linha in arquivo.readlines():
    conteudo.append(linha.strip())

escrever =''
turma = 1
for grupo in separarLinha(conteudo):
    escrever+=f'Turma {turma} \n'
    escrever+=(vencedor(grupo)) +'\n\n'
    turma += 1
arquivoEscrita.write(escrever)
arquivoEscrita.close()
arquivo.close()

print('+++++++++++++++++++++++++++++++++++++++++++++++++++++++')


arquivo = open(r'C:\Users\wmede\Desktop\Wpy\Arquivos.py\Exerc.Arq\cc.txt')
arquivoEscrita = open('SaidaEstagio.txt','w')
conteudo = []
for linha in arquivo.readlines():
    conteudo.append(linha.strip())

media = []
codigo = []
for i in conteudo:
    c,m = i.split()
    media.append(int(m))
    codigo.append(int(c))
    x =max(media)
    

for i in range(len(media)):
    if media[i] == x:
        print(codigo[i])
