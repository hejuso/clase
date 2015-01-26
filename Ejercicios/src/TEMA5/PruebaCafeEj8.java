package TEMA5;

public class PruebaCafeEj8 {

	public static void main(String[] args) {

		Ejercicio8 e1;
		Ejercicio8 e2;
		e1= new Ejercicio8();
		e2= new Ejercicio8(500, 600);
		
		System.out.println("1");

		System.out.println("");
		System.out.println(e1.mostrarcafe());
		e1.llenarCafetera();
		System.out.println(e1.mostrarcafe());
		e1.servirTaza(20);
		System.out.println(e1.mostrarcafe());
		e1.agregarCafe(20);
		System.out.println(e1.mostrarcafe());

		System.out.println("");
		System.out.println("2");
		System.out.println("");
		e2.llenarCafetera();
		System.out.println(e2.mostrarcafe());
		e2.servirTaza(20);
		System.out.println(e2.mostrarcafe());
		e2.agregarCafe(20);
		System.out.println(e2.mostrarcafe());

		
	}

}
