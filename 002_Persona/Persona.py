# *CHALLENGER 2*: 
# Vamos a crear una clase llamada *_Persona_*. Sus atributos son: nombre, edad y DNI. Construye los siguientes métodos para la clase:
# - Un _constructor_, donde los datos pueden estar vacíos.
# - Los _setters_ y _getters_ para cada uno de los atributos. Hay que validar las entradas de datos.
# - _mostrar()_: Muestra los datos de la persona.
# - _esMayorDeEdad()_: Devuelve un valor lógico indicando si es mayor de edad.

class Persona():

    # Constructor con variables por defecto
    def __init__(self,nombre="",edad=0,DNI=0):
        self.nombre=nombre
        self.edad=edad
        self.DNI=DNI
    
    # Usando el decorador @property
    # para el uso de getters
    @property
    def nombre(self): return self.sNombre

    @property
    def edad(self): return self.iEdad
    
    @property
    def DNI(self): return self.sDNI
    
    # setters
    # Usando el decorador @nombre.setter
    # validamos si contiene numeros
    @nombre.setter
    def nombre(self,nombre):
        if (any(map(str.isdigit, nombre))):
            print("Error en el nombre, contiene datos invalidos")
        self.sNombre=nombre

    # setters
    # Usando el decorador @DNI.setter
    # validamos si contiene numeros negativos o mayores a 8 digitos
    @DNI.setter
    def DNI(self,DNI):
        if (DNI < 0 or DNI > 99999999):   
            print("Error en el dni:",DNI)
            
        self.sDNI=DNI

    # setters
    # Usando el decorador @edad.setter
    # validamos si contiene numeros negativos
    @edad.setter
    def edad(self,edad):
        if edad < 0:
            print("Error en la edad, datos invalidos")
        
        self.iEdad=edad
    
    # mostrar datos, imprimimos los datos
    def mostrar(self):        
        print("\nNombre:"+self.nombre+ "\nEdad:"+str(self.edad)+"\nDNI:"+str(self.DNI))

    # devuelve true si es mayor de edad y false si es menor/negativo
    def esMayorDeEdad(self):
        return self.edad>=18

# Creamos el objeto obj
obj = Persona("Rau1l", -5, 1234789888)

# Usamos su metodo mostrar
obj.mostrar()
print("Es mayor de edad? ", obj.esMayorDeEdad())