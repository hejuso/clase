import java.util.*;
public class Ejercicio18 {
public static void main(String arg[]){
	
	double a=0;
	double b=0;
	double c=0;
	double discrim;
	double raiz1;
	double raiz2;
	Scanner reader = new Scanner(System.in);
	System.out.println("Introduzca valor de a: ");
	a = reader.nextInt();
	System.out.println("Introduzca valor de b: ");
	b = reader.nextInt();
	System.out.println("Introduzca valor de c: ");
	c = reader.nextInt();
	
			discrim=Math.sqrt(Math.pow(b, 2)-(4*a*c)); 
			System.out.println("El discriminante es: "+discrim);
	
	raiz1=(-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
	raiz2=(-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
	
	System.out.println("Solucion raiz1 ="+raiz1);
	System.out.println("Solucion raiz2 ="+raiz2);
}
}