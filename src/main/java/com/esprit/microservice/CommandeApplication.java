package com.esprit.microservice;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.esprit.microservice.Entity.Commande;
import com.esprit.microservice.Entity.Commande;
import com.esprit.microservice.Repository.CommandeRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class CommandeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommandeApplication.class, args);
	}

	
	@Bean
	 ApplicationRunner init(CommandeRepository repository){
		return args ->{
			Stream.of("Eskander","Samir","hamma").forEach(destinataire ->{
				repository.save(new Commande(destinataire));
			});
			repository.findAll().forEach(System.out::println);
		};
	}
}
