package TEMA5;

public class PruebaComplejoEj1 {
	
	public static void main (String [] args){

		Ejercicio1 e;
		Ejercicio1 e2;
		e= new Ejercicio1();
		e2= new Ejercicio1();
		
		e.asignar(5.3, 5.1);
		e2.asignar(4.3, 4.3);

		e.sumar(e2);
		
		e.imprimir();
		
	}

}