package fr.simplifia.transform;

import fr.simplifia.input.locale.LocaleExtractor;
import fr.simplifia.input.validator.SmpInputValidator;
import fr.simplifia.input.validator.impl.SmpInputValidatorFactory;

import static org.junit.Assert.assertEquals;

import java.util.Locale;

import org.junit.Test;

public class SmpDataTransformerTest {

	final String localeReadFR = "fr";
	final String localeReadEN = "en";

	public SmpDataTransformerTest() {

	}

	@Test
	public void testTransformOk() throws Exception {

		Locale locale = LocaleExtractor.toLocale(localeReadEN);
		String input = "école première empêchement";
		SmpInputValidator validator = SmpInputValidatorFactory.fromLocale(locale);
		SmpDataTransformer transformer = new SmpDataTransformer(validator);
		String transformedInput = transformer.transform(input);
		assertEquals("ecole premiere empechement : Welcome to Simplifia!", transformedInput);

	}

	@Test
	public void testTransformNotOk() throws Exception {

		Locale locale = LocaleExtractor.toLocale(localeReadFR);
		String input = "école première empêchement";
		SmpInputValidator validator = SmpInputValidatorFactory.fromLocale(locale);
		SmpDataTransformer transformer = new SmpDataTransformer(validator);
		String transformedInput = transformer.transform(input);
		assertEquals("école première empêchement : bienvenue chez Simplifia!", transformedInput);

	}

	@Test
	public void testTransformEmptyFrench() throws Exception {

		final Locale locale = LocaleExtractor.toLocale(localeReadFR);
		String input = "";
		final SmpInputValidator validator = SmpInputValidatorFactory.fromLocale(locale);
		final SmpDataTransformer transformer = new SmpDataTransformer(validator);
		final String transformedInput = transformer.transform(input);
		assertEquals("Chaine vide", transformedInput);

	}
	
	@Test
	public void testTransformEmptyEnglish() throws Exception {

		final Locale locale = LocaleExtractor.toLocale(localeReadEN);
		String input = "";
		final SmpInputValidator validator = SmpInputValidatorFactory.fromLocale(locale);
		final SmpDataTransformer transformer = new SmpDataTransformer(validator);
		final String transformedInput = transformer.transform(input);
		assertEquals("Empty String", transformedInput);

	}

	@Test
	public void testTransformNull() throws Exception {

	}

}