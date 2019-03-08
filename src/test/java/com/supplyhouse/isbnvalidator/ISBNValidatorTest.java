package com.supplyhouse.isbnvalidator;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ISBNValidatorTest {

	@Test
	public void failForSure() {
		fail("Fail for sure!");
	}

	@Test
	public void validateValidTenDigitISBNShouldReturnTrue() {
		ISBNValidator isbnValidator = new ISBNValidator();
		boolean result = isbnValidator.validate("0140449116");

		assertTrue(result);
	}
}
