import logging, threading, time, random

format = "%(asctime)s: %(message)s"
logging.basicConfig(format=format, level = logging.INFO, datefmt="%H:%M:%S")

class Example_Thread(threading.Thread):
    def __init__(self, id_thread: int, delay_time: float, msg: str):
        super().__init__()
        self.id_thread = id_thread
        self.delay_time = delay_time
        self.msg = msg
    
    def message(self):
        time.sleep(self.delay_time)
        print(f"ID Thread:  {self.id_thread} - Message: {self.msg}")
    
    def run(self):
        self.message()
    
threads = []
delay_time = random.uniform(2.5,5)
print(f"Estimado usuario por favor espere {delay_time} segundos")
thread = Example_Thread(id_thread=0, delay_time = delay_time, msg= "Un saludo con un poco de espera")
thread.start()