package Calc;

public class Operacion {

	private double a;
	private double b;
	
	public Operacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Operacion(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public double getA() {
		return a;
	}
	
	public void setA(double a) {
		this.a = a;
	}
	
	public double getB() {
		return b;
	}
	
	public void setB(double b) {
		this.b = b;
	}
	
	public double suma() {
		return a+b;
	}

	public double resta() {
		return a-b;
	}

	public double multiplicacion() {
		return a*b;
	}

	public double division() {
		return a/b;
	}
	
	public double potenciacion() {
		return Math.pow(a, b);
	}
}
