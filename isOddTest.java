package junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class isOddTest {

	@Test
	void test() {

		assertEquals(true,  JUnitTesting.isOdd(1));
	}

}
