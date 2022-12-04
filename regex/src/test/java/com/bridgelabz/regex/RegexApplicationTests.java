package com.bridgelabz.regex;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RegexApplicationTests {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserInputValidation userInputValidation = new UserInputValidation();
		boolean result = userInputValidation.isValidFirstName("Dipali");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserInputValidation userInputValidation = new UserInputValidation();
		boolean result = userInputValidation.isValidFirstName("Pr");
		Assert.assertEquals(false, result);
	}
}
