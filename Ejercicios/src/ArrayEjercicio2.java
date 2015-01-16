import java.util.Scanner;

public class ArrayEjercicio2 {

	public static void main(String[] args) {

		int vector1[] = new int[4];
		int vector2[] = new int[4];
		int vector3[] = new int[4];
		int i;

		Scanner reader = new Scanner(System.in);

		System.out.println("-.,.-.,.-.,.-.,.-.,.-.,.-.,.-.,");
		System.out.println(" ");

		for (i = 0; i < 4; i++) {
			System.out.println("Introduzca numeros del vector 1 ");
			vector1[i] = reader.nextInt();
			System.out.println("Introduzca numeros del vector 2 ");
			vector2[i] = reader.nextInt();

			vector3[i] = vector1[i] + vector2[i];

			System.out.println("La suma de " + vector1[i] + " mas "
					+ vector2[i] + " es igual a: " + vector3[i]);
			System.out.println(" ");
			if (i < 3) {
				System.out.println("-.,.-.,.-.,.-.,.-.,.-.,.-.,.-.,");
				System.out.println(" ");
			}
		}

	}
}
