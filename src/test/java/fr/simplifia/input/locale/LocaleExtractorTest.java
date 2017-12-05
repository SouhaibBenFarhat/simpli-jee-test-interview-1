package fr.simplifia.input.locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import fr.simplifia.input.exception.InputException;

import java.util.Locale;

import static org.testng.Assert.*;

@RunWith(JUnit4.class)
public class LocaleExtractorTest {
    @Test
    public void testToLocale() throws Exception {
        assertEquals(Locale.FRENCH, LocaleExtractor.toLocale("fr"));
    }

    @Test
    public void testToLocaleEn() throws Exception {
    	
    	assertEquals(Locale.ENGLISH, LocaleExtractor.toLocale("en"));
    }

    @Test(expected = NullPointerException.class)
    public void testToLocaleNull() throws Exception {
        LocaleExtractor.toLocale(null);
    }

    @Test(expected = InputException.class)
    public void testToLocaleNEmpty() throws Exception {
    	LocaleExtractor.toLocale("");
    }


}