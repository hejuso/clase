package EjemploEmpleado;

public class Empleado {
	
	private String nombre;
	private float salario;
	protected int anyo_alta;
	public static final int INICIO_EMPRESA = 1900;
	
	public Empleado(String nombre_, float salario_, int anyo_alta_){
		
		this.nombre = nombre_;
		this.salario = salario_;
		this.anyo_alta = anyo_alta_;
		
	}
	
	public Empleado(){
		
	}
	
	public String getNombre(){
	return nombre;	
	}
	
	public float getSalario(){
		return salario;
	}
	
	public int getAnyo_alta(){
		return anyo_alta;
	}
	
	public void IncSalario(float subida){
		
		salario+=subida;
		
	}
	
	
	/*public void setAnyoAlta(int anyoAlta){
		
		super.setAnyoAlta(anyoAlta);
		
	}
	*/
}
