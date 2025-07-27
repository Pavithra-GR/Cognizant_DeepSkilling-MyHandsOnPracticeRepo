
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import junittest.Calculator;

public class CalculatorTest {
	Calculator calculator=new Calculator();
	@Test
public void testAdd() {
	int res=calculator.add(10,20);
	assertEquals(30, res);
}
	@Test
public void testAdd1() {
	int res=calculator.add(1,20);
	assertEquals(21, res);
}
	@Test
public void testSub() {
	int res=calculator.sub(10,5);
	assertEquals(5, res);
}
}
