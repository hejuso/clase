package TEMA4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;
import java.util.Scanner;

public class Ejericio3 {

	public static void main(String[] args) {

		float numeros[] = new float[6];
		int c = 0;
		Scanner in = null;
		PrintWriter out = null;

		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca 5 numeros reales.");
		for (c = 0; c < 5; c++) {
			numeros[c] = reader.nextFloat();
		}

		try {
			out = new PrintWriter("numerosrealesComa.txt");
			// escribe los datos en el fichero
			for(c=0;c<5;c++){
				out.print(numeros[c]+" ");
			}
		} catch (IOException e) {
			
		} finally {
			if (out != null)
				out.close();
		}
		
		try {
			out = new PrintWriter("numerosrealesGuion.txt");
			// escribe los datos en el fichero
			for(c=0;c<5;c++){
				out.println(numeros[c]);
			}
		} catch (IOException e) {
			
		} finally {
			if (out != null)
				out.close();
		}

	}
}
