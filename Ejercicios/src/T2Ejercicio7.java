import java.util.Scanner;

public class T2Ejercicio7 {
	public static void main(String Arg[]) {
		
		float patinPed= 2;
		float patinMot= 6;
		float windsrf= 4;
		float motAcu= 7;
		float horas;
		float opcion;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Seleccione su vehículo");
		System.out.println("Para seleccionar Patín a pedales escriba: 1");
		System.out.println("Para seleccionar Patín a motor escriba: 2");
		System.out.println("Para seleccionar Tabla de windsurf escriba: 3");
		System.out.println("Para seleccionar Moto acuática escriba: 4");
		opcion = reader.nextFloat();
		System.out.println("Introduzca el tiempo: ");
		horas= reader.nextFloat();
		
		float opcion1 = patinPed * horas;
		float opcion2 = patinMot * horas;
		float opcion3 = windsrf * horas;
		float opcion4 = motAcu * horas;
		
		if (opcion == 1){
			System.out.println("El precio de el patín a pedales sería "+opcion1);
		}
		else if (opcion == 2){
			System.out.println("El precio de el patín a motor sería "+opcion2);
		}
		else if (opcion == 3){
			System.out.println("El precio de la tabla de windsurf sería "+opcion3);
		}
		else if (opcion == 4){
			System.out.println("El precio de la moto acuatica sería "+opcion4);
		}
		
		
	}
}
