package com.stefanomaglione.demoCI.CD;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	@Test
	void contextLoads() {
	}

	@Test
	void testNegative() {
		assert (false);
	}

}
