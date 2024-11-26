package m9_interfaces;

public class CuadradoInterfaces implements FiguraInterfaces, Dibujable {

	private double lado;
		
	public CuadradoInterfaces() {
		super();
	}

	public CuadradoInterfaces(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
        double resultado = lado * lado;
		return resultado;
	}

	@Override
	public void dibujar() {

		System.out.println("El cuadrado se puede dibujar");
	}

}
