package fr.simplifia.input.validator.impl;

import fr.simplifia.input.exception.InputException;
import fr.simplifia.souhaib.keys.MyCustomKeys;

import java.util.Locale;

public class SmpDefaultInputValidator extends AbstractSmpInputValidator {

	private static String REGEXP = ".*";
	private Locale locale;

	protected SmpDefaultInputValidator(Locale locale) {
		super(locale);
		this.locale = locale;
	}

	@Override
	public String validateInput(String input) throws InputException {
		
		StringBuilder inputBuilder = new StringBuilder(input);
		
		if (!input.matches(REGEXP)) {
			throw new InputException("The input given is not compatible with the default validation strategy");
		}

		if (locale.getLanguage().equals(MyCustomKeys.ENG)) {
			System.out.println("English is the choosen language :D");
			
			
			
			// looping through the input characters and replace them if it's necessary 
			for (int i = 0; i < inputBuilder.length(); i++) {
				char c = inputBuilder.charAt(i);
				if (c == "é".toCharArray()[0] || c == "ê".toCharArray()[0] || c == "è".toCharArray()[0]) {
					inputBuilder.setCharAt(i, "e".toCharArray()[0]);
				}
			}
			input = inputBuilder.toString();
		}
		if (locale.getLanguage().equals(MyCustomKeys.FR)) {
			System.out.println("Vous avez choisie le Français comme langage :D");
			//Process for the french language	
		}
		
		return input;

	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

}
