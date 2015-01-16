import java.util.Scanner;

public class ArrayEjercicio4 {

	public static void main(String[] args) {

		int i;
		int vector[] = new int[10];

		Scanner reader = new Scanner(System.in);

		for (i = 0; i < 10; i++) {

			System.out.println("Introduzca numero vector ");
			vector[i] = reader.nextInt();
		}

		i = 0;

		while (i < 9 && vector[i] < vector[i + 1]) {
			i++;
		}

		if (i == 9) {

			System.out.println("Esta ordenado");

		} else {
			System.out.println("No esta ordenado");
		}

	}

}
