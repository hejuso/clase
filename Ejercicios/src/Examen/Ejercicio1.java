package Examen;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {

		float ventas;
		float trabajadores;
		int n;
		int c = 0;
		float media;
		float suma = 0;
		float menor = 0;
		float mayor = 0;
		int minDep = 0;
		int maxDep = 0;

		Scanner reader = new Scanner(System.in);

		for (n = 0; n < 2; n++) {

			System.out.println("Introduzca información sobre el departamento "
					+ n);
			System.out.println("--------------------------------------------");
			System.out.print("Numero de trabajadores: ");
			trabajadores = reader.nextFloat();
			suma=0;
			for (c = 0; c < trabajadores; c++) {
				System.out.print("Ventas del trabajador " + c + " : ");
				ventas = reader.nextFloat();
				suma = suma + ventas;
			}
			media = suma / c;
			System.out
					.println("El numero medio de ventas por trabajador del dept. "
							+ n + " es: " + media);
			System.out.println("");

			if (n == 0) {
				mayor = media;
			}

			if (mayor < media) {
				mayor = media;
			}// mayor

			if (mayor == media) {
				maxDep = n;
			}

			if (n == 0) {
				menor = media;
			}

			if (menor > media) {
				menor = media;
			}// menor

			if (menor == media) {
				minDep = n;
			}

		}

		System.out.println("Resultados generales:");
		System.out.println("---------------------");

		System.out.println("El departamento con el menor número medio de ventas por trabajador es: " + minDep);

	}
}
