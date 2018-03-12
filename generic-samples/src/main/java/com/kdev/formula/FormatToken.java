package com.kdev.formula;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.ZoneId;
import java.util.Date;
import java.util.function.BiFunction;

/**
 * @author Tibor Kulcsar
 * <p>
 * Date: 2/23/2018
 * @since
 */
public enum FormatToken
{
    BILLING_ACCOUNT((referenceNumberContext, length) -> {
        return formatNumber(referenceNumberContext.getBillingAccountId(), length);
    }),

    BILL_CYCLE_INSTANCE((referenceNumberContext, length) -> {
        return formatNumber(referenceNumberContext.getBillCycleInstanceId(), length);
    }),

    DATE_MONTH((referenceNumberContext, length) -> {
        return formatMonth(referenceNumberContext.getDate(), length);
    }),

    DATE_YEAR((referenceNumberContext, length) -> {
        return formatYear(referenceNumberContext.getDate(), length);
    }),

    INVOICE_SEQUENCE((referenceNumberContext, length) -> {
        return formatNumber(referenceNumberContext.getInvoiceSequence(), length);
    }),

    DOCUMENT_TYPE((referenceNumberContext, length) -> {
        return formatNumber(referenceNumberContext.getDocumentType(), length);
    }),

    PROVIDER_ID((referenceNumberContext, length) -> {
        return formatNumber(referenceNumberContext.getProviderId(), length);
    });

    public final BiFunction<ReferenceNumberContext, Integer, String> substitute;

    FormatToken(BiFunction<ReferenceNumberContext, Integer, String> substitute){
        this.substitute = substitute;
    }

    private static String formatNumber(Number number, Integer minIntegerDigits)
    {
        NumberFormat format = DecimalFormat.getInstance();
        format.setMinimumIntegerDigits(minIntegerDigits);
        format.setGroupingUsed(false);
        return format.format(number);
    }

    private static String formatMonth(Date date, Integer length){
        return formatNumber(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getMonthValue(), length);
    }

    private static String formatYear(Date date, Integer length){
        String year = formatNumber(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear(), 2);
        return year.substring(year.length() - length);
    }

}

