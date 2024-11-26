package m2_constructores;

public class Menu {

	public static void main(String[] args) {
		
		System.out.println("--------------ALUMNO---------------------------------------");
		Ejercicio_1 alumno = new Ejercicio_1(1,"Florencia","De paoli",25);
		System.out.println("Nombre: " + alumno.nombre);
		System.out.println("Apellido: " + alumno.apellido);
		System.out.println("Id: " + alumno.Id);
		System.out.println("Edad: " + alumno.edad);
		System.out.println("--------------AUTO---------------------------------------");
		Ejercicio_2 auto = new Ejercicio_2("BMW","XTR",5480 ,"Azul");
        System.out.println("Color: " + auto.color);
        System.out.println("Marca: " + auto.marca);
        System.out.println("Precio: " + auto.precio);
        System.out.println("Modelo: " + auto.modelo);
        System.out.println("-------------CELULARES-----------------------------------------");
        Ejercicio_3 celu = new Ejercicio_3(2, "Iphone", 1250, "PRO MAX");
        System.out.println("Id: " + celu.ID);
        System.out.println("Marca: " + celu.marca);
        System.out.println("Modelo: " + celu.modelo);
        System.out.println("Precio: " + celu.precio);



		
		
		
	}

}
