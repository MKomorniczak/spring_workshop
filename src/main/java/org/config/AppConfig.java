package org.config;


import org.example.data_access.StudentDao;
import org.example.data_access.StudentDaoListImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.management.MXBean;

@Configuration
public class AppConfig {

    @Bean
    public StudentDao studentDao(){
        return new StudentDaoListImpl();
    }
}
