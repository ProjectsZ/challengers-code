# CHALLENGER 1: 
# Crear una clase "HelloWorld" y imprimir Hello, World!

# Definiendo class HelloWorld
class HelloWorld:
    
    # constructor
    def __init__(self):
        self.hola = "Hello, world!"

    # metodo imprimir texto
    def print_hola(self):
        # imprimir linea de texto
        print(self.hola)

# Creamos el objeto obj
obj = HelloWorld()
# Usamos su metodo print_hola
obj.print_hola();