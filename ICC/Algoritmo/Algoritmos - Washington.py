def inicio(nome):
    return f'Olá, {nome}. Iremos calcular a media de suas notas seguindo alguns requisitos.'

def calcular_notas(ab1,ab2):
    if ab1 and ab2 >=7:
        meida = (ab1 + ab2) /2
        situacao = "AP"    
    else:
        if ab1 or ab2 < 7:
            reavaliacao = float(input('Nota da reavaliação?  '))
            
            notas = [ab1,ab2,reavaliacao]
            maior = segundo_maior = -1
            for num in notas:
                if num > maior:
                    segundo_maior = maior
                    maior = num
                elif segundo_maior < num and segundo_maior != maior:
                        segundo_maior = num
                
            media = (maior + segundo_maior) / 2
            if media >= 7:
                situacao = "AP"
            elif media < 5:
                situacao = "RP"
            else:
                final = float(input('Digie a nota da final:  '))
                nova_media = (media * 6 + final * 4) / 10
                if nova_media >= 5:
                    situacao = "AF"
                else:
                    situacao = "RF"
    return situacao

nome = str(input('Digite o nome do aluno:  '))
print(inicio(nome))

a = float(input('Digite a nota da ab1:  '))
b = float(input('Digite a nota da ab2:  '))
print(f'A situação do {nome} é de: {calcular_notas(a,b)}')