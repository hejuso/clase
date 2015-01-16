import java.util.*;
public class Ejercicio16 {
	public static void main (String args[]){
	
		double radio;
		double volumen;
		double superficie;
	
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca el valor del radio: ");
			radio = reader.nextDouble();
			superficie=4*Math.PI*Math.pow(radio, 2);
		System.out.println("Superficie= "+superficie);
			volumen=(4/3)*Math.PI*Math.pow(radio, 3);
		System.out.println("Volumen= "+volumen);
}
}
