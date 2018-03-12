package com.kdev.samples.jpaexample.domain;

/**
 * @author Tibor Kulcsar
 * <p>
 * Date: 2/20/2018
 * @since
 */
public enum DbBillingCycleState
{
    /**
     * Denotes the <b>open</b> billing cycle state.<br>
     */
    OPEN,

    /**
     * Denotes the <b>closed</b> billing cycle state.<br>
     */
    CLOSED,

    /**
     * Denotes the <b>locking</b> billing cycle state.<br>
     */
    LOCKING,

    /**
     * Denotes the <b>locked</b> billing cycle state.<br>
     */
    LOCKED,

    /**
     * Denotes the <b>issuing</b> billing cycle state.<br>
     * That is, a billing cycle is being in the process of issuing.<br>
     */
    ISSUING,

    /**
     * Denotes the <b>issued</b> billing cycle state.<br>
     */
    ISSUED
}
