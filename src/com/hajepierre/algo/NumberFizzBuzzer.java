package com.hajepierre.algo;

public class NumberFizzBuzzer {
	public String printFizzBuzz(Integer number) {
		if (isMultipleOf3(number)) {
			if (isMultipleof5(number)) {
				if (isFibonacci(number)) {
					return "Pink Flamingo";
				}
				// Return FizzBuzz
				else {
					return "FizzBuzz";
				}
			}
			// Return Fizz
			else {
				if (isFibonacci(number)) {
					return "Flamingo";
				} else {
					return "Fizz";
				}
			}
		} else {
			// Return Buzz
			if (isMultipleof5(number)) {
				return "Buzz";
			} else { // Return Flamingo
				if (isFibonacci(number)) {
					// System.out.println("Flamingo");
					return "Flamingo";
				}
				// Return the number
				else {
					return number.toString();
				}
			}
		}
	}

	private boolean isMultipleOf3(int n) {
		return n % 3 == 0;
	}

	private boolean isMultipleof5(int n) {
		return n % 5 == 0;
	}

	private boolean isInt(Double n) {
		return n == n.intValue();
	}

	private boolean isFibonacci(int n) {
		// Compute the square of the number
		int sq = square(n);
		int addPart = 5 * sq + 4;
		int subPart = Math.abs(5 * sq - 4);
		return isPerfectSquare(addPart) || isPerfectSquare(subPart);
	}

	private int square(int n) {
		return n * n;
	}

	private boolean isPerfectSquare(int n) {
		// Get the root square of the number
		Double rootSquare = Math.sqrt(n);
		return isInt(rootSquare);
	}
}
