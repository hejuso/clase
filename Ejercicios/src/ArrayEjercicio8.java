import java.util.Scanner;

public class ArrayEjercicio8 {

	public static void main(String[] args) {

		int sueldo[] = new int[5];
		int menorMayor;
		int i;
		int c;

		Scanner reader = new Scanner(System.in);

		for (i = 0; i < 5; i++) {

			System.out.println("Introduzca su sueldo: ");
			sueldo[i] = reader.nextInt();

		}

		for (c = 0; c < 4; c++) {

			for (i = 0; i < 4; i++) {

				if (sueldo[i] > sueldo[i + 1]) {
					
					menorMayor= sueldo[i];
					sueldo [i] = sueldo [i+1];
					sueldo [i+1] = menorMayor;
					
				}
			
			}// for i

		} // for c
		for (i=0; i<5 ; i++){
			
			System.out.println(sueldo [i]);
			
		}//mostrar comparación
		
	}//fin main

}
