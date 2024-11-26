package m7_encapsulamiento;

public class Alumno {
	
	private int id;
	private String nombre;
	private String apellido;
	
	// intentar colocar private en vez de publicn en
	// el constructor vacio y veran que da error
	public Alumno() {
		super();
	}

	public Alumno(int id, String nombre, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	

}
