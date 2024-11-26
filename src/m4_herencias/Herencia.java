package m4_herencias;

public class Herencia {

    public static void main(String[] args) {

        // Creación de un objeto de la clase 'Empleado'
        Empleado emple = new Empleado();
        
        // Llamadas a métodos específicos de la clase 'Empleado'
        emple.getNum_legajo(); // Obtiene el número de legajo del empleado
        emple.getCargo(); // Obtiene el cargo del empleado
        emple.getSueldo(); // Obtiene el sueldo del empleado

        // Llamadas a métodos heredados de la clase 'Persona' (supuestamente la superclase)
        emple.getApellido(); // Obtiene el apellido del empleado
        emple.getNombre(); // Obtiene el nombre del empleado

        // Creación de un objeto de la clase 'Consultor'
        Consultor consu = new Consultor();

        // Llamadas a métodos específicos de la clase 'Consultor'
        consu.getNombre_consultora(); // Obtiene el nombre de la consultora asociada al consultor
        consu.getNum_consultor(); // Obtiene el número identificador del consultor

        // Llamadas a métodos heredados de la clase 'Persona'
        consu.getNombre(); // Obtiene el nombre del consultor
        consu.getApellido(); // Obtiene el apellido del consultor
    }
}
