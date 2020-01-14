package com.hajepierre.algo.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.hajepierre.algo.NumberFizzBuzzer;

class BuzzTest {

	@Test
	void test() {
		NumberFizzBuzzer buzzer = new NumberFizzBuzzer();
		String msg = buzzer.printFizzBuzz(25);
		System.out.println(msg);
		assertEquals("Buzz", msg);
	}

}
