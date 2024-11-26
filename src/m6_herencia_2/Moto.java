package m6_herencia_2;

public class Moto extends Vehiculo {

	private String tipoManubrio;

	public Moto(String marca, String modelo, int velocidadMaxima, String tipoManubrio) {
		super(marca, modelo, velocidadMaxima);
		this.tipoManubrio = tipoManubrio;
	}

	@Override
	public void acelerar() {
		System.out.println("La moto está acelerando velozmente");
	}

	public String getTipoManubrio() {
		return tipoManubrio;
	}
}