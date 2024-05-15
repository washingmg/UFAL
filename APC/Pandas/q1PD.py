
# 1. Faça um programa que lê um arquivo csv contendo dados de temperatura 
# e umidade em vários dias em uma cidade e diga qual foi o dia mais quente o mais frio da cidade.

import pandas as pd

arquivo = pd.read_csv(r'C:\Users\wmede\Desktop\Wpy\Pandas\climas.csv')
# print(arquivo)

diasMaisQuente = arquivo[arquivo['Temp'] == arquivo['Temp'].max()]
# print(diasMaisQuente)

diaMaisFrio = arquivo[arquivo['Temp'] == arquivo['Temp'].min()]
# print(diaMaisFrio)

soma_temp = arquivo['Temp'].sum()
print(f"A soma das temperaturas é: {soma_temp}")

print(f'* O dia mias quente foi o {diasMaisQuente['Dia'].values[0]}')
print(f'\t Na cidade de {diasMaisQuente['Cidade'].values[0]}')
print(f'\t Com uma temperatura de {diasMaisQuente['Temp'].values[0]}°C')
print(f'\t Com uma umidade de {diasMaisQuente['Umi'].values[0]} %')
print(f'* O dia mias frio foi o {diaMaisFrio['Dia'].values[0]}')
print(f'\t Na cidade de {diaMaisFrio['Cidade'].values[0]}')
print(f'\t Com uma temperatura de {diaMaisFrio['Temp'].values[0]}°C')
print(f'\t Com uma umidade de {diaMaisFrio['Umi'].values[0]} %')
