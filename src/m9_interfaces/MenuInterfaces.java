package m9_interfaces;

public class MenuInterfaces {

	public static void main(String[] args) {
		
       FiguraInterfaces circulo = new CirculoInterfaces(5.0);
       
    // Llamar al método calcularArea() e imprimir el resultado
       System.out.println("Área del círculo: " + circulo.calcularArea());
       
       FiguraInterfaces cuadrado = new CuadradoInterfaces(5);
       System.out.println("Área del cuadrado: " + cuadrado.calcularArea()); 
       

	}

}
