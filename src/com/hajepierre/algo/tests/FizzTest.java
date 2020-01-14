package com.hajepierre.algo.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.hajepierre.algo.NumberFizzBuzzer;

class FizzTest {

	@Test
	void test() {
		NumberFizzBuzzer buzzer = new NumberFizzBuzzer();
		String msg = buzzer.printFizzBuzz(9);
		System.out.println(msg);
		assertEquals("Fizz", msg);
	}

}
