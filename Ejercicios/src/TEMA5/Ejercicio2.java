package TEMA5;

public class Ejercicio2 {

	//atributos
	
	private double radio;
	private double longitud;
	private double area;
	
	private double mayor;
	
	
	//metodos
	
	public void asignaRadio(double x){
		radio = x;
	}

	public double daRadio(){
		
		System.out.println("Radio: "+radio);
		return radio;
	}
	
	public double longitud(){
		
		longitud = 2*3.14*radio;
		System.out.println("Longitud de la circumferencia : "+longitud);
		return longitud;
		
	}
	
	public double area(){
		
		area = 3.14 * Math.pow(radio,2);
		System.out.println("Area de la circumferencia : "+area);
		return area;
	}

	public boolean mayorQue(Ejercicio2 mayor){
		
		if (this.area<mayor.area){
			System.out.println("El cirulo 2 es mayor que el circulo 1");
			return (true);
			
		}else{
			return (false);
		}
		
	}

	
}
