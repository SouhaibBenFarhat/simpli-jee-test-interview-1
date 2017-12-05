package fr.simplifia.input.validator.impl;

import fr.simplifia.input.validator.SmpInputValidator;

import java.util.Locale;

public abstract class AbstractSmpInputValidator implements SmpInputValidator {

    protected Locale locale;

    public AbstractSmpInputValidator(final Locale locale) {
        this.locale = locale;
    }
}
