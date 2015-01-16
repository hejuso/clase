import java.util.*;
public class Ejercicio21 {
	 public static void main (String args[]){
	
	 int num;
	 int resultado1= 1;
	 int resultado2= 0;
	 
	 Scanner reader = new Scanner(System.in);
	 System.out.println("Introduzca numero: ");
	 num = reader.nextInt();
	 
	 int numero = ((num%2)==0) ? resultado1:resultado2 ;

	 System.out.println("Resultado: " +numero);
	 
	 
	 }
	 }