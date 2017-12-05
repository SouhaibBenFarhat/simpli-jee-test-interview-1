package fr.simplifia.input.validator.impl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Locale;

import org.testng.annotations.Test;

/**
 * Created by simplifia on 18/09/17.
 */
public class SmpInputValidatorFactoryTest {
    @org.junit.Test
    public void testFromLocaleFrench() throws Exception {
        
        assertTrue(SmpInputValidatorFactory.fromLocale(Locale.FRENCH) instanceof SmpDefaultInputValidator);
    }

    @Test
    public void testFromLocaleEnglish() throws Exception {
        assertTrue(SmpInputValidatorFactory.fromLocale(Locale.ENGLISH) instanceof SmpDefaultInputValidator);
    }

}