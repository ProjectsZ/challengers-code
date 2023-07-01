/*
*CHALLENGER 2*: 
Vamos a crear una clase llamada Persona. Sus atributos son: nombre, edad y DNI. Construye los siguientes métodos para la clase:
- Un constructor, donde los datos pueden estar vacíos.
- Los setters y getters para cada uno de los atributos. Hay que validar las entradas de datos.
- mostrar(): Muestra los datos de la persona.
- esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de edad.
*/

public class Persona {
    
    String nombre;
    int edad;
    int DNI;

    /* Nos pide constructores con parametros definidos
     * En java no existe o no se puede mandar valores fijos
     * en los parametros, por lo cual usaremos 
     * cuatro veces el constructor 
     */
    Persona(){
        this.nombre = "";
        this.edad = 0;
        this.DNI = 0;
    }
    Persona(String nombre){
        this.nombre = nombre;
        this.edad = 0;
        this.DNI = 0;
    }
    Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = 0;
    }
    Persona(String nombre, int edad, int DNI){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
    }
    
    // getters, para obtener datos
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public int getDNI() {
        return DNI;
    }

    // setters, para editar y validar datos
    public void setNombre(String nombre) {
        if(nombre.matches(".*[0-9].*")){
            System.out.println("Error en el nombre, contiene datos invalidos");
        }
        
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        if(edad < 0){
            System.out.println("Error en la edad, datos invalidos");
        }
        this.edad = edad;
    }
    public void setDNI(int dNI) {
        if(dNI < 0 || dNI > 99999999){
            System.out.println("Error en el dni: " + dNI);
        }
        
        this.DNI = dNI;
    }

    public void mostrar(){
        System.out.println("\n"+  "Nombre: " + getNombre() + "\n" +
                "Edad: " + getEdad() + "\n" +
                "DNI: " + getDNI());
    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }
    public static void main(String[] args){
        // test 1
        // Persona p = new Persona("Fred Pizarro", -2, 564644664);
        // p.setNombre(p.getNombre());
        // p.setEdad(p.getEdad());
        // p.setDNI(p.getDNI());

        // test 2
        Persona p = new Persona();
        p.setNombre("Fred Pizarro");
        p.setEdad(-2);
        p.setDNI(564644664);
        
        p.mostrar();
        System.out.println("¿Es mayor de edad? " + p.esMayorDeEdad());
    }
}
