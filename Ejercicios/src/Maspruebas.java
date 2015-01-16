import java.util.Scanner;

public class Maspruebas {

	public static void main(String[] args) {

		int mañana[] = new int[4];
		int tarde[] = new int[4];
		int i;
		int sumaMañana = 0;
		int sumaTarde = 0;
		int turno = 0;
		Scanner reader = new Scanner(System.in);
		
		do{

		if (turno == 1) {

			for (i = 0; i < 4; i++) {

				System.out.println("Sueldos de empleados del turno de mañana: ");
				mañana[i] = reader.nextInt();
				sumaMañana = sumaMañana + mañana[i];

			}// mañana
			System.out.println("El turno de mañana: " + sumaMañana);



		}// Fin del if

		if (turno == 2) {

			for (i = 0; i < 4; i++) {

				System.out.println("Sueldos de empleados del turno de tarde: ");
				tarde[i] = reader.nextInt();
				sumaTarde = sumaTarde + tarde[i];

			}// tarde
			
			System.out.println("El turno de tarde: " + sumaTarde);

		}// Fin del if
		System.out.println(" ");
		System.out.println("Para el turno de mañana introduzca 1 ");
		System.out.println("Para el turno de tarde introduzca 2 ");
		System.out.println("Para salir pulse 0 ");
		turno = reader.nextInt();
		
		}while (turno!=0);

	}

}
