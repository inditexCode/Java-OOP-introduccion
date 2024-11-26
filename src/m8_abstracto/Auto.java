package m8_abstracto;

public class Auto extends Vehiculo{
	
	private int numPuertas;
	

	public Auto() {
		super();
	}

	public Auto(int numRuedas, int numPuertas) {
		super(numRuedas);
		this.numPuertas = numPuertas;
	}

	@Override
	public double calcularVelocidadMaxima() {
		double resultado = numPuertas * 30;
		return resultado;
	}

	@Override
	public String obtenerTipoCombustible() {
		return "Gasoil";
	}

}
