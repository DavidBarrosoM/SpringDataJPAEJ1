package com.practicas.springjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}
	/*@Bean
	CommandLineRunner init(Servicio service) {
		return args ->{
			service.agregarProyecto(new Proyect(0L,"Patatito","Java",true));
			
		};
	}*/
}
