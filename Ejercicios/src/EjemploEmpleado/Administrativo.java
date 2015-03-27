package EjemploEmpleado;

public class Administrativo extends Empleado {

	private Jefe b0ss;

	public Administrativo(String nombre, float salario, int anyo_alta, Jefe boss) {
		// TODO Auto-generated constructor stub
		super(nombre, salario, anyo_alta);
		setB0ss(boss);
	}
	

	public Jefe getB0ss() {
		return b0ss;
	}

	public void setB0ss(Jefe b0ss) {
		this.b0ss = b0ss;
	}
	

}