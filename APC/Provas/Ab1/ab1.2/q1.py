valor_boleto = float(input("Digite o valor do boleto: "))
dias_atraso = int(input("Dias de atraso: "))

if dias_atraso == 0:
    print(f'Valor sem juros: R${valor_boleto:.2f}')
    print("Boleto pago!")
else:
    multa = valor_boleto * 0.01
    juros_dia = valor_boleto * 0.01 * dias_atraso
    valor_juros = valor_boleto + multa + juros_dia
    print(f'Valor com juros: R${valor_juros}')
