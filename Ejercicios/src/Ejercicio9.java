import java.util.*;
/**
 * 
 * @author Héctor Juan Soria
 * @description Escribir un programa en Java que pregunte un nombre, direcci´on y tel´efono
 y escriba en pantalla una ficha con dicha informaci´on.
 *
 */
public class Ejercicio9 {
public static void main(String args[]){
	String nombre;
	String direccion;
	int telefono;
	
	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduzca los siguientes valores:" );
	System.out.println("-.,.-.,.-.,.-.,.-.,.-.,.-.,.-.,.-.,-.,.-.,.-.,.-.,.-.,.-.,.-.,.-.,.-.,");
	System.out.println("Nombre: ");
	nombre= teclado.nextLine();
	System.out.println("Direccion: ");
	direccion= teclado.nextLine();
	System.out.println("Telefono: ");
	telefono= teclado.nextInt();
	
	System.out.println("Nombre: "+nombre);
	System.out.println("Direccion: "+direccion);
	System.out.println("Telefono: "+telefono);
	
	
}
}
