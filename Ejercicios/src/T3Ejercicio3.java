import java.util.Scanner;

public class T3Ejercicio3 {
	public static void main(String arg[]) {

		int numero;
		int i;
		int suma = 0;
		Scanner reader = new Scanner(System.in);

		for (i = 0; i < 15; i++) {

			System.out.println("Introduzca numero: ");
			numero = reader.nextInt();

			suma = suma + numero;
		}
		System.out.println("Suma total: " + suma);
	}
}
