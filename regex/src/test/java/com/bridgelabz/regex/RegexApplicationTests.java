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

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserInputValidation userInputValidation = new UserInputValidation();
		boolean result = userInputValidation.isValidLastName("Sonawane");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserInputValidation userInputValidation = new UserInputValidation();
		boolean result = userInputValidation.isValidLastName("So");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue() {
		UserInputValidation userInputValidation = new UserInputValidation();
		boolean result = userInputValidation.isValidEmail("kunalsonawane730@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenNotValid_ShouldReturnFalse() {
		UserInputValidation userInputValidation = new UserInputValidation();
		boolean result = userInputValidation.isValidEmail("Kunalsonawane..675.gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenMobileNum_WhenProper_ShouldReturnTrue() {
		UserInputValidation userInputValidation = new UserInputValidation();
		boolean result = userInputValidation.isValidMobileNumber("91 9087654321");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenMobileNum_WhenNotProper_ShouldReturnFalse() {
		UserInputValidation userInputValidation = new UserInputValidation();
		boolean result = userInputValidation.isValidMobileNumber("908765-4321908");
		Assert.assertEquals(false, result);
	}
}