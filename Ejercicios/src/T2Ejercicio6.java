import java.util.Scanner;


public class T2Ejercicio6 {
	public static void main(String Arg[]) {
	
		
	int edad1;
	int edad2;
	int edad3;
	int edad4;
	
	Scanner reader = new Scanner(System.in);
	
	System.out.println("Introduzca edad1: ");
	edad1 = reader.nextInt();
	System.out.println("Introduzca edad2: ");
	edad2 = reader.nextInt();
	System.out.println("Introduzca edad3: ");
	edad3 = reader.nextInt();
	System.out.println("Introduzca edad4: ");
	edad4 = reader.nextInt();
	
	if (edad1<edad2 && edad1<edad3 && edad1<edad4){
		
		System.out.println("edad1 es la edad mínima");
		
	}
	else if (edad2<=edad1 && edad2<=edad3 && edad2<=edad4){
		
		System.out.println("edad2 es la edad mínima");
		
	}
	
	else if (edad3<=edad1 && edad3<=edad2 && edad3<=edad4){
		
		System.out.println("edad3 es la edad mínima");
		
	}
	else if (edad4<=edad1 && edad4<=edad2 && edad4<=edad3){
		
		System.out.println("edad4 es la edad mínima");
		
	}
	
}
}