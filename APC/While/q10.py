qtd = 4
qtdi = qtd
qtd_home = 0
qtd_mulher = 0
soma_idade_home = 0
soma_idade_mulher = 0

while qtd > 0:
    
    idade = float(input('Digite a idade:  '))
    sexo = str(input('Digite M ou H: '))
    qtd-=1#sem isso o loop fica infinito
    
    if sexo == 'h' or sexo == 'H':
        soma_idade_home += idade
        qtd_home +=1
        media_h = soma_idade_home / qtd_home
       
    elif sexo == 'm' or sexo == 'm':
        soma_idade_mulher += idade
        qtd_mulher +=1
        media_m = soma_idade_mulher / qtd_mulher

print('Média H:', media_h )
print('Média M:',media_m)
print('A média geral é:' + str((soma_idade_mulher + soma_idade_home) / qtdi))