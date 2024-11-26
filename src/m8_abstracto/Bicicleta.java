package m8_abstracto;

public class Bicicleta extends Vehiculo{
      
	 private String tipoBicicleta;
	 
	 
	
	public Bicicleta() {
		super();
	}
	

	public Bicicleta(int numRuedas, String tipoBicicleta) {
		super(numRuedas);
		this.tipoBicicleta = tipoBicicleta;
	}


	@Override
	public double calcularVelocidadMaxima() {
		if(tipoBicicleta.equals("Montaña")) {
			return 30;
		}else if(tipoBicicleta.equals("Ruta")) {
			return 50;
		}else {
			return 20;
		}
		
		
	}

	@Override
	public String obtenerTipoCombustible() {
		return "No usa combustible";
	}

}
