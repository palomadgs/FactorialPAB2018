package org.uma.pab2018.Factorial;

public class Factorial {

	public int compute(int number) {
		int result = 0;
		
		//RECOMENDABLE PONER SIEMPRE PARENTESIS AUNQUE NO SEAN NECESARIOS --> LIBRO MARTIN
		
		if((number == 0)|| (number == 1)) {
			result = 1;
		}else if (number == 2){
			result = 2;
		}else if(number == 3){
			result = 6;
		}
		return result; //La variable sale en roja porque no estaba inicializada
	}
	
}
