package TallerCoches;

import java.util.Scanner;

public class GestorTallerCoches {

	public static int menu(Scanner tec) {
		System.out
				.println("**************************\n"
						+ "**** TALLER DE COCHES ****\n"
						+ "**************************");
		System.out.println("1. Alta coche");
		System.out.println("2. Borra coche");
		System.out.println("3. Compara coches");
		System.out.println("4. Filtro coches");
		System.out.println("5. Guardar");
		System.out.println("0. Salir");

		System.out.println("**************************");

		return (tec.nextInt());
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Taller t = new Taller("Av. LLuis Vives", "10:00", "19:00");
		t.cargar();

		Scanner tec = new Scanner(System.in);
		int opcion;
		do {
			opcion = menu(tec);
			switch (opcion) {
			case 1:
				System.out.println("Alta coche:");
				System.out.println("");
				/* COMPLETAR */

				System.out.println("Introduzca los datos de su coche:");
				System.out.println("");
				System.out.println("Matricula: ");
				String matricula = tec.next();

				System.out.println("Color: ");
				String color = tec.next();

				System.out.println("Modelo: ");
				String modelo = tec.next();

				System.out.println("¿Esta en el taller?: ");
				boolean enTaller = tec.nextBoolean();

				System.out.println("Antiguedad: ");
				int antiguedad = tec.nextInt();

				Coche cocheAnyadido = new Coche(matricula, color, modelo,
						enTaller, antiguedad);

				System.out.println(t.anyadirCoche(cocheAnyadido));

				break;

			case 2:
				System.out.println("Borrar coche:");
				System.out.println("Matricula:");
				String matriculaBorrar = tec.next();
				System.out.println(t.borrarCoche(matriculaBorrar));

				break;

			case 3:

				/* COMPLETAR */
				System.out.println("Introduzca la matrícula del coche1: ");
				String matriculaCompare = tec.next();
				System.out.println("");
				System.out.println("Introduzca la matrícula del coche2: ");
				String matriculaCompare2 = tec.next();
				Coche c1 = t.buscaCoche(matriculaCompare);
				Coche c2 = t.buscaCoche(matriculaCompare2);

				t.comparaCoches(c1, c2);

			case 4:
				System.out.println("Filtro coches:");
				System.out.println("Introduzca el modelo del coche:");
				String modeloFiltro = tec.next();
				System.out.println("Introduzca la antiguedad del coche:");
				int antiguedadFiltro = tec.nextInt();
				System.out.println(t.filtroCoches(modeloFiltro,
						antiguedadFiltro));
				break;

			case 5:
				System.out.println("Guardar:");
				t.guardar();

				break;

			}

		} while (opcion != 0);

	}
}
