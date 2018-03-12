package com.kdev.formula;

import java.util.Date;

/**
 * @author Tibor Kulcsar
 * <p>
 * Date: 2/23/2018
 * @since
 */
public class Application
{
    public static void main(String[] args)
    {
        String formulaString = "${BILLING_ACCOUNT:8}-${DATE_MONTH:2}-${DATE_YEAR:2}-${BILL_CYCLE_INSTANCE:8}-PREFIX${DATE_YEAR:3}-${INVOICE_SEQUENCE:8}-${DOCUMENT_TYPE:1}-${PROVIDER_ID:1}";

        Formula formula = new Formula(formulaString);

        ReferenceNumberContext context = new ReferenceNumberContext()
        {
            @Override
            public Date getDate()
            {
                return new Date();
            }

            @Override
            public Long getBillingAccountId()
            {
                return 432L;
            }

            @Override
            public Long getBillCycleInstanceId()
            {
                return 615L;
            }

            @Override
            public Long getInvoiceSequence()
            {
                return 253463L;
            }

            @Override
            public Integer getDocumentType()
            {
                return 1;
            }

            @Override
            public Integer getProviderId()
            {
                return 99;
            }
        };

        System.out.println(formula.substitute(context));

        System.out.println();
    }

}
