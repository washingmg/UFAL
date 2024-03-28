
#Lista Dinâmica Simples 


class Item:

    def __init__(self, nome:str, nota:float): # O __init__ serve para inicializar, com ou sem atributos/parâmetros
        self.nome = nome  # Self é o objeto , o .nome é o atributo e o = nome é o parâmetro
        self.nota = nota
        self.proximo = None  

class ListaDinamica:

    def __init__(self): # Self é usado para acessar atributos/métodos 
        self.inicio = None
        self.fim = None
    
    def inserirInicio(self, nome:str, nota:float):
        novo_item = Item(nome, nota)
        if self.inicio is None:
            self.inicio = novo_item
            self.fim = novo_item
        else:
            novo_item.proximo = self.inicio 
            self.inicio = novo_item #atualiza a referencia, novo item agr é o 1° elemento
       
    def inserirFim(self, nome:str, nota:float):
        novo_item = Item(nome, nota)
        if self.inicio is None:
            self.inicio = novo_item
            self.fim = novo_item
        else:
            self.fim.proximo = novo_item 
            self.fim = novo_item 

    def mostrarLista(self):
        atual = self.inicio
        while atual != None:
            print(f'Nome: {atual.nome}, Nota: {atual.nota}')
            atual = atual.proximo
    

    def verificarVazio(self):
        if self.inicio is None: #se tiver so o inserir fim ele será contabilizado como primeiro
            print('Lista vazia!')
        else:
            print('Lista não vazia!')
    
    def esvaziar(self):
        self.inicio, self.fim = None, None

    def buscarElemento(self, chave):
        atual = self.inicio
        encontrado = False
        while atual != None:
            if atual.nome == chave or atual.nota == chave:
                print('Elemento encontrado!')
                print(f'\tElemento encontrado: Nome: {atual.nome}, Nota: {atual.nota}')
                encontrado = True
            atual = atual.proximo #atualiza o self.inicio para o próximo valor
        if not encontrado:
            print('Elemento não encontrado na lista.')

    def removerElemento(self, chave):
        atual = self.inicio
        anterior = None
        encontrado = False
        while atual != None:
            if atual.nome == chave:
                encontrado = True
                if anterior != None: 
                    anterior.proximo = atual.proximo 
                else:                               
                    self.inicio = atual.proximo # Se for o 1° elemento da lista
            else:
                anterior = atual 
            atual = atual.proximo 

        if encontrado:
            print('Elemento removido da Lista!')
        else:
            print('Elemento não encontrado na lista.')

lista = ListaDinamica()

lista.inserirInicio("João", 7.5)
lista.inserirInicio("Maria", 8.0)
lista.inserirFim("Washington", 8.5)
lista.inserirFim("Manoel", 5.5)
lista.inserirInicio("Pedro", 6.5)

# lista.Esvaziar()
lista.verificarVazio()
lista.buscarElemento("Maria")
lista.buscarElemento(8.5)
# lista.mostrarLista()
lista.removerElemento('Pedro')
lista.mostrarLista()
