import java.util.Scanner;

public class Condiciones {
	public static void main(String arg[]) {
		float nota;
		Scanner reader = new Scanner(System.in);

		System.out.println("Introduzca nota: ");
		nota = reader.nextFloat();
		if (nota >= 5) {
			System.out.println("Aprobado");
		} else {
			System.out.println("Suspendido");

		}

	}

}
