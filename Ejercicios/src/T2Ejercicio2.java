import java.util.Scanner;

public class T2Ejercicio2 {

	public static void main(String args[]) {

		float a;
		float b;
		float c;

		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca lados del triangulo");
		System.out.println("Introduzca lado a: ");
		a = reader.nextFloat();
		System.out.println("Introduzca lado b: ");
		b = reader.nextFloat();
		System.out.println("Introduzca lado c: ");
		c = reader.nextFloat();

		if (a == b && a == c) {
			System.out.println("Equilatero");

		} else if ((a == b && c != a && c != b) || (b == c && c != a && b != a)
				|| (c == a && a != b && c != b)) {
			System.out.println("Isosceles");

		} else {
			System.out.println("Escaleno");
		}

	}
}
