package com.kdev.substitute;

import org.apache.commons.text.StrSubstitutor;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Tibor Kulcsar
 * <p>
 * Date: 2/22/2018
 * @since
 */
public class App
{
    public static void main(String[] args)
    {

        String pattern = "\\$\\{([A-Z_]+):?(\\d+)?\\}";

        String formula = "${BILLING_ACCOUNT:8}-${DATE_MONTH:2}-${DATE_YEAR:2}-${BILL_CYCLE_INSTANCE:8}-PREFIX${DATE_YEAR:2}-${INVOICE_SEQUENCE:8}-${DOCUMENT_TYPE:1}-${PROVIDER_ID:1}";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(formula);
        while (m.find( )) {
            System.out.println("Range: [" + m.start() + " - " + m.end() + "]");
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
        }

        System.out.println("Valami".toString());

    }

    private abstract class FormulaPart{
        abstract String getString();
    }

    private class StringFormulaPart extends FormulaPart
    {
        private final String string;
        StringFormulaPart(String string){
            this.string = string;
        }

        @Override
        String getString()
        {
            return string;
        }
    }

    private class PlaceholderFormulaPart extends FormulaPart
    {
        private final FormatToken token;
        private final Integer length;

        PlaceholderFormulaPart(FormatToken token, Integer length){
            this.token = token;
            this.length = length;
        }

        @Override
        String getString()
        {
            return null;
        }
    }

    private static enum FormatToken
    {
        BILLING_ACCOUNT("billing-account"),
        BILL_CYCLE_INSTANCE("bill-cycle-instance"),
        DATE_MONTH("date-month"),
        DATE_YEAR("date-year"),
        INVOICE_SEQUENCE("invoice-sequence"),
        DOCUMENT_TYPE("document-type"),
        PROVIDER_ID("provider-id");

        private final String placeHolder;

        FormatToken(String placeHolder){
            this.placeHolder = placeHolder;
        }
    }
}
