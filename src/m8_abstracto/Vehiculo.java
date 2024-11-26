package m8_abstracto;

public abstract class Vehiculo {

	protected int numRuedas;

	public Vehiculo() {
		super();
	}



	public Vehiculo(int numRuedas) {
		super();
		this.numRuedas = numRuedas;
	}



	public abstract double calcularVelocidadMaxima();

	public abstract String obtenerTipoCombustible();

	public void mostrarInformacion() {
		System.out.println("Número de ruedas: " + numRuedas);
		System.out.println("Velocidad máxima: " + calcularVelocidadMaxima() + " km/h");
		System.out.println("Tipo de combustible: " + obtenerTipoCombustible());
	}

}
