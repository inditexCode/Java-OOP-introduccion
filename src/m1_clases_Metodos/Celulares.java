package m1_clases_Metodos;

/**
 * La clase Celulares representa un dispositivo móvil con atributos como 
 * ID, marca, precio y modelo. Incluye un método para asignar características
 * al celular según un ID proporcionado.
 */
public class Celulares {

    // Atributos de la clase Celulares
    int ID;         // Identificador único del celular (1, 2, 3, etc.)
    String marca;   // Marca del celular (por ejemplo, iPhone, Motorola)
    int precio;     // Precio del celular (en unidades monetarias)
    String modelo;  // Modelo del celular (por ejemplo, XT, TB)

    /**
     * Método que asigna los atributos del celular (marca, precio y modelo) 
     * según el valor del ID utilizando una estructura switch.
     * Si el ID no corresponde a ningún caso válido, se imprime un mensaje de error.
     */
    public void Stock() {

        // La estructura switch verifica el ID y asigna valores a los atributos
        switch (ID) {
            case 1:
                // Caso para el ID 1: Asignar valores para un iPhone
                marca = "IPHONE";
                precio = 1500;
                modelo = "XT";
                break;
            case 2:
                // Caso para el ID 2: Asignar valores para un Motorola
                marca = "MOTOROLA";
                precio = 1300;
                modelo = "TB";
                break;
            case 3:
                // Caso para el ID 3: Asignar valores para un Samsung
                marca = "SAMSUM";
                precio = 1000;
                modelo = "Edit";
                break;
            case 4:
                // Caso para el ID 4: Asignar valores para un Oppo
                marca = "OPPO";
                precio = 900;
                modelo = "RY";
                break;
            default:
                // Mensaje de error si el ID no coincide con los casos definidos
                System.out.println("ID ingresado incorrectamente");
                break;
        }
    }
}
