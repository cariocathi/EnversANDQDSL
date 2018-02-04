package com.thiago.spring.service;

import com.thiago.spring.entity.Country;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.history.Revisions;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@DataJpaTest
@RunWith( SpringRunner.class )
@FixMethodOrder( MethodSorters.NAME_ASCENDING )
public class CountryTest
{
    @Autowired
    private CountryService countryService;

    @Test
    public void test1Save()
    {
        final Country c = new Country();
        c.setName( "France" );
        c.setCurrency( "Euro" );

        countryService.save( c );

        Assert.assertTrue( c.getId() > 0 );
    }

    @Test
    public void test2FindAll()
    {
        countryService.findAll();
    }

    @Test
    public void test3FindBy()
    {
        final Country c = new Country();
        c.setName( "Brazil" );

        final Iterable<Country> countries = countryService.findBy( c );

        Assert.assertEquals( 1, countries.spliterator().estimateSize() );
    }

    @Test
    public void test4Revisions()
    {
        final Revisions<Integer, Country> history = countryService.findRevisions( 3 );
    }
}