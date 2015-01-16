import java.util.Scanner;

public class T3Ejercicio11 {

	public static void main(String[] args) {

		int numIntr;
		int max = 0;
		int sueldos;

		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca numero de empleados: ");
		numIntr = reader.nextInt();

		for (int i = 1; i <= numIntr; i++) {
			System.out.println("Introduzca sueldos: ");
			sueldos = reader.nextInt();

			if (i == 1) {
				max = sueldos;

			}

			// max
			if (sueldos > max) {
				max = sueldos;
			}

		}
		System.out.println("Sueldo maximo: " + max);

	}
}