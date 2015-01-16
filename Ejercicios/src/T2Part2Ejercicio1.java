import java.util.Scanner;


public class T2Part2Ejercicio1 {
	public static void main (String arg[]){
	
		int opcion;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca la opción de cafe:");
		System.out.println(" ");
		System.out.println("Para cafe solo introduzca 1");
		System.out.println("Para cafe cortado introduzca 2");
		System.out.println("Para chocolate introduzca 3");
		System.out.println("Para leche introduzca 4");
		opcion= reader.nextInt();
		
		if (opcion == 1){
			System.out.println("El coste de el cafe solo es: 0.35 centimos");
			
		}
		else if (opcion == 2){
			System.out.println("El coste de el cafe cortado es: 0.40 centimos");
			
		}
		else if (opcion == 3){
			System.out.println("El coste de el chocolate es: 0.30 centimos");
			
		}
		else if (opcion == 4){
			System.out.println("El coste de la leche es: 0.35 centimos");
			
		}
		
		
	}
}
