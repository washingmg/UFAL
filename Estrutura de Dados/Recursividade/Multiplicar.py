#Somas sucessivas

def multiplicar(num1, num2):
    if num2 == 0:
        return 0
    elif num2 == 1: 
        return num1
    else: 
        return num1 + multiplicar(num1 , num2-1)

num1 = int(input("Multiplicando: "))
num2 = int(input("Multiplicador: "))
print(multiplicar(num1, num2))