import java.util.Scanner;

public class VectoresMatrices2 {

	public static void main(String[] args) {

		int num[][] = new int[2][4];
		int negativos = 0;
		int positivos = 0;
		int x = 0;
		int y = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca numeros enteros ");

		for (x = 0; x < 2; x++) {
			for (y = 0; y < 4; y++) {

				num[x][y] = teclado.nextInt();
				if (num[x][y] < 0) {

					negativos = negativos + num[x][y];

				}

				if (num[x][y] > 0) {

					positivos = positivos + num[x][y];

				}

			}

		}

		System.out.println("Suma de los positivos: " + positivos);
		System.out.println("Suma de los negativos: " + negativos);

	}
}