import java.util.Scanner;

public class T3Ejercicio12 {

	public static void main(String[] args) {

		int numero;
		int contNeg = 0;
		int i = 0;

		do {
			i++;
			Scanner reader = new Scanner(System.in);
			System.out.println("Introduzca numeros: ");
			numero = reader.nextInt();

			if (numero < 0) {
				contNeg++;
			}

		} while (i != 10);
		System.out.println("Has introducido " + contNeg + " numero negativo");

	}

}
