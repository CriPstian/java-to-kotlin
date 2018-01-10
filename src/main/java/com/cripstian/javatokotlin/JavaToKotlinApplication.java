package com.cripstian.javatokotlin;

import com.cripstian.javatokotlin.pets.PetsConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(PetsConfiguration.class)
public class JavaToKotlinApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaToKotlinApplication.class, args);
	}
}
