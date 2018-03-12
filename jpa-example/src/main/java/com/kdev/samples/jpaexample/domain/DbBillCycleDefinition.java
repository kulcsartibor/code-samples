package com.kdev.samples.jpaexample.domain;

import javax.persistence.*;
import java.util.List;

/**
 * @author Tibor Kulcsar
 * <p>
 * Date: 2/20/2018
 * @since
 */
@Entity
@Table(name = "bill_cycle_definition")
public class DbBillCycleDefinition
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy="owner", fetch = FetchType.EAGER)
    List<DbBillCycleInstance> definition;

    @Column(name="name", nullable=false)
    String name;



}
