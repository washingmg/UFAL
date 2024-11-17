import tkinter as tk
from tkinter import messagebox

def converterBase10(baseOrigem, numero):
    if baseOrigem < 2 or baseOrigem > 36:
        return 'Base inválida. Somente bases entre 2 e 36!'
    else:
        separar = numero.split('.')
        alfabeto = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'

        parte_inteira = 0
        #Conversão inteiro
        for indice, digito in enumerate(separar[0]):
            valor_digito = alfabeto.index(digito)
            posicao = len(separar[0]) - indice - 1
            resultado = valor_digito * (baseOrigem ** posicao)
            parte_inteira += resultado

        #Conversão decimal
        if len(separar) > 1:

            parte_decimal = 0

            for indice, digito in enumerate(separar[1]):
                valor_digito = alfabeto.index(digito)
                posicao = -(indice + 1)
                resultado = valor_digito / (baseOrigem ** abs(posicao))
                parte_decimal += resultado
        else:
            parte_decimal = 0

        return round(parte_inteira + parte_decimal, 2)

def conversaoGeral(baseDestino):
    base10 = converterBase10(baseOrigem, numero)

    if baseDestino < 2 or baseDestino > 36:
        return 'Base inválida. Somente bases entre 2 e 36!'
    else:

        parte_inteira = int(base10)
        parte_fracionaria = base10 - parte_inteira
        parte_inteira_convertida = ''
        parte_fracionaria_convertida = ''

        alfabeto2 = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'

        #conversão inteiro
        while parte_inteira > 0:
            quociente, resto = divmod(parte_inteira, baseDestino) 
            parte_inteira_convertida = alfabeto2[resto] + parte_inteira_convertida
            parte_inteira = quociente

        #Conversão parte fracionária
        
        maximo_decimal = 3
        for _ in range(maximo_decimal):
            parte_fracionaria *= baseDestino
            digito = int(parte_fracionaria)
            parte_fracionaria_convertida += alfabeto2[digito]
            parte_fracionaria -= digito
            if parte_fracionaria == 0:
                break

        resultado_convertido = parte_inteira_convertida
        if parte_fracionaria_convertida != '':
            resultado_convertido += '.' + parte_fracionaria_convertida

        return resultado_convertido

def converter():
    global baseOrigem, numero, baseDestino
    baseOrigem = int(baseOrigem_entry.get())
    numero = entry_numero.get().upper()
    baseDestino = int(entry_baseDestino.get())

    resultado_base10 = converterBase10(baseOrigem, numero)
    
    if isinstance(resultado_base10, (int, float)):
        resultado_final = conversaoGeral(baseDestino)
        label_resultado["text"] = f"Resultado: {resultado_final}"
    else:
        messagebox.showerror("Erro", resultado_base10)



root = tk.Tk()
root.title("Conversor de Bases WM")

widget_width = 20
widget_height = 1

baseOrigem_label = tk.Label(root, text="Base de Origem:", width=widget_width, height=widget_height)
baseOrigem_label.grid(row=0, column=0)
baseOrigem_entry = tk.Entry(root,)
baseOrigem_entry.grid(row=0, column=1)

label_numero = tk.Label(root, text="Número:", width=widget_width, height=widget_height)
label_numero.grid(row=1, column=0)
entry_numero = tk.Entry(root)
entry_numero.grid(row=1, column=1)

label_baseDestino = tk.Label(root, text="Base de Destino:", width=widget_width, height=widget_height)
label_baseDestino.grid(row=2, column=0)
entry_baseDestino = tk.Entry(root)
entry_baseDestino.grid(row=2, column=1)

btn_converter = tk.Button(root, text="Converter", command=converter, width=widget_width, height=widget_height)
btn_converter.grid(row=3, columnspan=9, pady=9)

label_resultado = tk.Label(root, text="", width=widget_width, height=widget_height)
label_resultado.grid(row=6, columnspan=5)

extra_label = tk.Label(root, text='Para novas conversões basta apagar e escrever novamente.', fg='red')
extra_label.grid(row=9, columnspan= 8)
extra_label = tk.Label(root, text='Washington Medeiros', fg="blue")
extra_label.grid(row=12, columnspan=12) 

root.geometry("320x200")
root.eval('tk::PlaceWindow . center')
root.mainloop()