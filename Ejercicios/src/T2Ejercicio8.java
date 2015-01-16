import java.util.Scanner;


public class T2Ejercicio8 {
	public static void main(String Arg[]){
		
		float precioA;
		float precioB;
		float precioC;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca precio A: ");
		precioA= reader.nextFloat();
		System.out.println("Introduzca precio B: ");
		precioB= reader.nextFloat();
		System.out.println("Introduzca precio C: ");
		precioC= reader.nextFloat();
		
		if (precioA>precioB & precioA>precioC & precioB>precioC){
			
			System.out.println(precioA);
			System.out.println(precioB);
			System.out.println(precioC);
			
		}
		
		else if (precioB>precioC & precioB>precioA & precioC>precioA){
			
			System.out.println(precioB);
			System.out.println(precioC);
			System.out.println(precioA);
		}
		
		else if (precioC>precioB & precioC>precioA & precioB>precioA){
			
			System.out.println(precioC);
			System.out.println(precioB);
			System.out.println(precioA);
		}
		
		else if (precioA>precioC & precioA>precioB & precioC>precioB){
			
			System.out.println(precioA);
			System.out.println(precioC);
			System.out.println(precioB);
		}
		else if (precioB>precioA & precioB>precioC & precioA>precioC){
			
			System.out.println(precioB);
			System.out.println(precioA);
			System.out.println(precioC);
		}
		
		else if (precioC>precioA & precioC>precioB & precioA>precioB){
			
			System.out.println(precioC);
			System.out.println(precioA);
			System.out.println(precioB);
		}
	}
}
