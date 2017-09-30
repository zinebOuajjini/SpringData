package com.Zineb.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "Etudiant")
public class Etudiant  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long Id;
	@Column(name="nom")
	private String nom;
	@Column(name="dateNaissance")
	private Date dateNaissance;
	

	protected Etudiant() {
		
	}

	public Etudiant(String nom, Date dateNaissance, String email, String photo) {
		
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	


}
