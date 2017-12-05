package fr.simplifia.transform;

import fr.simplifia.input.locale.LocaleExtractor;
import fr.simplifia.input.validator.SmpInputValidator;
import fr.simplifia.input.validator.impl.SmpInputValidatorFactory;

import static org.junit.Assert.assertEquals;

import java.util.Locale;

import org.junit.Test;

public class SmpDataTransformerTest {


	public SmpDataTransformerTest() {
		//validator = Mockito.mock(SmpInputValidator.class);
		// TODO : mocking strategy
		// when(validator.validateInput(input)).thenReturn();
	}

	@Test
	public void testTransformOk() throws Exception {

		final String localeRead = "en";
		final Locale locale = LocaleExtractor.toLocale(localeRead);

		String input = "école première empêchement";
		final SmpInputValidator validator = SmpInputValidatorFactory.fromLocale(locale);
		final SmpDataTransformer transformer = new SmpDataTransformer(validator);
		final String transformedInput = transformer.transform(input);
		
        assertEquals("ecole premiere empechement : Welcome to Simplifia!", transformedInput);
		

	}

	@Test
	public void testTransformNotOk() throws Exception {
		
		final String localeRead = "fr";
		final Locale locale = LocaleExtractor.toLocale(localeRead);

		String input = "école première empêchement";
		final SmpInputValidator validator = SmpInputValidatorFactory.fromLocale(locale);
		final SmpDataTransformer transformer = new SmpDataTransformer(validator);
		final String transformedInput = transformer.transform(input);
		
        assertEquals("école première empêchement : bienvenue chez Simplifia!", transformedInput);

	}

	@Test
	public void testTransformEmpty() throws Exception {

	}

	@Test
	public void testTransformNull() throws Exception {

	}

}