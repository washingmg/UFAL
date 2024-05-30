# 2. Escreva um programa que lê um arquivo contendo endereços IPs, da seguinte forma:
# 200.135.80.9
# 192.168.1.1
# 8.35.67.74
# 257.32.4.5
# O programa deve mostrar os IPs indicando os que são válidos e inválidos (um endereço ip válido não pode ter uma de suas partes 

def validarIP(ip):
    ip = ip.split('.')
    if len(ip) != 4:
        return False
    else:
        for parte in ip:
            if int(parte) < 0 or int(parte) > 255:
                return False
        return True 




arquivo = open(r'C:\Users\wmede\Desktop\Wpy\SALA.py\Arquivo.py\Ips.txt')
for ip in arquivo:
    ip.strip()
    x = validarIP(ip)
    print(f'O IP:{ip} retornou como {x}')
