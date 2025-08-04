from time import sleep
from threading import Thread

def count(mode):
    sleep(1)
    if(mode):
        for i in range(1, 500):
            print(i)
            sleep(0.1)
    else:
        for i in range(500, 1, -1):
            print('              ', i)
            sleep(0.1)

t1 = Thread(target=count, args=[True])
t2 = Thread(target=count, args=[False])

t1.start()
t2.start()
t1.join()
t2.join()