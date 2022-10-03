package com.esprit.microservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esprit.microservice.Entity.Commande;

public interface CommandeRepository  extends JpaRepository <Commande,Integer>{

}
