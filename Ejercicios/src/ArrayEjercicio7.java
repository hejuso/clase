import java.util.Scanner;

public class ArrayEjercicio7 {

	public static void main(String[] args) {

		int vector[] = new int[6];
		int i;
		int min = 0;
		int contador = 0;

		Scanner reader = new Scanner(System.in);

		for (i = 0; i < 5; i++) {

			System.out.println("Introduzca su sueldo: ");
			vector[i] = reader.nextInt();

			if (i == 0) {
				min = vector[i];
			}

			if (vector[i] < min) {
				min = vector[i];
			}

		}

		for (i = 0; i < 5; i++) {

			if (min == vector[i]) {

				contador++;

			}

		}

		System.out.println("El sueldo minimo es: " + min);

		if (contador > 1) {

			System.out.println("El menor se repite");

		}

	}

}
