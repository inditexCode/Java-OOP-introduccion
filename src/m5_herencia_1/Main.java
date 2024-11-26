package m5_herencia_1;

public class Main {

	public static void main(String[] args) {

		Perro perro = new Perro("Bobby", 3);
        Gato gato = new Gato("Misha", 2);

        System.out.println("Perro: " + perro.getNombre() + ", Edad: " + perro.getEdad());
        perro.hacerSonido();
        perro.correr();

        System.out.println("\nGato: " + gato.getNombre() + ", Edad: " + gato.getEdad());
        gato.hacerSonido();
        gato.saltar();
	}

}
