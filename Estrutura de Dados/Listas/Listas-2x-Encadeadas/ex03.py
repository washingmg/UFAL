class Item:

    def __init__(self, nome: str, nota: float):
        self.nome = nome
        self.nota = nota
        self.anterior = None
        self.proximo = None

class Lista2Encadeada:

    def __init__(self):
        self.inicio = None
        self.fim = None
    
    def verificarVazio(self):
        if self.inicio is None:
            print('Lista vazia!')
        else:
            print('Lista com itens!')
    
    def esvaziar(self):
        self.inicio, self.fim = None, None

    def mostrarLista(self):
        atual = self.inicio
        while atual != None:
            print(f'Nome: {atual.nome}, Nota: {atual.nota}')
            atual = atual.proximo

    def buscarElemento(self, chave):
        atual = self.inicio
        encontrado = False
        while atual != None:
            if atual.nome == chave or atual.nota == chave:
                print('Elemento encontrado!')
                print(f'\tNome: {atual.nome}, Nota: {atual.nota}')
                encontrado = True
            atual = atual.proximo
        if not encontrado:
            print('Elemento não encontrado!')
        
    
    def adicionarinicio(self, nome: str, nota: float):
        novo_item = Item(nome, nota)
        if self.inicio is None:
            self.inicio = novo_item
            self.fim = novo_item
        else:
            novo_item.proximo = self.inicio
            self.inicio.anterior = novo_item # O ponteiro anterior do 1° item vai apontar para o novo item
            self.inicio = novo_item 
    
    def adicionarFim(self, nome: str, nota: float):
        novo_item = Item(nome, nota)
        if self.inicio is None:
            self.inicio = novo_item
            self.fim = novo_item
        else:
            novo_item.anterior = self.fim 
            self.fim.proximo = novo_item 
            self.fim = novo_item 
    
    def removerElemento(self, chave):
        atual = self.inicio
        encontrado = False
        while atual:
            if atual.nome == chave:
                if atual.anterior: # Lista != 1
                    atual.anterior.proximo = atual.proximo # O ponteiro proximo do nó anterior irá apontar para o próximo nó após o nó atual
                else:
                    self.inicio = atual.proximo # Caso não exista, irá pular para o próximo nó
                if atual.proximo:
                    atual.proximo.anterior = atual.anterior # ponteiro anterior do próximo nó irá apontar para o nó anterior ao nó atual
                print(f'Elemento de chave "{chave}" foi removido!')
                encontrado = True
                break
            atual = atual.proximo
        if not encontrado:
            print('Elemento não encontrado')

    
    def mostrarListaInverso(self):
        atual = self.fim
        while atual != None:
            print(f'Nome: {atual.nome}, Nota: {atual.nota}')
            atual = atual.anterior


lista = Lista2Encadeada()

lista.adicionarinicio("Maria", 7.0)
lista.adicionarinicio("João", 7.5)
lista.adicionarinicio("Maria", 8.0)
lista.adicionarFim("Washington", 8.5)
lista.adicionarFim("Manoel", 5.5)
lista.adicionarinicio("Pedro", 6.5)

# lista.Esvaziar()
lista.verificarVazio()
lista.buscarElemento("Maria")
lista.buscarElemento(8.5)
lista.removerElemento('João')
# lista.removerElemento('Washington')

# lista.mostrarLista()
lista.mostrarListaInverso()
