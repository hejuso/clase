import java.util.Scanner;


public class T3Ejercicio4 {
	public static void main(String arg[]) {
		
		int numIntr;
		int entLeer;
		int min = 0;
		int max = 0;

		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca numero de coches: ");
		numIntr = reader.nextInt();

		for (int i = 1; i <= numIntr; i++) {
			System.out.println("Introduzca precios: ");
			entLeer = reader.nextInt();

			if (i == 1) {
				max = entLeer;
				min = entLeer;

			}

			// max
			if (entLeer > max) {
				max = entLeer;

			}
			// Min
			if (entLeer < min) {
				min = entLeer;

			}

		}
		System.out.println("El mas caro: " + max);
		System.out.println("El mas barato: " + min);

		
		
	}
}
