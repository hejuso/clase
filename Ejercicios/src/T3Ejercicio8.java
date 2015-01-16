import java.util.*;

public class T3Ejercicio8 {

	public static void main(String[] args) {

		char letra ;
		char mayuscula;
		
		do{
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca una letra: ");
		letra = reader.next().charAt(0);
		mayuscula= (char) ('A' + (letra-'a'));
		
		System.out.println(mayuscula);
		}while (letra >='a' && mayuscula <= 'z');
		
	}

}