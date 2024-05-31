
# Para determinar o vencedor em um jogo da velha, precisamos verificar se algum jogador ganhou nas linhas,
# colunas ou diagonais. Aqui está uma função em Python que faz isso:


def jogo_da_velha(matriz):
    for i in range(len(matriz)):
        
        if matriz[i][0] == matriz[i][1] == matriz[i][2] and matriz[i][0] != 0:
            return matriz[i][0]
        
        if matriz[0][i] == matriz[1][i] == matriz[2][i] and matriz[0][i] != 0:
            return matriz[0][i]
        
        if matriz[0][0] == matriz[1][1] == matriz[2][2] and matriz[0][0] != 0:
            return matriz[0][0]
        if matriz[0][2] == matriz[1][1] == matriz[2][0] and matriz[0][2] != 0:
            return matriz[0][2]
    return 0

tabuleiro = [[1,2,0],
             [2,1,0],
             [2,1,1]]

vencedor = jogo_da_velha(tabuleiro)
if vencedor == 0:
    print('O jogo está empatado')
if vencedor == 1:
    print('O jogador 1 venceu')
if vencedor == 2:
    print('O jogador 2 ganhou')