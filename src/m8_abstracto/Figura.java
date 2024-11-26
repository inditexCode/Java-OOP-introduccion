package m8_abstracto;

// Definimos la clase abstracta Figura
// Una clase abstracta es una clase que no se puede instanciar directamente y puede contener métodos abstractos (sin implementación) y concretos (con implementación).
public abstract class Figura {

    // Atributos protegidos (protected) para que las subclases puedan acceder a ellos.
    protected double x; // Coordenada x de la figura
    protected double y; // Coordenada y de la figura

    // Constructor por defecto (sin parámetros).
    // Aunque no es obligatorio, es útil cuando queremos crear subclases con inicialización personalizada.
    protected Figura() {
        super(); // Llama al constructor de la clase Object (superclase implícita de todas las clases).
    }

    // Constructor con parámetros para inicializar las coordenadas x e y.
    protected Figura(double x, double y) {
        super(); // Llama al constructor de la clase Object.
        this.x = x; // Inicializa el atributo x con el valor pasado como argumento.
        this.y = y; // Inicializa el atributo y con el valor pasado como argumento.
    }

    // Método abstracto para calcular el área de la figura.
    // Las subclases estarán obligadas a implementar este método con su propia lógica específica.
    public abstract double calcularArea();
}
