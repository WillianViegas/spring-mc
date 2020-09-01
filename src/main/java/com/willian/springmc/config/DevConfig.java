package com.willian.springmc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.willian.springmc.services.DBService;

@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired 
	private DBService dbService;
	
	//pega o valor da ddl-auto na dev properties para comparar
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		if(!"create".equals(strategy)) {
			return false;
		}
		
		dbService.instantiateTestDatabase();
		return true;
	}
}
