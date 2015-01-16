import java.util.Scanner;

public class T3Ejercicio5 {
	public static void main(String arg[]) {

		int edad;
		int suma = 0;
		int media = 0;
		int i = 0;
		Scanner reader = new Scanner(System.in);

		System.out.println("Introduzca edad");
		edad = reader.nextInt();
		do {

			i++;
			suma = suma + edad;

			System.out.println("Introduzca edad");
			edad = reader.nextInt();

		} while (edad > 0);

		media = suma / i;
		System.out.println("Media= " + media);

	}
}
