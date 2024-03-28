
# Lista Circular Encadeada


class Item:

    def __init__(self, nome:str, nota:float):
        self.nome = nome
        self.nota = nota
        self.proximo = None
        self.anterior = None

class ListaCircular2xEncadeada:

    def __init__(self):
        self.inicio = None
        self.fim = None

    def mostrarLista(self):
        if self.inicio != None:
            print('Resultado da lista:')
            atual = self.inicio
            print(f'\tNome: {atual.nome}, Nota: {atual.nota}')
            atual = atual.proximo
            while atual != self.inicio:
                print(f'\tNome: {atual.nome}, Nota: {atual.nota}')
                atual = atual.proximo
        else:
            print('Lista vazia!')
        print('')

    def mostrarListaInverso(self):
        if self.inicio != None:
            atual = self.fim
            print(f'Nome: {atual.nome}, Nota: {atual.nota}')
            atual = atual.anterior
            while atual != self.fim:
                print(f'Nome: {atual.nome}, Nota: {atual.nota}')
                atual = atual.anterior
        else:
            print('Lista Vazia!')
        print('')
    
    def inserirInicio(self, nome: str, nota: float):
        novo_item = Item(nome, nota)
        if self.inicio is None:
            novo_item.proximo = novo_item 
            novo_item.anterior = novo_item
            self.inicio = novo_item
            self.fim = novo_item
        else:
            novo_item.proximo = self.inicio 
            novo_item.anterior = self.fim   
            self.inicio.anterior = novo_item
            self.fim.proximo = novo_item
            self.inicio = novo_item # Agr de fato ele é o primeiro elemento da lista

    def inserirFim(self, nome: str, nota: float):
        novo_item = Item(nome, nota)
        if self.inicio is None:
            novo_item.proximo = novo_item
            novo_item.anterior = novo_item # Os ponteiros são atualizados para apontar para si 
            self.inicio = novo_item
            self.fim = novo_item
        else:
            novo_item.proximo = self.inicio
            novo_item.anterior = self.fim # Configura os ponteiros
            self.inicio.anterior = novo_item # Atualiza os ponteiros existentes
            self.fim.proximo = novo_item
            self.fim = novo_item 

    def verificarVazio(self):
        if self.inicio is None:
            print('Lista vazia!')
        else:
            print('Lista com itens!')

    def esvaziar(self):
        self.inicio = None
        self.fim = None
  
    def buscarElemento(self, chave):
        if self.inicio is None:
            print('Lista vazia!')
        else:
            atual = self.inicio
            encontrado = False
            while True:
                if atual.nome == chave or atual.nota == chave:
                    encontrado = True
                    print('Elemento encontrado!')
                    print(f'\tNome: {atual.nome}, Nota: {atual.nota}')
                atual = atual.proximo
                if atual == self.inicio:
                    break
            if not encontrado:
                print('Elemento não encontrado')

    def removerElemento(self, chave):
        if self.inicio is None:
            print('Lista vazia!')
        else:
            atual = self.inicio
            encontrado = False
            while True:
                if atual.nome == chave:
                    encontrado = True
                    if atual == self.inicio and atual == self.fim: # É o único elemento da lista
                        self.inicio = None
                        self.fim = None
                    elif atual == self.inicio: # É o 1° ele. da lista
                        self.inicio = atual.proximo # Onde ó item é removido
                        self.inicio.anterior = self.fim
                        self.fim.proximo = self.inicio # mantém ela circular
                    elif atual == self.fim:   # É o último ele. da lista
                        self.fim = atual.anterior
                        self.fim.proximo = self.inicio
                        self.inicio.anterior = self.fim
                    else:                    # É o ele. do meio
                        atual.anterior.proximo = atual.proximo # o atual é removido e tem os seus ponteiros atualizados
                        atual.proximo.anterior = atual.anterior
                    print(f'Elemento "{chave}" removido!')
                    break
                atual = atual.proximo
                if atual == self.inicio: # O loop voltou à origem
                    break
            if not encontrado:
                print('Elemento não encontrado')
        print('')
        
    def mostrarQtdNos(self):
        
        if self.inicio != None:
            qtd_nos = 0
            atual = self.inicio
            qtd_nos +=1
            atual = atual.proximo
            while atual != self.inicio:
                qtd_nos +=1
                atual = atual.proximo
            print(f'A lista tem {qtd_nos} nós!')
        else:
            print('Lista vazia!')
        print('')

    def triagemDados(self, item):
        nome = item.split('Nome ')[1].split(' : Nota ')[0]
        nota = item.split(': Nota ')[1]
        return nome, nota
    
    def listaEncVetor(self):
        if self.inicio != None:
            print('Lista Encadeada tranformada em vetorial!')
            vetor = []
            atual = self.inicio
            vetor.append(f'Nome {atual.nome} : Nota {atual.nota}')
            atual = atual.proximo
            while atual != self.inicio:
                vetor.append(f'Nome {atual.nome} : Nota {atual.nota}')
                atual = atual.proximo
        
            print(f'\t{vetor}')
        else:
            print('Lista Vazia')
        print('')

    def vetLista(self):
        if self.inicio != None:
            vetor = []
            atual = self.inicio
            vetor.append(f'Nome {atual.nome} : Nota {atual.nota}')
            atual = atual.proximo
            while atual != self.inicio:
                vetor.append(f'Nome {atual.nome} : Nota {atual.nota}')
                atual = atual.proximo
            return vetor
        else:
            return None
        
    def vetorListaEnc(self):
        vetor = self.vetLista()
        if vetor is None:
            print('Lista vazia!')
        else:
            print('Vetor transformado em lista Encadeada!')
            self.esvaziar()
            for item in vetor:
                nome, nota = self.triagemDados(item)
                self.inserirInicio(nome,nota)
            self.mostrarLista()
            
                    
lista = ListaCircular2xEncadeada()

lista.inserirInicio("João", 7.5)
lista.inserirInicio("Maria", 8.0)
lista.inserirFim("Washington", 8.5)
lista.inserirFim("Manoel", 5.5)
lista.inserirInicio("Pedro", 6.5)
# lista.Esvaziar()
lista.verificarVazio()
lista.buscarElemento("Maria")
lista.buscarElemento(8.5)
lista.removerElemento('Pedro')


lista.mostrarLista()
# lista.mostrarListaInverso()
lista.mostrarQtdNos()
lista.listaEncVetor()
lista.vetorListaEnc()