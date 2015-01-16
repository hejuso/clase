package TEMA4;

import java.util.Scanner;

public class EjercicioResumenFicheros {

	public static void main(String[] args) {

		int c;
		int n;
		int opcion = 0;
		int min = 0;
		int x;
		int max = 0;
		int recMaxCiudad = 0;
		int recMinCiudad = 0;
		int histogram[] = new int[11];
		int suma_ingresos = 0;
		int media_ingresos = 0;

		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca el numero de ciudades: ");
		n = reader.nextInt();
		String nombreCiudad[] = new String[n];
		int ingresos[] = new int[n];
		int actuaciones[] = new int[n];

		for (c = 0; c < n; c++) {

			System.out.println("Introduzca el nombre de la ciudad: ");
			nombreCiudad[c] = reader.next();
			do {
				System.out.println("Introduzca numero de actuaciones");
				actuaciones[c] = reader.nextInt();
				if (actuaciones[c] <= 0 || actuaciones[c] >= 10) {
					System.out.println("EL N� MAXIMO DE ACTUACIONES ES 10");
				}
			} while (actuaciones[c] <= 0 || actuaciones[c] >= 10);

			System.out.println("Introduzca los ingresos obtenidos: ");
			ingresos[c] = reader.nextInt();
		}

		String ciudadIntr;
		boolean encontrado = false;
		int i = 0;

		do {
			System.out.println("Seleccione una de las opciones: ");
			System.out.println("1. Mostrar Actuaciones");
			System.out.println("2. Recaudaci�n M�xima");
			System.out.println("3. Recaudaci�n M�nima");
			System.out.println("4. Histograma de actuaciones");
			System.out.println("5. Ingresos medios");
			System.out.println("6. Salir");
			opcion = reader.nextInt();

			switch (opcion) {
			case 1:
				System.out
						.println("Introduzca el nombre de la ciudad que desea buscar actuaciones: ");
				ciudadIntr = reader.next();
				encontrado = false;
				i = 0;
				while (!encontrado) {

					if (ciudadIntr.equals(nombreCiudad[i])) {
						encontrado = true;
						System.out.println("N� de actuaciones: "
								+ actuaciones[i]);
						System.out.println("Recaudaci�n: " + ingresos[i]);
						System.out.println("");
					} else {
						i++;
					}

				}

				break;
			case 2:
				x = 0;
				for (x = 0; x < n; x++) {

					if (x == 0) {

						max = ingresos[x];
						recMaxCiudad = x;
					}
					if (max < ingresos[x]) {

						max = ingresos[x];

					}
				}
				System.out.println("La recaudaci�n m�xima ha sido: " + max
						+ " en la siguiente ciudad: "
						+ nombreCiudad[recMaxCiudad]);
				System.out.println("");

				break;
			case 3:
				x = 0;
				for (x = 0; x < n; x++) {

					if (x == 0) {

						min = ingresos[x];

					}
					if (min > ingresos[x]) {

						min = ingresos[x];
						recMinCiudad = i;
					}
				}
				System.out.println("La recaudaci�n m�xima ha sido: " + min
						+ " en la siguiente ciudad: "
						+ nombreCiudad[recMinCiudad]);
				System.out.println("");

				break;

			case 4:
				x = 0;
				c = 0;
				for (x = 0; x < n; x++) {

					histogram[actuaciones[x]]++;

				}

				for (c = 0; c < 11; c++) {

					System.out.print("Con " + c + " actuaciones hay: ");

					for (x = 0; x < histogram[c]; x++) {
						System.out.print("x");

					}

					System.out.println("");

				}

				break;

			case 5:
				for (x = 0; x < n; x++) {

					suma_ingresos = suma_ingresos + ingresos[x];

				}

				System.out.println("Total recaudado: " + suma_ingresos);
				media_ingresos = suma_ingresos / c;
				System.out.println("Media de los ingresos " + media_ingresos);

				x = 0;
				for (x = 0; x < n; x++) {

					if (ingresos[x] > media_ingresos) {

						System.out
								.println("La ciudad "
										+ nombreCiudad[x]
										+ " tiene unos ingresos por encima de la media.");

					}
				}
				break;
			}

		} while (opcion != 6);

	}
}
