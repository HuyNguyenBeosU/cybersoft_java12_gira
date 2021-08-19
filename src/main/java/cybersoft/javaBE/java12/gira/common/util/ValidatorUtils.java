package cybersoft.javaBE.java12.gira.common.util;

import javax.validation.ConstraintValidatorContext;

public class ValidatorUtils {
	public static void addError(String message, ConstraintValidatorContext context) {
		context.buildConstraintViolationWithTemplate(message)
		.addConstraintViolation()
		.disableDefaultConstraintViolation();
	}

}
