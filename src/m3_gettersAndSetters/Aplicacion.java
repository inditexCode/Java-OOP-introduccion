package m3_gettersAndSetters;

public class Aplicacion {

    public static void main(String[] args) {
        
        // Imprimiendo valores utilizando GETTERS
        System.out.println("---------Imprimiendo valores utilizando GETTERS----------------");

        // Se crea un objeto 'planta' de la clase 'Ejercicio_1' con valores iniciales
        Ejercicio_1 planta = new Ejercicio_1(4, "Plantita", 16, "Medianas");
        
        // Se obtienen e imprimen los valores de los atributos de 'planta' usando los GETTERS
        System.out.println("Nombre planta: " + planta.getNombre());
        System.out.println("Hojas: " + planta.getHojas());
        System.out.println("Cant: Ramas: " + planta.getRamas());
        System.out.println("Cant: tallos: " + planta.getTallos());

        // Imprimiendo valores utilizando SETTERS
        System.out.println("---------Imprimiendo valores utilizando SETTERS----------------");

        // Se crea otro objeto 'planta2' de la clase 'Ejercicio_1' utilizando el constructor vacío
        Ejercicio_1 planta2 = new Ejercicio_1();
        
        // Se asignan valores a los atributos de 'planta2' utilizando los SETTERS
        planta2.setNombre("ARBOL");
        planta2.setHojas("GRANDES");
        planta2.setRamas(2);
        planta2.setTallos(58);

        // Se obtienen e imprimen los valores de 'planta2' después de haber sido modificados con los SETTERS
        System.out.println("Nombre planta: ->  " + planta2.getNombre());
        System.out.println("Hojas: -> " + planta2.getHojas());
        System.out.println("Cant: Ramas: -> " + planta2.getRamas());
        System.out.println("Cant: tallos: -> " + planta2.getTallos());

        // Modificando datos con SETTERS
        System.out.println("-----------MODIFICANDO DATOS CON SETTERS-------------------");

        // Se modifican los atributos del objeto 'planta' utilizando SETTERS
        planta.setHojas("HOJAS REDONDAS");
        planta.setRamas(1);

        // Se obtienen e imprimen los valores actualizados de 'planta'
        System.out.println("Nombre planta: " + planta.getNombre());
        System.out.println("Hojas: " + planta.getHojas());
        System.out.println("Cant: Ramas: " + planta.getRamas());
        System.out.println("Cant: tallos: " + planta.getTallos());
    }

}
