import java.util.Scanner;

public class EjercicioRepaso1 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		float matriculados;
		float grupo = 14;
		float sesiones = 15;
		float i;
		float c;
		float d = 1;
		float asistencia = 0;
		float faltaAsist = 0;
		float sumaAsistencia;
		float min = 0;
		float minnum = 0;
		float mediaMax = 0;
		float grupoMax = 0;

		for (i = 0; i < grupo; i++) {
			System.out.println("Indique cuantos alumnos se han matriculado: ");
			matriculados = reader.nextFloat();
			sumaAsistencia = 0;
			faltaAsist = 0;

			for (c = 0; c < sesiones; c++) {
				System.out.println("Introduzca los alumnos que han asistido");
				asistencia = reader.nextInt();

				sumaAsistencia = sumaAsistencia + matriculados;

				if (c == 0) {
					min = matriculados;
				}

				if (matriculados < min) {
					min = matriculados;
					minnum = c;
				}

				if (asistencia < (matriculados / 2)) {
					faltaAsist++;

				}

				if (faltaAsist >= 10) {
					System.out
							.println("Baja asistencia del grupo, se clausurará esta clase");
					break;
				}

			}//for c

			if (faltaAsist < 10) {
				float media = sumaAsistencia / c;

				if (i == 0) {
					mediaMax = media;
					grupoMax = i;
				}
				if (media > mediaMax) {
					mediaMax = media;
				}
				System.out.println("Asistencia media " + media);
				System.out.println("La sesión con menos alumnos ha sido: "
						+ minnum);
				System.out.println("La asistencia maxima: " + grupoMax);
			}

		}//for i

	}
}
