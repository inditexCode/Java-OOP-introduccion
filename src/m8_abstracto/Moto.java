package m8_abstracto;

public class Moto extends Vehiculo{
	
	private int cilindrada;
	
	

	public Moto() {
		super();
	}

	public Moto(int numRuedas, int cilindrada) {
		super(numRuedas);
		this.cilindrada = cilindrada;
	}

	@Override
	public double calcularVelocidadMaxima() {
		
		return cilindrada / 10.0;
	}

	@Override
	public String obtenerTipoCombustible() {
		return "Nafta";
	}

}
