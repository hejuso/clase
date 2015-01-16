import java.util.Scanner;


public class Ejercicio11 {
public static void main(String args []){
	double C1;
	double C2;
	double x;

	Scanner reader = new Scanner(System.in);
	System.out.println("Introduzca C1" );
	C1 = reader.nextDouble();
	System.out.println("Introduzca C2" );
	C2 = reader.nextDouble();
	x = -C2/C1;
	System.out.println("Resultado: "+x);

	
	
	
}
}