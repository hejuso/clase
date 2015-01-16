import java.util.*;

public class VectoresMatricesEjemplo {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		int ordenadores[][] = new int[5][20];

		int i;
		int x;

		for (i = 0; i < 5; i++) {
			for (x = 0; x < 20; x++) {
				ordenadores[i][x] = 0;
			}// for x
		}// for i

		int menu = 0;
		int disponibles = 0;
		int asignados = 0;
		char continuar = 's';

		do {

			System.out.println("");
			System.out.println("--- Dep. Sistemas ---");
			System.out.println("1. Asignar o cancelar turno.");
			System.out.println("2. Cantidad de equipos disponibles por sala.");
			System.out.println("3. Num de turnos asignados.");
			System.out.println("4. Salir.");
			System.out.println("");

			System.out.print("Seleccion: ");
			menu = teclado.nextInt();
			System.out.println("");

			switch (menu) {
			case 1:
				continuar = 's';
				while (continuar == 's') {

					System.out.print("Introduce sala: ");
					i = teclado.nextInt();
					System.out.print("Introduce pc: ");
					x = teclado.nextInt();
					System.out.println("");
					System.out.print("Alquilar? 1-si 0-no: ");

					ordenadores[i][x] = teclado.nextInt();
					
					System.out.println("");

					System.out.print("Seguir asignando? s/n: ");
					continuar = teclado.next().charAt(0);

				}

				break;

			case 2:

				for (i = 0; i < 5; i++) {

					System.out.println("Sala nº: " + i);
					disponibles = 0;
					for (x = 0; x < 20; x++) {

						if (ordenadores[i][x] == 0) {
							disponibles++;
						}

					}// for x

					System.out.println("En la sala " + i + " hay "
							+ disponibles + " ordenadores disponibles.");

				}// for i

				break;

			case 3:

				for (i = 0; i < 5; i++) {

					System.out.println("Sala nº: " + i);
					asignados = 0;
					for (x = 0; x < 20; x++) {

						if (ordenadores[i][x] == 1) {
							asignados++;
						}

					}// for x

					System.out.println("En la sala " + i + " hay " + asignados
							+ " ordenadores asignados.");

				}// for i

				break;

			}// fin switch
		} while (menu != 4);
	}// fin main
}