import java.util.Scanner;

public class ArrayEjercicio11 {

	public static void main(String[] args) {

		int numero[] = new int[11];
		int i;
		int z;
		int digito = 0;
		int digitoMax = 0;
		int maxNum = 0;

		Scanner reader = new Scanner(System.in);

		for (i = 0; i < 10; i++) {

			System.out.println("Introduzca numeros: ");
			numero[i] = reader.nextInt();

			int aux = numero[i];
			digito = 0;

			while (aux > 0) {

				aux = aux / 10;
				digito++;

			}

			System.out.println("Este numero tiene " + digito + " digitos");

			if (i == 0) {
				digito = digitoMax;

			}

			if (digito > digitoMax) {
				digitoMax = digito;
				maxNum = numero[i];

			}

		}

		System.out.println("El numero " + maxNum + " tiene " + digitoMax
				+ " digitos.");

	}

}
