package m7_encapsulamiento;

public class Menu {

	public static void main(String[] args) {

		Alumno alu = new Alumno(4,"Delfina","Suarez");
		Alumno alu2 = new Alumno(1,"juan","perez");

		
		System.out.println("id: " + alu2.getId());
		System.out.println("nombre: " + alu2.getNombre());
		System.out.println("apellido: " + alu2.getApellido());
		System.out.println("-----------------------------");
		System.out.println("id: " + alu.getId());
		System.out.println("nombre: " + alu.getNombre());
		System.out.println("apellido: " + alu.getApellido());

	}

}
