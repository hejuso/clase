import java.util.Scanner;

public class Ejercicio20 {
	public static void main(String args[]) {
		int edad;
		double minutos;
		int segundos;

		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca edad: ");
		edad = reader.nextInt();

		minutos = edad * 525948.766;
		segundos = edad * 31556926;

		System.out.println("La edad en minutos es: " + minutos);
		System.out.println("La edad en segundos es: " + segundos);

	}
}
