def dividir(dividendo, divisor):
    if dividendo < divisor: 
        return 0 #retorna a parte inteira
    else: 
        return 1 + dividir(dividendo - divisor, divisor)

dividendo = int(input("Dividendo: "))
divisor = int(input("Divisor: "))

print(dividir(dividendo,divisor))