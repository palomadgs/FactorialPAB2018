package org.uma.pab2018.Factorial;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {
	
	private Factorial factorial;
	
	//Gracias a esto puedo borrar : Factorial factorial = new Factorial(); en cada clase
	@Before 
	public void init() {
		factorial = new Factorial();
	}
	
	/*
	 * Definimos la primera prueba como Test.
	 */
	@Test
	public void shouldFactorialOfZeroReturnOne() {
		int result = factorial.compute(0); //sale en rojo porque no esta implementado
		int expectedResult = 1;
		
		//Comprobaciones de que un valor debe dar lo que debe
		assertEquals(expectedResult, result);
	}
	
	/*
	 * MUY IMPORTANTE DOCUMENTAR
	 * this test checks factorial 1
	 * 
	 * Si ponemos un nombre a la clase muy significativo, no hay porque documentar
	 */
	@Test
	public void shouldFactorialOfOneReturnOne() {
		int result = factorial.compute(1); //sale en rojo porque no esta implementado
		int expectedResult = 1;
		
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void shouldFactorialOfTwoReturnTwo() {
		int result = factorial.compute(2); //sale en rojo porque no esta implementado
		int expectedResult = 2;
		
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void shouldFactorialOfThreeReturnSix() {
		int result = factorial.compute(3); //sale en rojo porque no esta implementado
		int expectedResult = 6;
		
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void shouldFactorialOfFiveReturn120() {
		int result = factorial.compute(5); //sale en rojo porque no esta implementado
		int expectedResult = 120;
		
		assertEquals(expectedResult, result);
	}
	
	@Test(expected = RuntimeException.class) 
	public void shouldFactorialOfANegativeNumberReturnException() {
		factorial.compute(-1); //sale en rojo porque no esta implementado
	}
	
	@After
	public void tearDown() {
		factorial = null;
	}
}
