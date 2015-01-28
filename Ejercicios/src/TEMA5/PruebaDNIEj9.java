package TEMA5;

import java.util.Scanner;

public class PruebaDNIEj9 {

	public static void main(String[] args) {

		Ejercicio9 e = new Ejercicio9(20496160);
		Ejercicio9 e1 = new Ejercicio9();
		
		e.accesoNIF();		

		Scanner reader = new Scanner (System.in);
		
		int dni;
		
		System.out.println("Introduce tu dni");
		dni=reader.nextInt();
		System.out.println("");
		
		e1.leer(dni);
		System.out.println("");
		e1.mostrar();
		e.mostrar();
	}

}