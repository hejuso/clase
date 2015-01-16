import java.util.Scanner;


public class EjEjemplo3 {
	public static void main(String arg[]) {
		
		int numero;
		int suma=0;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduzca un numero: ");
		numero = reader.nextInt();
		
		while (numero >= 0 ){
			suma = suma + numero;
			System.out.println("Suma= "+suma);
			System.out.println("Introduzca un numero: ");
			numero = reader.nextInt();

		}
		
	}
}
