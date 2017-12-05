package fr.simplifia.input.validator;

import fr.simplifia.input.exception.InputException;

public interface SmpInputValidator {
   String  validateInput( String input) throws InputException;
}
