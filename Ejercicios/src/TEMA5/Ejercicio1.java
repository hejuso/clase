package TEMA5;

public class Ejercicio1 {
	
		double pReal;
		double pImag;


	void asignar(double x, double y) {
		
		pReal=x;
		pImag=y;

	}
	
	public void sumar(Ejercicio1 b){
		
		this.pReal=this.pReal + b.pReal;
		this.pImag=this.pImag + b.pImag;
	}
	
	public void imprimir(){
		System.out.println("Suma de número real: "+pReal);
		System.out.println("Suma de número imaginario: "+pImag);
	}

}
