package m8_abstracto;

// La clase Circulo extiende la clase abstracta Figura, lo que significa que hereda sus atributos y debe implementar sus métodos abstractos.
public class Circulo extends Figura {

    // Atributo específico de la clase Circulo.
    private double radio;

    // Constructor por defecto (sin parámetros).
    // Inicializa un círculo sin valores iniciales.
    public Circulo() {
        super(); // Llama al constructor de la clase Figura (que también es el constructor por defecto).
    }

    // Constructor con parámetros para inicializar el círculo.
    // Permite establecer las coordenadas x, y y el radio al momento de la creación.
    public Circulo(double x, double y, double radio) {
        super(x, y); // Llama al constructor de Figura para inicializar x e y.
        this.radio = radio; // Inicializa el atributo específico de Circulo.
    }

    // Implementación del método abstracto calcularArea() de la clase Figura.
    @Override
    public double calcularArea() {
        // Fórmula del área de un círculo: π * radio^2
        double pi = 3.14; // Usamos un valor aproximado de π.
        double resultado = pi * radio * radio; // Calculamos el área.
        return resultado; // Devolvemos el resultado.
    }
}
