/*
* Unit test cases for Calculator

*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class CalculatorUnitTestCase{

	public void testOperation() {
		Calculator c = new Calculator();
		assertEquals(5, c.Operation(3,2,"Addition"));
		assertEquals(1, c.Operation(3,2,"Subtraction"));
		assertEquals(6, c.Operation(3,2,"Multiplication"));
		assertEquals(3, c.Operation(6,2,"Division"));
	}
}