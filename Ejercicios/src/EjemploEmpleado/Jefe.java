/**
 * 
 */
package EjemploEmpleado;

/**
 * @author hejuso
 * 
 */
public class Jefe extends Empleado {

	/**
	 * Herencias
	 */
	protected String nombre = "Luis";


	private float bonificacion;

	public Jefe(String nombre, float salario, int anyo_alta, float bonificacion) {
		// TODO Auto-generated constructor stub

		super(nombre, salario, anyo_alta);
		this.setBonificacion(bonificacion);

	}

	public float getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(float bonificacion) {
		this.bonificacion = bonificacion;
	}

	public float getSalario() {

		float nuevoSal = super.getSalario()
				+ (super.getSalario() * bonificacion);
		return nuevoSal;

	}

	public String getDescription() {
		return "Soy " + getNombre() + " y gano " + getSalario() + "€";
	}
	
	public int getAnyoAlta(){
		int anyo_actual = 2015;
		if(anyo_alta>=INICIO_EMPRESA && anyo_alta <= anyo_actual){
			
			this.anyo_alta = anyo_alta;
			
		}else{
			this.anyo_alta = anyo_actual;
		}
		return anyo_alta;
	}

}
