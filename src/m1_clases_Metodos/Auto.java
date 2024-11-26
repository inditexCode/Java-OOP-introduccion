package m1_clases_Metodos;

/**
 * La clase Auto representa un vehículo con atributos básicos como 
 * marca, modelo, precio y color. Incluye un método para determinar 
 * las características del auto según su precio.
 */
public class Auto {

    // Atributos de la clase Auto
    String marca;  // Marca del auto (por ejemplo, BMW, Toyota)
    String modelo; // Modelo del auto (por ejemplo, XTR, Corolla)
    int precio;    // Precio del auto (en unidades monetarias)
    String color;  // Color del auto (por ejemplo, Azul, Rojo)

    /**
     * Método que establece las características del auto en función de su precio.
     * Si el precio es menor a 5000, asigna valores predeterminados de marca, modelo y color.
     * De lo contrario, muestra un mensaje indicando que el auto es de menor gama.
     */
    public void caracteristicas() {
        if (precio < 5000) {
            // Asignación de características para autos de mayor gama
            marca = "BMW";
            modelo = "XTR";
            color = "Azul";
        } else {
            // Mensaje para autos de menor gama
            System.out.println("Auto de menor gama");
        }
    }
}
