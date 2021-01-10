package aulaJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TesteJUnit {

	@Test
	void testarSeIgualADois() {
		int a = 1 + 1;
		assertEquals(2, a);
		
		//fail("Not yet implemented");
	}

	@Test
	void testarSeIgualATres() {
		
		int x = 2 + 10 - 9;
		assertEquals(3, x);
		
		//fail("Not yet implemented");
	}
}
