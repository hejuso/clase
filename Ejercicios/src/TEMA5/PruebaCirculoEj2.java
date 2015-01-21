package TEMA5;

public class PruebaCirculoEj2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crear objetos
		Ejercicio2 e;
		Ejercicio2 e2;

		e= new Ejercicio2();
		e2= new Ejercicio2();
		
		//asignar
		
		e.asignaRadio(3);
		e2.asignaRadio(4);
		
		//operaciones
		

		
		e.daRadio();
		e2.daRadio();

		e.longitud();
		e2.longitud();
		
		System.out.println("La longitud del circulo 1 es: ");
		System.out.println(e.longitud());
		
		System.out.println("La longitud del circulo 2 es: ");
		System.out.println(e2.longitud());
		
		e.area();
		e2.area();
		
		System.out.println("Area de la circumferencia 1 es: ");
		System.out.println(+e.area());
		System.out.println("Area de la circumferencia 2 es: ");
		System.out.println(+e2.area());
		
		e.mayorQue(e2);

	}

}