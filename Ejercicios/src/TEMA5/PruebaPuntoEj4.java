package TEMA5;

public class PruebaPuntoEj4 {

	public static void main(String[] args) {

		//CONSTRUCTORES - Introducir
		Ejercicio4 e1 = new Ejercicio4();
		Ejercicio4 e2 = new Ejercicio4(5,6);
		
		//Introducir valores
		System.out.println("Constructor 1");
		
		System.out.println("Primer punto: "+e1.getX());
		System.out.println("Segundo punto: "+e1.getY());
		
		System.out.println("Constructor 2");
		
		System.out.println("Primer punto: "+e2.getX());
		System.out.println("Segundo punto: "+e2.getY());
		System.out.println("");
		//Imprimir valores
		e1.imprimir();
		e2.imprimir();
	}

}