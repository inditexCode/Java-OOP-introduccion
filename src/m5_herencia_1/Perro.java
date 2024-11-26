package m5_herencia_1;

public class Perro extends Animal {
	public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }

    public void correr() {
        System.out.println("El perro está corriendo");
    }
}
