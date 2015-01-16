import java.util.Scanner;

public class VectoresMatrices3 {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		int i;
		int x;

		int matriz[][] = new int[4][2];

		int fila;
		int posicion;
		int caja[][] = new int[1][2];

		// pedimos numeros
		System.out.println("Introduce numeros: ");
		System.out.println("");
		for (i = 0; i < 4; i++) {

			System.out.println("Fila nº " + i);
			for (x = 0; x < 2; x++) {

				matriz[i][x] = teclado.nextInt();

			} // fin x
		}// fin i

		// mostramos numeros

		for (i = 0; i < 1; i++) {

			for (x = 0; x < 4; x++) {

				System.out.println("Fila nº: " + x + " - |" + matriz[x][0]
						+ " " + matriz[x][1] + "|");

			}// for x
		}// for i

		// guardamos la fila
		System.out.println("Que fila quieres cambiar? (0-4)");
		fila = teclado.nextInt();

		for (x = 0; x < 2; x++) {

			caja[0][x] = matriz[fila][x];
		}// for x

		System.out.println("Caja: " + caja[0][0] + " " + caja[0][1]);

		// donde la ponemos

		System.out.println("En que posicion la quieres poner? (0-4)");
		posicion = teclado.nextInt();

		for (x = 0; x < 2; x++) {

			matriz[fila][x] = matriz[posicion][x];
		}
		System.out.println("");

		for (x = 0; x < 2; x++) {

			matriz[posicion][x] = caja[0][x];
		}

		// mostramos otra vez los numeros

		System.out.println("La nueva posicion es: ");
		for (i = 0; i < 1; i++) {

			for (x = 0; x < 4; x++) {

				System.out.println("Fila nº: " + x + " - |" + matriz[x][0]
						+ " " + matriz[x][1] + "|");

			}// for x
		}// for i

	}// fin main
}
