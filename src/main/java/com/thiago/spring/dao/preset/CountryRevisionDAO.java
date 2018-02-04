package com.thiago.spring.dao.preset;

import com.thiago.spring.entity.Country;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRevisionDAO extends RevisionRepository<Country, Integer, Integer>
{
}
