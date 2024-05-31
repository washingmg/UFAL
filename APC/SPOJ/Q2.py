def bitsTrocados(notas):
    cinquenta = int(notas/50)
    notas = (notas%50)
    dez = int(notas/10)
    notas= (notas%10)
    cinco = int(notas/5)
    notas= (notas%5)
    um = int(notas/1)
    notas = (notas%1)

    return str(cinquenta) +' '+ str(dez) +' '+ str(cinco) +' '+ str(um)

arquivo = open('bb.txt')
arquivo_escrita = open('BitsSaida.txt','w')

e = 1
resultado = ''
for linha in arquivo.readlines():
    linha = int(linha.strip())
    if linha == 0:
        break
    else:
        r =(bitsTrocados(linha))
        resultado+= 'Teste'+' '+str(e) +'\n'
        resultado+= str(r) + '\n\n'
        e+=1
arquivo_escrita.write(resultado)
arquivo.close()
arquivo_escrita.close()




