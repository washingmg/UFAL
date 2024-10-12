
usuarios = [
    {"nome": "Ana", "email": "ana@gmail.com", "senha": "ana123"},
    {"nome": "Bob", "email": "bob@hotmail.com", "senha": "123bob"},
    {"nome": "Claudio", "email": "claudio@bol.com", "senha": "clau!*"}
]

def autenticar(email, senha):
    autenticado = False
    for usuario in usuarios:
        if usuario["email"] == email and usuario["senha"] == senha:
            autenticado = True
            break
    
    if autenticado:
        print(f"{{'{email}', '{senha}'}}: Autenticado")
    else:
        print(f"{{'{email}', '{senha}'}}: Não autenticado")


autenticar("bob@hotmail.com", "123bob")
autenticar("claudio@bol.com", "123claudio")
