package com.esprit.microservice.Controller;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.esprit.microservice.Entity.Commande;
import com.esprit.microservice.Service.CommandeService;

import com.fasterxml.jackson.databind.JsonMappingException;





@RestController
public class CommandeRestApi {
	private String title="hello I'm the Utilisateur Microservice";
	

	@Autowired
	CommandeService CommandeService; 

	
	
	
	@PostMapping("/add")	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Commande> createCommandet(@RequestBody Commande Commande) {
		return new ResponseEntity<>(CommandeService.addCommande(Commande), HttpStatus.OK) ;

	}
	

	
	@PutMapping("/updateCommande/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Commande> updateCommande(@RequestBody Commande Commande){
	return new ResponseEntity<>(CommandeService.updateCommande(Commande),HttpStatus.OK);
	}
	
	
	
	@RequestMapping("/hello")
	
	public String sayHello(){
		
		System.out.println(title);
		return title;
	}
	
	@DeleteMapping(value="/id", produces= MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteCommande(@PathVariable(value="id") int  id){
	return new ResponseEntity<>(CommandeService.deleteCommande(id),HttpStatus.OK);

	}
}
