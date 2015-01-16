import java.util.Scanner;


public class T2Part2Ejercicio4 {
	public static void main (String arg[]){
		
		float operador1;
		float operador2;
		float opcion;
		
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduzca operador 1");
		operador1= reader.nextInt();
		System.out.println("Introduzca operador 2");
		operador2= reader.nextInt();
		System.out.println(" ");
		System.out.println("Para sumar introduzca 1");
		System.out.println("Para restar introduzca 2");
		System.out.println("Para multiplicar introduzca 3");
		System.out.println("Para dividir introduzca 4");
		opcion= reader.nextInt();
		
		//Hacemos las operaciones
		float resSuma = operador1+operador2;
		float resResta = operador1-operador2;
		float resMult = operador1*operador2;
		float resDiv = operador1/operador2;
		
		//Condiciones
		
		if (opcion==1){
			System.out.println("El resultado de la suma es: "+resSuma);
		}
		
		else if (opcion==2){
			System.out.println("El resultado de la resta es: "+resResta);
		}
		
		else if (opcion==3){
			System.out.println("El resultado de la multiplicacion es: "+resMult);
		}
		
		else if (opcion==4){
			System.out.println("El resultado de la división es: "+resDiv);
		}
		
		
		
	}
}
