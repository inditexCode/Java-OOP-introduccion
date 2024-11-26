package m6_herencia_2;

public class Auto extends Vehiculo{
	private int numeroPuertas;

    public Auto(String marca, String modelo, int velocidadMaxima, int numeroPuertas) {
        super(marca, modelo, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void acelerar() {
        System.out.println("El coche está acelerando rápidamente");
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}
