import java.util.Scanner;

public class EjEjerciciovalmax {
	public static void main(String arg[]) {

		int numIntr;
		int entLeer;
		int min = 0;
		int max = 0;

		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca numero: ");
		numIntr = reader.nextInt();

		for (int i = 1; i <= numIntr; i++) {
			System.out.println("Introduzca numeros: ");
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
		System.out.println("Valor Max: " + max);
		System.out.println("Valor Min: " + min);

	}
}