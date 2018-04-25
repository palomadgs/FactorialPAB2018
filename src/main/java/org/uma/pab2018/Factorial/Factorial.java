package org.uma.pab2018.Factorial;

public class Factorial {

	public int compute(int number) {
		int result = 0;
		
		//RECOMENDABLE PONER SIEMPRE PARENTESIS AUNQUE NO SEAN NECESARIOS --> LIBRO MARTIN
		if (number < 0) {
			throw new RuntimeException();
		} else if((number == 0)|| (number == 1)) {
			result = 1;
		}else {
			result = number * compute(number-1);
		}
		return result; //La variable sale en roja porque no estaba inicializada
	}
	
	//Mi programa no compruaba si el numero es muy grande o negativo
}
