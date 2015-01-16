import java.util.Scanner;


public class Ejemplo {
	public void main (String args[]){
		Scanner reader = new Scanner(System.in); 
		System.out.println("Introduce un valor: "); 
		int a = reader.nextInt(); 
		System.out.println("Introduce otro valor: ");
		int b = reader.nextInt(); 
		if (a>b) { 
			 	 System.out.println("El número mayor es " + a); 
		} else { 
			 	 System.out.println("El número mayor es " + b); 
		} 
		}
}
