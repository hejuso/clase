import java.util.Scanner;

public class ArrayEjercicio6 {

	public static void main(String[] args) {

		String nombreOp[] = new String [6];
		int sueldoOp[] = new int[6];
		int i;
		int sueldoMax=0;
		String nombreOpMayor = null;

		Scanner reader = new Scanner(System.in);

		for (i = 0; i < 5; i++) {

			System.out.println("Introduzca el nombre del operario: ");
			nombreOp[i] = reader.next();
			System.out.println("");
			System.out.println("Introduzca su sueldo: ");
			sueldoOp[i] = reader.nextInt();

			if (i == 0) {
				sueldoOp[i] = sueldoMax;

			}

			if (sueldoOp[i] > sueldoMax) {
				
				sueldoMax = sueldoOp[i];
				nombreOpMayor = nombreOp[i];
				
			}
			
			

			
		}
		
		System.out.println("El sueldo maximo es de "+nombreOpMayor+" con: "+sueldoMax+"€");
		

	}
}
