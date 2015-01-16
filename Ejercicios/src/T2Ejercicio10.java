import java.util.Scanner;


public class T2Ejercicio10 {
	public static void main(String Arg[]){
		
		float temperatura;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca temperatura en grados Celsius: ");
		temperatura= reader.nextInt();
		
		if (temperatura<=0){
			System.out.println("El agua esta congelada");
		}
		
		else if (temperatura>0 & temperatura<=99){
			
			System.out.println("El agua esta liquida");
			
		}
		else if (temperatura<=100){
			System.out.println("El agua esta en estado gaseoso");
			
		}
		
	}
}
