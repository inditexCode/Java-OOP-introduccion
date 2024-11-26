package m6_herencia_2;

public class Vehiculo {
	
	private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getDescripcion() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Velocidad máxima: " + velocidadMaxima + " km/h";
    }

    public void acelerar() {
        System.out.println("El vehículo está acelerando");
    }
}
