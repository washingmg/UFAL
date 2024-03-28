
# Lista Estática


class Item:

    def __init__(self, nome:str, nota:float):
        self.nome = nome
        self.nota = nota

class ListaEstatica:

    def __init__(self,tamanho_max:int):
        self.tamanho = tamanho_max
        self.dados = []

    def mostrarLista(self):
        if self.dados != None:
            for i in self.dados:
                print(f'Nome: {i.nome}, Nota: {i.nota}')
        else:
            print('Lista vazia!')

    def inserirInicio(self, nome: str, nota: float):
        if len(self.dados) < self.tamanho:
            novo_item = Item(nome, nota)
            self.dados.insert(0, novo_item)
        else:
            print("Lista cheia. Não é possível adicionar mais elementos.")

    def inserirFim(self, nome: str, nota: float):
        if len(self.dados) < self.tamanho:
            novo_item = Item(nome, nota)
            self.dados.append(novo_item)
        else:
            print("Lista cheia. Não é possível adicionar mais elementos.")

    def verificarVazio(self):
        if self.dados is None:
            print('Lista está vazia!')
        else:
            print('Lista não está vazia!')
    
    def esvaziar(self):
        self.dados = None
    
    def buscarElemento(self, chave):
        encontrado = False
        for item in self.dados:
            if item.nome == chave or item.nota == chave:
                print('Elemento encontrado!')
                print(f'\tNome: {item.nome}, Nota: {item.nota}')
                encontrado = True
        if not encontrado:
            print(f'Elemento "{chave}" não encontrado!')

    def removerElemento(self, chave):
        encontrado = False
        for item in self.dados:
            if item.nome == chave:
                encontrado = True
                print(f'Elemento "{chave}" encontrado')
                print(f'\tElemento Excluido!')
                self.dados.remove(item)
        if not encontrado:
            print('Elemento não encontrado!')
        



lista = ListaEstatica(5)

lista.inserirInicio("João", 7.5)
lista.inserirInicio("Maria", 8.0)
lista.inserirFim("Washington", 8.5)
lista.inserirFim("Manoel", 5.5)
lista.inserirInicio("Pedro", 6.5)

# lista.Esvaziar()
lista.verificarVazio()
lista.buscarElemento("Maria")
lista.buscarElemento(5.0)
# lista.mostrarLista()
lista.removerElemento('Washington')
lista.mostrarLista()