
def verificar_vencedor(tabuleiro):
    for i in range(3):
        if tabuleiro[i][0] == tabuleiro[i][1] == tabuleiro[i][2] != ' ':
            return f'{tabuleiro[i][0]} vencedor'
        if tabuleiro[0][i] == tabuleiro[1][i] == tabuleiro[2][i] != ' ':
            return f'{tabuleiro[0][i]} vencedor'
    
    if tabuleiro[0][0] == tabuleiro[1][1] == tabuleiro[2][2] != ' ':
        return f'{tabuleiro[0][0]} vencedor'
    if tabuleiro[0][2] == tabuleiro[1][1] == tabuleiro[2][0] != ' ':
        return f'{tabuleiro[0][2]} vencedor'
    
    for linha in tabuleiro:
        if ' ' in linha:
            return 'Jogo em andamento'
    
    return 'Empate'

tabuleiro1 = [
    ['O', 'X', 'O'],
    ['X', 'X', 'O'],
    ['O', 'X', 'X']
]

tabuleiro2 = [
    ['O', 'X', 'O'],
    ['X', 'X', 'O'],
    ['O', 'O', 'X']
]

print(verificar_vencedor(tabuleiro1))  
print(verificar_vencedor(tabuleiro2))  
