import java.util.Scanner;

public class T2Ejercicio4 {
	public static void main(String args[]) {

		char caracter;

		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca caracter :");
		caracter = reader.next().charAt(0);

		if (caracter >= 'a' && caracter <= 'z') {
			System.out.println("Es un caracter");
		} else if (caracter >= '0' && caracter <= '9') {
			System.out.println("Es un numero");
		} else if (caracter == '.' || caracter == ',' || caracter == ';'
				|| caracter == ':') {
			System.out.println("Es un signo de puntuación");
		} else {

			System.out.println("El caracter es desconocido");
		}
	}
}
