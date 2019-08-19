package ejercicioClase4b;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monedero m1 = new Monedero(200);
		System.out.println(m1);
		m1.ponerDinero(300);
		m1.showDinero();
		m1.sacarDinero(500);
		m1.showDinero();
	}

}
