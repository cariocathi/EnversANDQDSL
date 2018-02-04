package com.thiago.spring.service;

import com.querydsl.core.types.Predicate;
import com.thiago.spring.dao.preset.CountryDAO;
import com.thiago.spring.dao.preset.CountryRevisionDAO;
import com.thiago.spring.entity.Country;
import com.thiago.spring.entity.QCountry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.history.Revisions;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class CountryServiceImpl implements CountryService
{
    @Autowired
    private CountryDAO countryDAO;

    @Autowired
    private CountryRevisionDAO countryRevisionDAO;

    private final QCountry qCountry = new QCountry( "country" );

    @Override
    public Country findOne( final int id )
    {
        return countryDAO.findOne( id );
    }

    @Override
    public Iterable<Country> findAll()
    {
        return countryDAO.findAll();
    }

    @Override
    public Country save( final Country country )
    {
        return countryDAO.save( country );
    }

    @Override
    public Iterable<Country> findBy( final Country c )
    {
        if ( c == null )
            return null;

        Predicate p = null;

        if ( !StringUtils.isEmpty( c.getName() ) )
            p = qCountry.name.toLowerCase().eq( c.getName().toLowerCase() );

        return countryDAO.findAll( p );
    }

    @Override
    public Revisions<Integer, Country> findRevisions( final int id )
    {
        return countryRevisionDAO.findRevisions( id );
    }
}
