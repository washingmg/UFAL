# 3. Faça um programa que recebe dados de vários contatos (nome, telefone, email) e escreve os dados em um arquivo csv. 
# O programa tem uma função que lê o arquivo e faz busca pelo nome do contato.
import os
import pandas as pd

if not os.path.exists('agenda.csv'):
    arquivo = open('agenda.csv','w')
    arquivo.write('nome, telefone, email\n')
    arquivo.close()
    
while True:
    adicionar = str(input('Deseja adicionar na lista?[S/N]:   ')).lower()
    if adicionar == 's':
        nome = input('Digite o nome:  ').lower()
        telefone = (input('Digite o telefone:  '))
        email = input('Digite o email:  ').lower()
        
        with open('agenda.csv','a') as arquivo:
            arquivo.write(nome+', '+telefone+', '+email+'\n')
            print('adicionados com sucesso!')
    else:
        print('Nada a ser adicionado.')
        break


buscar_contato = input('Digite o nome do contato:  ')

agenda = pd.read_csv('agenda.csv')
resp = agenda[agenda.nome == buscar_contato]
print(resp)

print(resp)

