package com.kdev.formula;

import java.util.Date;

/**
 * @author Tibor Kulcsar
 * <p>
 * Date: 2/23/2018
 * @since
 */
public interface ReferenceNumberContext
{
    public Date getDate();

    public Long getBillingAccountId();

    public Long getBillCycleInstanceId();

    public Long getInvoiceSequence();

    public Integer getDocumentType();

    public Integer getProviderId();
}
