import java.util.Scanner;

public class VectoresMatrices1 {

	public static void main(String[] args) {

		int num[][] = new int[2][4];
		int x = 0;
		int y = 0;
		int fila = 1;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Entrada: ");
		System.out.println("************");

		for (x = 0; x < 2; x++) {
			System.out.println("Fila " + fila);
			for (y = 0; y < 4; y++) {
				num[x][y] = teclado.nextInt();
			}
		}

		System.out.println(" ");
		System.out.println("Salida: ");
		System.out.println("************");

		for (x = 0; x < 1; x++) {
			for (y = 0; y < 4; y++) {
				System.out.println("" + num[0][y] + " " + num[1][y]);
			}

		}

	}
}
