package m5_herencia_1;

public class Animal {
	private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void hacerSonido() {
        System.out.println("Sonido de animal");
    }
}
