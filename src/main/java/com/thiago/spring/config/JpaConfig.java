package com.thiago.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories( basePackages =
        "com.thiago.spring.dao",
        excludeFilters = @ComponentScan.Filter( type = FilterType.REGEX, pattern = "..*RevisionDAO" )
)
@ComponentScan( basePackages = "com.thiago.spring.service" )
@Configuration
public class JpaConfig
{
}
