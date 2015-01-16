import java.util.Scanner;


public class T3Ejercicio10 {

	public static void main(String[] args) {
		
		float notas;
		int i=0;
		int aprobados=0;
		int condicionados=0;
		int suspensos=0;
		
		do {
			i++;
			Scanner reader = new Scanner(System.in);
			System.out.println("Introduzca notas: ");
			notas = reader.nextFloat();
			
			if (notas<5){
				aprobados++;
			}
			
			if (notas>4){
				suspensos++;
			}
			
			if (notas==4){
				condicionados++;
			}
			
	}while (i!=6);

		System.out.println("Numero de aprobados: "+aprobados);
		System.out.println("Numero de suspendidos: "+suspensos);
		System.out.println("Numero de condicionados: "+condicionados);
}
}
