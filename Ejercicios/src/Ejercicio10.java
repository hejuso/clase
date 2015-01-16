import java.util.*;
public class Ejercicio10 {
	public static void main(String arg[]){
	float farenheit=0;
	Scanner reader = new Scanner(System.in);

	System.out.println("Introduzca grados Farenheit: ");
	farenheit = reader.nextFloat();
	float celsius =(farenheit-32)/1.8f;
	System.out.println("Resultado: "+celsius);
	
}
}