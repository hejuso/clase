import java.util.Scanner;

public class EjEjemplo2 {
	public static void main(String arg[]) {

		int numLeer;
		int numSuma;
		int i;
		int suma = 0;

		Scanner reader = new Scanner(System.in);
		System.out.println("Cuántos números quiere introducir?");
		numLeer = reader.nextInt();

		for (i = 0; i < numLeer; i = i+1) {

			System.out.println("Escribe un número: ");
			numSuma = reader.nextInt();

			if (numSuma % 2 == 0) {
				suma = suma + numSuma;
			}

		}

		System.out.println("La suma de los pares es= " + suma);

	}
}