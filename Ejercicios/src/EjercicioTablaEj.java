import java.util.Scanner;

public class EjercicioTablaEj {
	public static void main(String arg[]) {

		int num;

		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca numero de la tabla: ");
		num = reader.nextInt();

		for (int i = 1; i != 10+1; i++) {

			System.out.println(num + " x " + i + " = " + num * i);

		}
	}
}