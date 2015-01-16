import java.util.Scanner;

public class T2Ejercicio1 {
	public static void main(String args[]) {

		int anyo;
		int anyoAct = 2014;

		Scanner reader = new Scanner(System.in);

		System.out.println("Introduzcir año actual");
		anyo = reader.nextInt();

		if (anyo == anyoAct) {
			System.out.println("PRESENTE");
		} else if (anyo < anyoAct) {
			System.out.println("PASADO");
		} else if (anyo > anyoAct) {
			System.out.println("FUTURO");

		}
	}
}