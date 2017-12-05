import fr.simplifia.input.locale.LocaleExtractor;
import fr.simplifia.input.validator.SmpInputValidator;
import fr.simplifia.input.validator.impl.SmpInputValidatorFactory;
import fr.simplifia.transform.SmpDataTransformer;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(final String[] arg) {
        final Scanner scanInput = new Scanner(System.in);
        System.out.println("Enter your locale (fr,en,de...): ");
        final String localeRead = scanInput.nextLine();
        
        // get locale language entered by the user
        final Locale locale = LocaleExtractor.toLocale(localeRead);


        System.out.println("Enter your text : ");
        
        // get text content 
        String input = scanInput.nextLine();
        scanInput.close();

        
        
        //Testing commit
        //Validate the language entered by the user
        final SmpInputValidator validator = SmpInputValidatorFactory.fromLocale(locale);
        final SmpDataTransformer transformer = new SmpDataTransformer(validator);
        final String transformedInput = transformer.transform(input);
        System.out.println(transformedInput);
    }
}
