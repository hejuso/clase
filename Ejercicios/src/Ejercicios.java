import java.util.Scanner;

public class Ejercicios {
private static Scanner teclado;

public static void main(String[] args) { 
	teclado = new Scanner(System.in);
	 int x; 
	 int y;
	 String cadena; 
	 boolean resultado; 
	 System.out.println("Introducir primer n�mero:"); 
	 x = teclado.nextInt();//pedimos el primer n�mero 
	 System.out.println("Introducir segundo n�mero:"); 
	 y = teclado.nextInt();//pedimos el segundo n�mero 
	 cadena=(x==y)?"iguales":"distintos"; 
	 System.out.printf("Los n�meros %d y %d son %s\n", x, y, cadena);
	 resultado=(x!=y); 
	 System.out.println("x != y //es "+resultado); 
	 resultado=(x<y); 
	 System.out.println("x < y //es "+resultado); 
	 resultado=(x>y); 
	 System.out.println("x > y //es "+resultado );
} 
} 