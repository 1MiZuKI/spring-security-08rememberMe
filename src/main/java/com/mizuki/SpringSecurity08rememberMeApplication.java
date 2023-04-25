package com.mizuki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringSecurity08rememberMeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurity08rememberMeApplication.class, args);
    }

}
