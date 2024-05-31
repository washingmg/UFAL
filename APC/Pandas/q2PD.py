# 2. Faça um programa que recebe do usuário duas notas de vários alunos e
# escreve um arquivo csv contendo as duas notas e a média do aluno.
import os
import pandas as pd

if not os.path.exists('alunos.csv'):
    arquivos = open('alunos.csv','w')
    arquivos.write('alunos, ab1, ab2, media\n')
    arquivos.close()
    
while True:
    adicionar = str(input('Deseja adicionar na agenda?[S/N]: ')).lower()
    if adicionar == 's':
        nome = input('Digite o nome: ').lower()
        ab1 = float(input('Digite a nota da ab1: '))
        ab2 = float(input('Digite a nota da ab2: '))
        media = (ab1 + ab2) / 2
        with open('alunos.csv','a') as arquivo:
            arquivo.write(nome+', '+ str(ab1)+', '+str(ab2)+', '+str(media)+'\n')
            print('Adicionado com sucesso!')
    else:
        print('Nada a ser adicionado.')
        break