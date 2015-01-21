package TEMA5;

public class PruebaComplejoEj1 {
	
	public static void main (String [] args){

		Ejercicio1 e;
		Ejercicio1 e2;
		e= new Ejercicio1();
		e2= new Ejercicio1();
		
		e2.asignar(9.1, 4.6);
		e.asignar(6.1, 4.6);
		e.sumar(e2);
		
		e.imprimir();
		
	}

}