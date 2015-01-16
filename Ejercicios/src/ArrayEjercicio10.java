import java.util.Scanner;

public class ArrayEjercicio10 {

	public static void main(String[] args) {

		int numero[] = new int[10];
		int i;
		int z;

		Scanner reader = new Scanner(System.in);

		for (i = 0; i < 10; i++) {

			System.out.println("Introduzca numeros: ");
			numero[i] = reader.nextInt();

		}

		for (i = 0; i < 10; i++) {

			for (z = 0; z < numero[i]; z++) {
				System.out.print((z + 1 + " "));
			}
			System.out.println();

		}

	}

}
