package com.inforcap.calculadora;

public class Calculadora{
	
	private double num1;
	private double num2;
	private String operacion = "";
	double result;	
	
	public Calculadora() {
	}

	public void performOperation() {
			
		if (operacion.equals("+")) {
			result = num1 + num2;
		}else if(operacion.equals("-")) {
			result = num1 - num2;
		}
	}

	public void setOperandOne(double num1) {
		this.num1 = num1;
		System.out.println("El Primer número para ejecutar la operación es: "+getNum1());
	}

	public void setOperandTwo(double num2) {
		this.num2 = num2;
		System.out.println("El Segundo número para ejecutar la operación es: "+getNum2());
	}

	public void setOperation(String operacion) {
		this.operacion = operacion;				
	}
	
	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	void getResult() {
		if (operacion.equals("+")) {
			System.out.println("El resultado de la suma es: "+this.result);
		}else if(operacion.equals("-")) {
			System.out.println("El resultado de la resta es: "+this.result);
		}
		
	}
	
}
	




