package fr.simplifia.input.validator.impl;

import fr.simplifia.input.validator.SmpInputValidator;

import java.util.Locale;

public class SmpInputValidatorFactory {

	public static SmpInputValidator fromLocale(final Locale locale) throws NullPointerException {
		final SmpInputValidator result;
	
		// Find out if the user is using a valid language...
		try {
			 locale.getLanguage();
		}catch (NullPointerException e) {
				System.out.println("This language does not exist, or it's not handled by our system");
				return null;
				
		}
		
		switch (locale.getLanguage()) {

		case "fr":
			result = new SmpDefaultInputValidator(locale);
			break;
		case "en":
			result = new SmpDefaultInputValidator(locale);
			break;
		default:
			result = new SmpDefaultInputValidator(locale);
			break;
		}
		return result;
	}
}
