package com.guerra.bookstore.config;

import com.guerra.bookstore.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {
    @Autowired
    private DBService dbService;

    @Bean
    public void databaseInstantiate(){
        this.dbService.databaseInstantiate();
    }
}
