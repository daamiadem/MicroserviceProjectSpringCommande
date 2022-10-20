package com.esprit.microservice.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Commande  implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCommande;
	private String Date_cmd ; 
	private EtatCommande etat; 
	private String Date_livraison ; 
	private String Adresse_Livraison ; 
	private String Destinataire ; 
	private int Frais;
	public int getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	public String getDate_cmd() {
		return Date_cmd;
	}
	public void setDate_cmd(String date_cmd) {
		Date_cmd = date_cmd;
	}
	
	public String getDate_livraison() {
		return Date_livraison;
	}
	public void setDate_livraison(String date_livraison) {
		Date_livraison = date_livraison;
	}
	public String getAdresse_Livraison() {
		return Adresse_Livraison;
	}
	public void setAdresse_Livraison(String adresse_Livraison) {
		Adresse_Livraison = adresse_Livraison;
	}
	public String getDestinataire() {
		return Destinataire;
	}
	public void setDestinataire(String destinataire) {
		Destinataire = destinataire;
	}
	public int getFrais() {
		return Frais;
	}
	public void setFrais(int frais) {
		Frais = frais;
	}

	public EtatCommande getEtat() {
		return etat;
	}
	public void setEtat(EtatCommande etat) {
		this.etat = etat;
	}
	public Commande() {
		super();
	}
	public Commande(String destinataire) {
		super();
		Destinataire = destinataire;
	}
	public Commande(int idCommande, String date_cmd, EtatCommande etat, String date_livraison, String adresse_Livraison,
			String destinataire, int frais) {
		super();
		this.idCommande = idCommande;
		Date_cmd = date_cmd;
		this.etat = etat;
		Date_livraison = date_livraison;
		Adresse_Livraison = adresse_Livraison;
		Destinataire = destinataire;
		Frais = frais;
	} 
	
	
    
   
}
