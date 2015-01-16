package TEMA4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int c=0;
		int cont=0;
		int suma=0;

		Scanner in = null;
		try {
			in = new Scanner (new FileReader("num_enteros.txt"));
			do{
				
				String cadena = in.nextLine();
				System.out.println(cadena);
				int num = Integer.valueOf(cadena);
				suma = suma + num;
				cont++;
				
			}while (in.hasNextLine());
			System.out.println("Hay "+cont+ " numeros");
			System.out.println("La suma total es: "+suma);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
