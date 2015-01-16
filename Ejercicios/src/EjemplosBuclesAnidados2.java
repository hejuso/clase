import java.util.Scanner;

public class EjemplosBuclesAnidados2 {

	public static void main(String[] args) {

		int numFam = 0;
		int numHijos = 0;
		int edadHijos = 0;
		int i;
		int j;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca numero de familias: ");
		numFam = reader.nextInt();

		for (i = 1; i <= numFam; i++) {
			System.out.println("Introduzca numero de hijos: ");
			numHijos = reader.nextInt();

			for (j = 1; j <= numHijos; j++) {

				System.out.println("Introduzca edad de hijos: ");
				edadHijos = reader.nextInt();
				
			}

		}

	}
}