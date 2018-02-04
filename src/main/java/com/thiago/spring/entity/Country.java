package com.thiago.spring.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode( of = "id" )
@Audited
public class Country
{
    @Id
    @GeneratedValue
    private int id;

    @Column( unique = true )
    private String name;

    @Column( nullable = false )
    private String currency;
}