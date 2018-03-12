package com.kdev.samples.jpaexample.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Tibor Kulcsar
 * <p>
 * Date: 2/20/2018
 * @since
 */
@Entity
@Table(name = "bill_cycle_instance")
public class DbBillCycleInstance
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="billing_cycle_definition_id")
    private DbBillCycleDefinition definition;


    @Temporal(TemporalType.DATE)
    @Column(name="from_date", nullable=false)
    private Date fromDate;

    @Temporal(TemporalType.DATE)
    @Column(name="to_date", nullable=false)
    private Date toDate;

    @Temporal(TemporalType.DATE)
    @Column(name="locking_date", nullable=false)
    private Date lockingDate;

    @Temporal(TemporalType.DATE)
    @Column(name="issue_date", nullable=false)
    private Date issueDate;

    @Temporal(TemporalType.DATE)
    @Column(name="due_date", nullable=false)
    private Date dueDate;

    @Enumerated(EnumType.STRING)
    @Column(name="state", nullable=false)
    private DbBillingCycleState state;
}
