package TEMA4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {

		String palabras[] = new String[5];
		int c = 0;
		Scanner reader = new Scanner(System.in);
		String palabraOrd;
		int i = 0;

		PrintWriter out = null;

		try {
			out = new PrintWriter("palabras.txt");

			System.out.println("Introduzca cinco palabras:");
			for (c = 0; c < 5; c++) {
				palabras[c] = reader.next();
			}

			for (c = 0; c < 4; c++) {
				for (i = 0; i < 4; i++) {
					if (palabras[i].compareTo(palabras[i + 1]) > 0) {

						palabraOrd = palabras[i + 1];
						palabras[i + 1] = palabras[c];
						palabras[i] = palabraOrd;
					}

				}
			}
			i = 0;
			for (c = 0; c < 5; c++) {
				i++;
				out.println((i) + "- " + palabras[c]);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			out.close();
		}

	}

}
