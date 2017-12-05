package fr.simplifia.transform;

import fr.simplifia.input.validator.SmpInputValidator;
import fr.simplifia.input.validator.impl.SmpDefaultInputValidator;
import fr.simplifia.souhaib.keys.MyCustomKeys;

public class SmpDataTransformer {

    private SmpInputValidator validator;
    private static final String MESSAGE_FR = " : bienvenue chez Simplifia!";
    private static final String MESSAGE_ENG = " : Welcome to Simplifia!";
    public SmpDataTransformer(final SmpInputValidator validator) {
        this.validator = validator;
    }

    public String transform( String input){
        String validInput = validator.validateInput(input);
        final StringBuffer buffer = new StringBuffer();
        buffer.append(validInput);
        
        if(((SmpDefaultInputValidator)validator).getLocale().getLanguage().equals(MyCustomKeys.FR)) {
        	 buffer.append(MESSAGE_FR);
        } if(((SmpDefaultInputValidator)validator).getLocale().getLanguage().equals(MyCustomKeys.ENG)) {
        	 buffer.append(MESSAGE_ENG);
        }
        
        return buffer.toString();
    }

}
