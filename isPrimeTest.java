package junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class isPrimeTest {

	@Test
	void test() {

		assertEquals(true,  JUnitTesting.isPrime(2));
	}

}
