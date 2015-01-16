import java.util.Scanner;

public class Ejercicios {
private static Scanner teclado;

public static void main(String[] args) { 
	teclado = new Scanner(System.in);
	 int x; 
	 int y;
	 String cadena; 
	 boolean resultado; 
	 System.out.println("Introducir primer número:"); 
	 x = teclado.nextInt();//pedimos el primer número 
	 System.out.println("Introducir segundo número:"); 
	 y = teclado.nextInt();//pedimos el segundo número 
	 cadena=(x==y)?"iguales":"distintos"; 
	 System.out.printf("Los números %d y %d son %s\n", x, y, cadena);
	 resultado=(x!=y); 
	 System.out.println("x != y //es "+resultado); 
	 resultado=(x<y); 
	 System.out.println("x < y //es "+resultado); 
	 resultado=(x>y); 
	 System.out.println("x > y //es "+resultado );
} 
} 