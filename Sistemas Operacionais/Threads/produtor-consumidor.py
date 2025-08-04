import threading
import queue
import time

def produtor(fila):
    for i in range(5):
        time.sleep(1)  # Simula algum trabalho
        mensagem = f"Mensagem {i}"
        fila.put(mensagem)
        print(f"Produzido: {mensagem}")
def consumidor(fila):
    while True:
        mensagem = fila.get()
        print(f"Consumido: {mensagem}")
        fila.task_done()
        
fila = queue.Queue()
produtor_thread = threading.Thread(target=produtor, args=(fila,))
consumidor_thread = threading.Thread(target=consumidor, args=(fila,))
produtor_thread.start()
consumidor_thread.start()
produtor_thread.join()
consumidor_thread.join()
print("Threads finalizadas")