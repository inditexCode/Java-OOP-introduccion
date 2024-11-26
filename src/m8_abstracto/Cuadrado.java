package m8_abstracto;

// La clase Cuadrado extiende la clase abstracta Figura.
// Esto significa que hereda sus atributos y está obligada a implementar sus métodos abstractos.
public class Cuadrado extends Figura {

    // Atributo específico de la clase Cuadrado.
    private double lado;

    // Constructor por defecto (sin parámetros).
    // Inicializa un cuadrado sin valores específicos.
    public Cuadrado() {
        super(); // Llama al constructor por defecto de la clase Figura.
    }

    // Constructor con parámetros para inicializar un cuadrado.
    // Permite establecer las coordenadas x, y y el valor del lado al momento de la creación.
    public Cuadrado(double x, double y, double lado) {
        super(x, y); // Llama al constructor de Figura para inicializar x e y.
        this.lado = lado; // Inicializa el atributo específico lado.
    }

    // Implementación del método abstracto calcularArea() de la clase Figura.
    @Override
    public double calcularArea() {
        // Fórmula del área de un cuadrado: lado * lado
        double resultado = lado * lado; // Calcula el área del cuadrado.
        return resultado; // Devuelve el resultado.
    }
}
