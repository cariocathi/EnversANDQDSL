package com.thiago.spring.dao.preset;

import com.thiago.spring.entity.Country;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryDAO extends CrudRepository<Country, Integer>,
        QueryDslPredicateExecutor<Country>
{
}
