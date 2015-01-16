package TEMA4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopiaEjercicioResumenFicheros {

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
		Scanner in=null;
		try {
			in = new Scanner(new FileReader("entrada.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		n = 3;
		String nombreCiudad[] = new String[n];
		int ingresos[] = new int[n];
		int actuaciones[] = new int[n];

		for (c = 0; c < n; c++) {

			//System.out.println("Introduzca el nombre de la ciudad: ");
			nombreCiudad[c] = in.next();
			do {
			//	System.out.println("Introduzca numero de actuaciones");
				actuaciones[c] = in.nextInt();
				if (actuaciones[c] <= 0 || actuaciones[c] >= 10) {
					System.out.println("EL Nº MAXIMO DE ACTUACIONES ES 10");
				}
			} while (actuaciones[c] <= 0 || actuaciones[c] >= 10);

			//System.out.println("Introduzca los ingresos obtenidos: ");
			ingresos[c] = in.nextInt();
		}
		in.close();

		String ciudadIntr;
		boolean encontrado = false;
		int i = 0;

		do {
			System.out.println("Seleccione una de las opciones: ");
			System.out.println("1. Mostrar Actuaciones");
			System.out.println("2. Recaudación Máxima");
			System.out.println("3. Recaudación Mínima");
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
						System.out.println("Nº de actuaciones: "
								+ actuaciones[i]);
						System.out.println("Recaudación: " + ingresos[i]);
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
				System.out.println("La recaudación máxima ha sido: " + max
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
				System.out.println("La recaudación máxima ha sido: " + min
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
				PrintWriter out = null;
				try {
					out= new PrintWriter("salida.txt");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (x = 0; x < n; x++) {

					suma_ingresos = suma_ingresos + ingresos[x];

				}

				out.println("Total recaudado: " + suma_ingresos);
				media_ingresos = suma_ingresos / c;
				out.println("Media de los ingresos " + media_ingresos);

				x = 0;
				for (x = 0; x < n; x++) {

					if (ingresos[x] > media_ingresos) {

						out.println("La ciudad "
										+ nombreCiudad[x]
										+ " tiene unos ingresos por encima de la media.");

					}
				}
				out.close();
				break;
			}

		} while (opcion != 6);

	}
}