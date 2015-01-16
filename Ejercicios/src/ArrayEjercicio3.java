import java.util.Scanner;

public class ArrayEjercicio3 {

	public static void main(String[] args) {

		float notasA[] = new float[5];
		float notasB[] = new float[5];
		int i;
		float sumaA = 0;
		float sumaB = 0;
		float mediaA = 0;
		float mediaB = 0;
		int m = 0;
		int d = 0;

		Scanner reader = new Scanner(System.in);

		for (i = 0; i != 5; i++) {
			m++;
			System.out.println("Introduzca notas del curso A ");
			notasA[i] = reader.nextInt();
			sumaA = sumaA + notasA[i];

		}

		for (i = 0; i != 5; i++) {
			d++;
			System.out.println("Introduzca notas del curso B ");
			notasB[i] = reader.nextInt();
			sumaB = sumaB + notasB[i];

		}
		mediaA = sumaA / m;
		mediaB = sumaB / d;

		System.out.println("La media de la clase A es " + mediaA);
		System.out.println("La media de la clase B es: " + mediaB);

		if (mediaA > mediaB) {

			System.out.println("El promedio mayor es: " + mediaA
					+ " de la clase A");

		}

		if (mediaA < mediaB) {

			System.out.println("El promedio mayor es: " + mediaB
					+ " de la clase B");

		}

	}

}
