import java.util.Scanner;

public class Ejercicio22 {
	public static void main(String args[]) {

		int horaSal;
		int horaLleg;
		int durViaj;
		double horaSalNew;
		double horaLlegNew;

		double salHora;
		double salMin;
		double llegHora;
		double llegMin;

		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca hora de salida: ");
		horaSal = reader.nextInt();
		System.out.println("Introduzca hora de llegada: ");
		horaLleg = reader.nextInt();

		salHora = ((horaSal / 100) * 60) + (horaSal % 100);
		salMin = horaSal % 100;

	}
}