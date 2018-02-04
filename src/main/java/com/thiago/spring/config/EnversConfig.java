package com.thiago.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.envers.repository.support.EnversRevisionRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.thiago.spring.dao",
        includeFilters = @ComponentScan.Filter( type = FilterType.REGEX, pattern = "..*RevisionDAO" ),
        repositoryFactoryBeanClass = EnversRevisionRepositoryFactoryBean.class
)
public class EnversConfig
{
}
