package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(4, 2);
		assertEquals(2, output);
	}

}
