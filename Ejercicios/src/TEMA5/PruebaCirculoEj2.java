package TEMA5;

public class PruebaCirculoEj2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ejercicio2 e;
		Ejercicio2 e2;
		
		e= new Ejercicio2();
		e2= new Ejercicio2();
		
		e.asignaRadio(3);
		e2.asignaRadio(4);
		e.daRadio();
		e2.daRadio();

		e.longitud();
		e2.longitud();
		
		e.area();
		e2.area();

		e.mayorQue(e2);

	}

}