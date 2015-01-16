import java.util.Scanner;

public class ArrayEjercicio9 {

	public static void main(String[] args) {

		int i = 0;
		String pais[] = new String[5];
		int c = 0;
		String guardPais = null;

		Scanner reader = new Scanner(System.in);

		for (i = 0; i < 5; i++) {

			System.out.println("Introduzca cinco paises: ");
			pais[i] = reader.next();

		}

		for (c = 0; c < 4; c++) {

			for (i = 0; i < 4; i++) {

				if (pais[i].compareTo(pais[i + 1]) > 0) {

					guardPais = pais[i];
					pais[i] = pais[i + 1];
					pais[i + 1] = guardPais;

				}
			}
		}

		for (i = 0; i < 5; i++) {
			System.out.println(pais[i]);
		}

	}
}
