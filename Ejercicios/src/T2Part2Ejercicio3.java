import java.util.Scanner;

public class T2Part2Ejercicio3 {
	public static void main(String args[]) {

		char letra;

		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca calificacion alfabetica");
		letra = reader.next().charAt(0);

		if (letra == 'A') {

			System.out.println("10");
		} else if (letra == 'B') {

			System.out.println("8");

		} else if (letra == 'C') {
			System.out.println("6");

		}

		else if (letra == 'D') {
			System.out.println("5");

		}

		else if (letra == 'E') {
			System.out.println("0");
		}

	}

}
