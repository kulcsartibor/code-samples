package com.kdev.samples.jpaexample.domain;

import javax.persistence.*;

/**
 * @author Tibor Kulcsar
 * <p>
 * Date: 2/20/2018
 * @since
 */
@Entity
@Table(name = "invoice")
public class DbInvoice
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "content", nullable = false)
    String content;
}
