class Lista:

    def __init__(self, nome:str):
        self.dados = []
        self.nome = nome
    
    def mostrar_lista(self):
        print(self.nome)
        print(self.dados)
    
    def adicionar_fim(self, dado:str):
        self.dados.append(dado)
    
    def adicionar_inicio(self, dado:str):
        tmp = len(self.dados)
        self.dados.append(self.dados[-1])
        #deslocar os elementos maiores para a direita
        while tmp > 0:
            self.dados[tmp] = self.dados[tmp-1]
            tmp = tmp-1
        self.dados[0] = dado

    
    def remover_dado(self, dado:str):
        indice = 0
        for item in self.dados:
            if(self.dados[indice]==dado):
                self.remover_indice(indice)
            indice = indice + 1

    def remover_indice(self, indice:int):
        if indice < len(self.dados):
            del self.dados[indice]
            print('Removido com sucesso!')
        else:
            print('ERRO: indice invalido')


lista = Lista('Minha Lista:')
lista.mostrar_lista()
lista2 = Lista('Sua Lista:')
lista2.mostrar_lista()

lista.adicionar_fim('MCZ')
lista.adicionar_fim('ARA')
lista.adicionar_inicio('SMG')

lista2.adicionar_fim('Feijão')
lista2.adicionar_fim('Arroz')
lista2.adicionar_fim('Carne')


lista.mostrar_lista()
lista2.mostrar_lista()

# l1 = Lista('lista')
# l2 = Lista('lista')
# l3 = l1

# if l1 == l2:
#     print('IGUAIS! 1 e 2')
# if l1 == l3:
#     print('IGUAIS! 1 e 3')
# if l2 == l3:
#     print('IGUAIS! 2 e 3')

# l3.nome='Novo nome'

# l1.mostrar_lista()
# l2.mostrar_lista()