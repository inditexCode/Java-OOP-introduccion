package m9_interfaces;

public class CirculoInterfaces implements FiguraInterfaces, Girable, Dibujable {

	private double radio;
	
	public CirculoInterfaces() {
		super();
	}

	public CirculoInterfaces(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
        double PI = 3.14;
        double result = PI * radio * radio;
		return result;
	}

	@Override
	public void dibujar() {

		System.out.println("El circulo se puede dibujar");
	}

	@Override
	public void girar() {
		System.out.println("El circulo se puede girar");
		
	}

}
