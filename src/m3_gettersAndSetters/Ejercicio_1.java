package m3_gettersAndSetters;

public class Ejercicio_1 {
	int tallos;
	String nombre;
	int ramas;
	String hojas;
	
	public Ejercicio_1() {
		super();
	}

	public Ejercicio_1(int tallos, String nombre, int ramas, String hojas) {
		super();
		this.tallos = tallos;
		this.nombre = nombre;
		this.ramas = ramas;
		this.hojas = hojas;
	}

	public int getTallos() {
		return tallos;
	}

	public void setTallos(int tallos) {
		this.tallos = tallos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRamas() {
		return ramas;
	}

	public void setRamas(int ramas) {
		this.ramas = ramas;
	}

	public String getHojas() {
		return hojas;
	}

	public void setHojas(String hojas) {
		this.hojas = hojas;
	}

	@Override
	public String toString() {
		return "Ejercicio_1 [tallos=" + tallos + ", nombre=" + nombre + ", ramas=" + ramas + ", hojas=" + hojas + "]";
	}
	
	

}
