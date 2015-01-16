import java.util.Scanner;

public class T2Ejercicio5 {
	public static void main(String args[]) {
		double a;
		double b;
		double c;
		double d;
		double x;
		double x2;

		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca valor de a: ");
		a = reader.nextFloat();
		System.out.println("Introduzca valor de b: ");
		b = reader.nextFloat();
		System.out.println("Introduzca valor de c: ");
		c = reader.nextFloat();

		double discIguAcero = -b / 2 * a;
		d = (Math.pow(b, 2)) - 4 * a * c;
		System.out.println("El discriminante es igual a " + d);
		x = (-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
		x2 = (-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);

		if (a == 0) {
			x = (-c) / b;
			System.out.println("x = " + x);
		}

		else if (d == 0) {
			System.out.println("Raiz equivale a 0: " + discIguAcero);

		}

		else if (d < 0) {

			System.out.println("No se puede resolver");
		}

		else if (d > 0) {

			System.out.println("El resultado de la X es: " + x);
			System.out.println("El resultado de la X2 es: " + x2);
		}

	}
}
