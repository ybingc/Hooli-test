package com.simplilearn.TestDemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestDemoApplicationTests {

	//@Test
	//void contextLoads() {
	//}

	public static int getNumber10() {
	    return 10;
	}
	@Test
	public void test1() {
	    assertEquals(10, getNumber10());
	}

}
