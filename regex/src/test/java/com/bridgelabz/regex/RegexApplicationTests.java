package com.bridgelabz.regex;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RegexApplicationTests {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserInputValidation userInputValidation = new UserInputValidation();
		boolean result = userInputValidation.isValidFirstName("Sam");
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
		boolean result = userInputValidation.isValidLastName("Shashank");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserInputValidation userInputValidation = new UserInputValidation();
		boolean result = userInputValidation.isValidLastName("ra");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue() {
		UserInputValidation userInputValidation = new UserInputValidation();
		boolean result = userInputValidation.isValidEmail("shashankrathore@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenNotValid_ShouldReturnFalse() {
		UserInputValidation userInputValidation = new UserInputValidation();
		boolean result = userInputValidation.isValidEmail("shashankrathore..606.gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenMobileNum_WhenProper_ShouldReturnTrue() {
		UserInputValidation userInputValidation = new UserInputValidation();
		boolean result = userInputValidation.isValidMobileNumber("91 8696710796");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenMobileNum_WhenNotProper_ShouldReturnFalse() {
		UserInputValidation userInputValidation = new UserInputValidation();
		boolean result = userInputValidation.isValidMobileNumber("86967-10796");
		Assert.assertEquals(false, result);
	}
}