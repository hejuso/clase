import java.util.Scanner;


public class EjDowap {
	public static void main(String arg[]) {
		
		int opcion;
		Scanner reader = new Scanner(System.in);

		
		do {
			System.out.println("1.Extraer dinero ");
			System.out.println("2.Ingresar dinero ");
			System.out.println("3.Ultimos movimientos ");
			System.out.println("4.Salir ");
			System.out.println(" ");
			System.out.println("Introduzca una opcion: ");
			opcion = reader.nextInt();
			System.out.println(" ");
		}while (opcion !=4);
		
		
		
	}
}
