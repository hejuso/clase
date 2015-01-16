package Examen;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int[] numeros = new int[6];
		Scanner reader = new Scanner(System.in);
		int n;
		int c;
		int min = 0;
		int repite = 0;
		int repiteConsec = 0;

		for (n = 0; n < 5; n++) {
			System.out.print("Introduzca un numero: ");
			numeros[n] = reader.nextInt();

			if (n == 0) {

				min = numeros[n];

			}
			if (min > numeros[n]) {

				min = numeros[n];

			}

		}

		for (n = 0; n < 5; n++) {
			if (min == numeros[n]) {
				repite++;
			}
		}

		System.out.println("El vector contiene los siguientes elementos: ");

		for (n = 0; n < numeros.length; n++) {

			System.out.print(numeros[n] + " ");

		}

		for (n = 0; n < 5; n++) {
			// System.out.print(numeros[n]);
			if (numeros[n] == numeros[n + 1]) {
				repiteConsec++;

			}

		}
		System.out.println(" ");

		System.out.println("");
		System.out.println("El numero minimo es: " + min + " y se repite "
				+ repite + " veces");

		if (repiteConsec >= 1) {
			System.out.println("Un numero se repite consecutivamente");
		}

	}

}
