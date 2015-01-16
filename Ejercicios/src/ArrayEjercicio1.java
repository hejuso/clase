import java.util.Scanner;

public class ArrayEjercicio1 {

	public static void main(String[] args) {

		int vector[] = new int[8];
		int i;
		int suma = 0;
		int sumaTreSeis = 0;

		System.out.println("Introduzca 8 numeros: ");
		for (i = 0; i < 8; i++) {

			Scanner reader = new Scanner(System.in);
			vector[i] = reader.nextInt();
			suma = suma + vector[i];

			if (vector[i] >= 36 && vector[i] <= 50) {
				sumaTreSeis = sumaTreSeis + vector[i];
			}

		}

		System.out.println("MAYORES DE 50:");

		for (i = 0; i < 8; i++) {

			if (vector[i] >= 50) {
				System.out.println(vector[i]);

			}
		}
		System.out.println("");
		System.out.println("Suma total vector mayor que 36: " + sumaTreSeis);
		System.out.println("Suma total vector: " + suma);
	}
}
