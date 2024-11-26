package m5_herencia_1;

public class Gato extends Animal{

	public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau miau");
    }

    public void saltar() {
        System.out.println("El gato está saltando");
    }
	
}
