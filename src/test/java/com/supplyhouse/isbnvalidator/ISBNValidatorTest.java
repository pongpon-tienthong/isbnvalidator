package com.supplyhouse.isbnvalidator;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ISBNValidatorTest {

	@Test
	public void validateValidTenDigitISBNShouldReturnTrue() {
		ISBNValidator isbnValidator = new ISBNValidator();
		boolean result = isbnValidator.validate("0140449116");

		assertTrue(result);
	}
}
