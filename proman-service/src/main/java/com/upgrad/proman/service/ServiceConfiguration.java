package com.upgrad.proman.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

@Configuration
@ComponentScan("com.upgrad.proman.service")
@EntityScan("com.upgrad.proman.service.entity")
public class ServiceConfiguration {



}
