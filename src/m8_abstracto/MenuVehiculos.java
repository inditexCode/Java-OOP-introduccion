package m8_abstracto;

public class MenuVehiculos {

	public static void main(String[] args) {

		// CREAMOS UN AUTO DE 4 RUEDAS Y 5 PUERTAS
		Vehiculo auto = new Auto(4, 5);
		System.out.println("Información del auto");
		auto.mostrarInformacion();
		System.out.println();

		// CREAMOS UNA BICICLETA de montaña 2 ruedas
		Vehiculo bicicleta = new Bicicleta(2, "Montaña");
		System.out.println("Información de la Bicicleta");

		bicicleta.mostrarInformacion();
		System.out.println();

		// CREAMOS UNA MOTO CON 2 RUEDAS Y 500 CILINDRADA
		Vehiculo moto = new Moto(2, 500);
		System.out.println("Información de la moto");
		moto.mostrarInformacion();

	}

}
