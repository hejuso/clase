import java.util.*;
public class Ejercicio15 {
	public static void main (String arg[]){
	
		double L1= 0;
		double L2= 0;
		double L3= 0;
		double SP;
		double resultado;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca valor para L1: ");
		L1 = reader.nextDouble();
		System.out.println("Introduzca valor para L2: ");
		L2 = reader.nextDouble();
		System.out.println("Introduzca valor para L3: ");
		L3 = reader.nextDouble();
		SP=(L1+L2+L3)/2;
		System.out.println("(L1+L2+L3)/2= "+SP);
		resultado=Math.sqrt(SP*(SP-L1)*(SP-L2)*(SP-L3));
		System.out.println("SP*(SP - L1)*(SP - L2)*(SP - L3)= "+resultado);
}
}
