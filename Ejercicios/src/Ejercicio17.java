import java.util.*;

public class Ejercicio17 {
	public static void main(String arg[]) {
		int horas;
		int dias;
		int semanas;
		int restoHoras1;
		int restoHoras2;

		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca horas: ");
		horas = reader.nextInt();

		semanas = horas / (24 * 7);
		restoHoras1 = horas % (24 * 7);
		dias = restoHoras1 / 24;
		restoHoras2 = restoHoras1 % 24;

		System.out.println("Semanas: " + semanas);
		System.out.println("Dias: " + dias);
		System.out.println("Horas: " + restoHoras2);
	}
}
