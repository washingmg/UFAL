def ordem_execucao(processo1, processo2):
    tarefas = []

    for tempo in processo1:
        tarefas.append(('p1', tempo))

    for tempo in processo2:
        tarefas.append(('p2', tempo))

    for i in range(len(tarefas)):
        for j in range(i + 1, len(tarefas)):
            if tarefas[i][1] > tarefas[j][1] or (tarefas[i][1] == tarefas[j][1] and tarefas[i][0] > tarefas[j][0]):
                tarefas[i], tarefas[j] = tarefas[j], tarefas[i]

    ordem = [tarefa[0] for tarefa in tarefas]
    print(", ".join(ordem))


processo1 = [3, 2, 4, 1, 6]
processo2 = [1, 3, 2, 5]
ordem_execucao(processo1, processo2)
