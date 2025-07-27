
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junittest.Calculator;

public class CalculatorTest {
	Calculator calculator;
	
	@BeforeEach
	public void setUp() {
		System.out.println("Setting up Calculator Object...");
		calculator=new Calculator();
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("Cleaning up after test");
		calculator=null;
	}
	
	@Test
	public void testAddition(){
		int a=10;
		int b=5;
		int res=calculator.add(a, b);
		assertEquals(15,res,"10+5 should equal 15");
	}
	@Test
	public void testMul(){
		int a=10;
		int b=5;
		int res=calculator.multiply(a,b);
		assertEquals(50,res,"10*5 should equal 50");
	}
}
