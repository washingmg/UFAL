import csv
import hashlib

def encriptar(texto):
    hash_obj = hashlib.sha256()
    hash_obj.update(texto.encode('utf-8'))
    return hash_obj.hexdigest()

arquivo_entrada = r'C:\Users\wmede\Documents\GitHub\UFAL\APC\Provas\Ab2\ab2.2\dados_usuarios.csv'
arquivo_saida = r'C:\Users\wmede\Documents\GitHub\UFAL\APC\Provas\Ab2\ab2.2\dados_usuarios_encriptados.csv'

with open(arquivo_entrada, 'r') as infile, open(arquivo_saida, 'w', newline='') as outfile:
    leitor_csv = csv.reader(infile)
    escritor_csv = csv.writer(outfile)
    
    escritor_csv.writerow(next(leitor_csv))  
    
    for linha in leitor_csv:
        linha[4] = encriptar(linha[4])  
        escritor_csv.writerow(linha)

print(f"Dados processados e salvos em {arquivo_saida}")
