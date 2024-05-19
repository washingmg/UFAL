#faça um código que vê possíveis números de uma casa numa rua

n = 1 
i = 0
while n < 100:
    n+=1
    if n % 10 == 0 or n % 10 == 6:
        continue #não quer que o resultado conte na soma
    elif n % 17 == 0:
        i+=1
        print(n)
print(f'N° de possíveis casas: {i}')