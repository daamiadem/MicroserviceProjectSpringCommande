package com.esprit.microservice.Service;

import java.io.File;
import java.util.Optional;

import javax.servlet.ServletContext;
import javax.xml.ws.Response;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.omg.CORBA.IntHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.esprit.microservice.Entity.Commande;
import com.esprit.microservice.Repository.CommandeRepository;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;







@Service
public class CommandeService  {
	@Autowired
	private CommandeRepository CommandeRepository; 
	
	
	public Commande addCommande(Commande Commande) {
		return CommandeRepository.save(Commande);

	}
	


	public Commande updateCommande(Commande newUtilisateur) {
			 return (CommandeRepository.save(newUtilisateur));
			
	

}
	
	
	public String deleteCommande(int id) {
		if (CommandeRepository.findById(id).isPresent()) {
			CommandeRepository.deleteById(id);
			return "Utilisateur supprimé";
} else
return "Utilisateur non supprimé";
	}



	
	
	
	
	
	
}
