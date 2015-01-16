import java.util.Scanner;


public class EjEjercicioDoWhile {

	public static void main(String arg[]) {
		
		int num;
		
		Scanner reader = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca un valor válido entre 10-20: ");
			num = reader.nextInt();
		}while(num<10 || num>20);
			
		
	}
	
	
}
