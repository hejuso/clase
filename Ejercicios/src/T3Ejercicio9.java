import java.util.Scanner;

public class T3Ejercicio9 {

	public static void main(String[] args) {

		int edad = 0;
		int media;
		int maxEdad = 0;
		int minEdad = 0;
		int persJub = 0;
		int menorEdad = 0;
		int i = 0;
		int suma = 0;
		int contj = 0;
		int contmen = 0;

		do {
			Scanner reader = new Scanner(System.in);
			suma = suma + edad;
			if (edad > 0) {
				i++;

				if (i == 1) {
					maxEdad = edad;
					minEdad = edad;
				}
				// max
				if (edad > maxEdad) {
					maxEdad = edad;
				}
				// Min
				if (edad < minEdad) {
					minEdad = edad;
				}

				if (edad > 65) {
					++contj;
				}

				if (edad < 18) {
					++contmen;
				}
			}
			System.out.println("Introduzca edad");
			edad = reader.nextInt();

		} while (edad > 0);

		media = suma / i;
		System.out.println("Media= " + media);
		System.out.println("Edad máxima: " + maxEdad);
		System.out.println("Edad mínima: " + minEdad);
		System.out.println("Personas jubiladas: " + contj);
		System.out.println("Personas menores de edad: " + contmen);

	}

}
