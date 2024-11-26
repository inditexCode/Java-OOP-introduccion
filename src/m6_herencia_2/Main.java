package m6_herencia_2;

public class Main {

	public static void main(String[] args) {

		Auto auto = new Auto("Toyota", "Corolla", 180, 4);
        Moto moto = new Moto("Yamaha", "MT-03", 200, "Deportivo");

        System.out.println(auto.getDescripcion());
        System.out.println("Puertas: " + auto.getNumeroPuertas());
        auto.acelerar();

        System.out.println("\n" + moto.getDescripcion());
        System.out.println("Tipo de manubrio: " + moto.getTipoManubrio());
        moto.acelerar();
	}

}
