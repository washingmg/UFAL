class Item:
    def __init__(self, dado:str):
        self.dado = dado
        self.proximo = None

class Lista:
    def __init__(self):
        self.inicio = None
        self.fim = None
    
    def mostrarLista(self):
        atual = self.inicio
        while atual != None:
            print(atual.dado)
            atual = atual.proximo

    def adicionarInicio(self, texto:str):
        item = Item(texto)
        item.proximo = self.inicio
        self.inicio = item
        if self.fim is None:  
            self.fim = item

    def adicionarFim(self, texto: str):
        item = Item(texto)
        if self.inicio is None:  
            self.inicio = item
            self.fim = item
        else:
            self.fim = self.proximo
            self.proximo = item


l1 = Lista()
# l1.adicionarInicio('UFAL')
# l1.adicionarInicio('Aracomp')
l1.adicionarFim('WM')
l1.adicionarFim('aa')

l1.mostrarLista()
