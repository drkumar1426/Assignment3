package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.count("alphabet");
		assertEquals(2, output);
	}

}
