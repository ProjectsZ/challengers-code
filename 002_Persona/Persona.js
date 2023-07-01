class Persona {
  constructor(nombre, edad, dni) {
    this._nombre = nombre;
    this._edad = edad;
    this._dni = dni;
  }

  // Getters
  get nombre() {  return this._nombre; }
  get edad() {    return this._edad; }
  get dni() {    return this._dni;  }

  // Setters, valida si tiene numeros
  set sNombre(nuevoNombre) {
    if(/[0-9]+/.test(nuevoNombre)){
      console.log("Error en el nombre, contiene datos invalidos");
      return;
    }

    this._nombre = nuevoNombre;
  }

  // Setter, valida si es numero negativo
  set sEdad(nuevaEdad) {
    if (nuevaEdad < 0) {
      console.log("La edad no puede ser un valor negativo.");
    }

    this._edad = nuevaEdad;
  }

  // Setter, valida si es negativo y con mas de 8 digitos
  set sDni(nuevoDNI) {
    if(nuevoDNI < 0 || nuevoDNI > 99999999){
      console.log("Error en el dni: " + nuevoDNI);
    }
      this._DNI = nuevoDNI;
  }

  // Método para mostrar todos los datos
  mostrar() {
    console.log("\nNombre:", this.nombre,
                "\nEdad:", this.edad,
                "\nDNI:", this.dni);
  }

  // Método booleano para verificar si es mayor de edad
  esMayorDeEdad() {
    return this.edad >= 18;
  }
}

// Crear una instancia de la clase Persona
const p = new Persona("Sam5", -10, 12345678898);
p.sNombre = p.nombre;
p.sEdad = p.edad;
p.sDni = p.dni;

// Mostrar todos los datos
p.mostrar();

// Verificar si es mayor de edad
console.log("¿Es mayor de edad?", p.esMayorDeEdad());