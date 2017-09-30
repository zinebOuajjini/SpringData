package com.Zineb.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Zineb.DAO.EtudiantRepository;
import com.Zineb.Entities.Etudiant;

@Service
public class EtudiantServiceImp implements EtudiantService {
	
	@Autowired
	private EtudiantRepository etudiantRepository;

	public List<Etudiant> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Etudiant getEtudiant(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void DeleteEtudiant(long id) {
		// TODO Auto-generated method stub
		
	}

	public void CreateEtudiant(Etudiant etudiant) {

		etudiantRepository.save(etudiant);
	}

}
