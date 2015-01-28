package TEMA5;

import java.util.Scanner;

public class Ejercicio9 {

	// Atributos
	int dni;
	char letra;
	char calcLetra = ' ';
	String dniString;

	// Constructores

	public Ejercicio9() {

		dni = 0;
		letra = ' ';

	}

	public Ejercicio9(int adni) {

		dni = adni;
		letra = letra();
	}

	// Métodos

	public void mostrar() {

		System.out.println("Su DNI es: " + dni + "-" + calcLetra);

	}

	public String accesoDNI() {

		return Integer.toString(dni);
	}

	public String accesoNIF() {

		String nif = Integer.toString(dni)+" - "+ letra;
		
		return nif;
	}
	
	public int leer(int x){
		
		int leerDNI=x;
		dni= leerDNI;
		
		System.out.println("La letra del DNI "+dni+" es "+letra());
		
		return x;
	}

	private char letra() {

		int resto = (dni % 23);

		switch (resto) {

		case 0:
			calcLetra = 'T';
			break;
		case 1:
			calcLetra = 'R';
			break;
		case 2:
			calcLetra = 'W';
			break;
		case 3:
			calcLetra = 'A';
			break;
		case 4:
			calcLetra = 'G';
			break;
		case 5:
			calcLetra = 'M';
			break;
		case 6:
			calcLetra = 'Y';
			break;
		case 7:
			calcLetra = 'F';
			break;
		case 8:
			calcLetra = 'P';
			break;
		case 9:
			calcLetra = 'D';
			break;
		case 10:
			calcLetra = 'X';
			break;
		case 11:
			calcLetra = 'B';
			break;
		case 12:
			calcLetra = 'N';
			break;
		case 13:
			calcLetra = 'J';
			break;
		case 14:
			calcLetra = 'Z';
			break;
		case 15:
			calcLetra = 'S';
			break;
		case 16:
			calcLetra = 'Q';
			break;
		case 17:
			calcLetra = 'V';
			break;
		case 18:
			calcLetra = 'H';
			break;
		case 19:
			calcLetra = 'L';
			break;
		case 20:
			calcLetra = 'C';
			break;
		case 21:
			calcLetra = 'K';
			break;
		case 22:
			calcLetra = 'E';
			break;
		}

		return calcLetra;
	}

}
