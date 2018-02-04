package com.thiago.spring.service;

import com.thiago.spring.entity.Country;
import org.springframework.data.history.Revisions;

public interface CountryService
{
    Country findOne( final int id );
    Iterable<Country> findAll();
    Country save( final Country country );
    Iterable<Country> findBy( final Country c );

    Revisions<Integer, Country> findRevisions( final int id );
}