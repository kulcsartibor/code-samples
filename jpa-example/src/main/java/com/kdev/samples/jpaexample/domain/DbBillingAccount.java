package com.kdev.samples.jpaexample.domain;

import javax.persistence.*;

/**
 * @author Tibor Kulcsar
 * <p>
 * Date: 2/20/2018
 * @since
 */
@Entity
@Table(name = "billing_account")
public class DbBillingAccount
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;


    String name;
}
