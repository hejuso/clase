package TEMA5;

public class Ejercicio9 {

	// Atributos
	double dni;
	char letra;
	char calcLetra = ' ';

	// Constructores

	public Ejercicio9() {

		dni = 0;
		letra = ' ';

	}

	public Ejercicio9(double adni, char aletra) {

		dni = adni;
		letra = aletra;

	}

	// Métodos

	public void mostrar() {

		System.out.println("Su DNI es: " + dni + "-" + letra);

	}

	private char letra() {

		int resto = (int) (dni % 23);

		switch (resto) {

		case 0:
			calcLetra = 'T';

		case 1:
			calcLetra = 'R';
		case 2:
			calcLetra = 'W';
		case 3:
			calcLetra = 'A';
		case 4:
			calcLetra = 'G';
		case 5:
			calcLetra = 'M';
		case 6:
			calcLetra = 'Y';
		case 7:
			calcLetra = 'F';
		case 8:
			calcLetra = 'P';
		case 9:
			calcLetra = 'D';
		case 10:
			calcLetra = 'X';
		case 11:
			calcLetra = 'B';
		case 12:
			calcLetra = 'N';
		case 13:
			calcLetra = 'J';
		case 14:
			calcLetra = 'Z';
		case 15:
			calcLetra = 'S';
		case 16:
			calcLetra = 'Q';
		case 17:
			calcLetra = 'V';
		case 18:
			calcLetra = 'H';
		case 19:
			calcLetra = 'L';
		case 20:
			calcLetra = 'C';
		case 21:
			calcLetra = 'K';
		case 22:
			calcLetra = 'E';
		}

		return calcLetra;
	}

}
