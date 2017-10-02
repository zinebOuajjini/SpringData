package com.Zineb.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Zineb.DAO.EtudiantRepository;
import com.Zineb.Entities.Etudiant;

@RestController
public class HomeController {
	
	
	@Autowired
	EtudiantRepository repository;
	
	@PostMapping(value="/postEtudiant")
	
	public Etudiant postEtudiant(@RequestBody Etudiant etudiant) {

		repository.save(new Etudiant(etudiant.getNom(),etudiant.getDateNaissance()));
		
		return etudiant;
	}


}
