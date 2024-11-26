package m1_clases_Metodos;

/**
 * La clase Plantas representa las características básicas de una planta,
 * como su nombre, la cantidad de tallos y el tipo de hojas. 
 * Incluye métodos para clasificar la planta como de interior o exterior 
 * según la cantidad de tallos.
 */
public class Plantas {

    // Atributos de la clase Plantas
    String nombre;  // Nombre de la planta (por ejemplo, Arbusto, Árbol)
    int tallos;     // Cantidad de tallos de la planta
    String hojas;   // Tipo de hojas (por ejemplo, Pequeñas, Grandes)

    /**
     * Método para clasificar una planta como de interior.
     * Si la planta tiene menos de 3 tallos, se considera de interior y
     * se asignan características específicas como el nombre y tipo de hojas.
     */
    public void Interior() {
        if (tallos < 3) {
            // Asignar atributos y mostrar información de la planta de interior
            System.out.println("Es una planta de interior");
            nombre = "Arbusto";
            hojas = "Pequeñas";
            System.out.println("Nombre: " + nombre + " | Cantidad Hojas: " + hojas);
        } else {
            // Mensaje si la planta no cumple los requisitos de interior
            System.out.println("No pertenece a este método");
        }
    }

    /**
     * Método para clasificar una planta como de exterior.
     * Si la planta tiene más de 3 tallos, se considera de exterior y
     * se asignan características específicas como el nombre y tipo de hojas.
     */
    public void Exterior() {
        if (tallos > 3) {
            // Asignar atributos y mostrar información de la planta de exterior
            System.out.println("Es una planta de exterior");
            nombre = "Árbol";
            hojas = "Grandes";
            System.out.println("Nombre: " + nombre + " | Hojas: " + hojas);
        } else {
            // Mensaje si la planta no cumple los requisitos de exterior
            System.out.println("No pertenece a este método");
        }
    }
}
