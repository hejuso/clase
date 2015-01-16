import java.util.Scanner;


public class Ejercicio12 {
public static void main (String arg[]){
	double num1=0;
	double num2=0;
	double resulSuma;
	double resulResta;
	double resulMulti;
	double resulDiv;
	double potencia;
	double raiz;
	
	Scanner reader = new Scanner(System.in);
	System.out.println("Introduzca num1" );
	num1 = reader.nextDouble();
	System.out.println("Introduzca num2" );
	num2 = reader.nextDouble();
	
	System.out.println("num1= "+num1);
	System.out.println("num2= "+num2);
	resulSuma=num1+num2;
	System.out.println("num1 + num2= "+resulSuma);
	resulResta=num1-num2;
	System.out.println("num1 - num2= "+resulResta);
	resulMulti=num1*num2;
	System.out.println("num1 * num2= "+resulMulti);
	resulDiv= num1/num2;
	System.out.println("num1 / num2= "+resulDiv);
	potencia=Math.pow(num1, 2) ;
	System.out.println("num1^2= "+potencia);
	raiz=Math.sqrt(num1);
	System.out.println("√num1= "+raiz);
}
}