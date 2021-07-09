package com.inforcap.calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {
		
		Calculadora calcular = new Calculadora();
		
		//calcular.performOperation(10.5,5.2);
		//calcular.getResult();
		
		calcular.setOperandOne(10.5);
		calcular.setOperandTwo(5.2);
		calcular.setOperation("+");
	    calcular.performOperation();
	    calcular.getResult();
		
	}

}
