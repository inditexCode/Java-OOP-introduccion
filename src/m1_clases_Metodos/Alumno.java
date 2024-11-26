package m1_clases_Metodos;

// * public es un modificador de acceso
// * class es la clase 
// * Alumno es el nombre de la clase
// * String nombre - String apellido - int ID, son los atributos 

public class Alumno {
	
	String nombre;
	String apellido;
	int ID;
	
	// METODOS, REPRESENTA LA ACCION QUE PUEDE HACER
	public void mostrar() {
		System.out.println("Hola soy un alumno");
	}
	
	public void aprobadoOnO(double nota) {
		if(nota >=6) {
			System.out.println("Aprobado");
		}else {
			System.out.println("NO aprobado");
		}
	}

}
