package m2_constructores;

/**
 * La clase Ejercicio_1 representa un modelo básico de un alumno con atributos
 * como ID, nombre, apellido y edad. Utiliza constructores para inicializar los 
 * objetos y un método para mostrar un mensaje.
 */
public class Ejercicio_1 {

    // Atributos de la clase
    int Id;         // Identificador único del alumno
    String nombre;  // Nombre del alumno
    String apellido; // Apellido del alumno
    int edad;       // Edad del alumno

    /**
     * Constructor vacío (por defecto).
     * Se utiliza para crear objetos sin inicializar los atributos.
     */
    public Ejercicio_1() {
        super(); // Llama al constructor de la clase padre (Object), aunque aquí no es obligatorio.
    }

    public Ejercicio_1(int id, String nombre, String apellido, int edad) {
        super(); // Llama al constructor de la clase padre (Object), aunque aquí no es obligatorio.
        Id = id; // Inicializa el atributo Id con el valor del parámetro id
        this.nombre = nombre; // Inicializa el atributo nombre con el valor del parámetro nombre
        this.apellido = apellido; // Inicializa el atributo apellido con el valor del parámetro apellido
        this.edad = edad; // Inicializa el atributo edad con el valor del parámetro edad
    }

    /**
     * Método que imprime un mensaje en la consola.
     * Representa un comportamiento simple para la clase.
     */
    public void nombre() {
        System.out.println("Hola, soy un alumno");
    }
}
