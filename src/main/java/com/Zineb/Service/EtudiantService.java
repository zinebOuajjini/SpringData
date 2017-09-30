package com.Zineb.Service;
import java.util.List;

import com.Zineb.Entities.*;


public interface EtudiantService {
	
	List<Etudiant> getAll();
	
	Etudiant getEtudiant(Long id);
	
	void DeleteEtudiant(long id);
	
	void CreateEtudiant(Etudiant etudiant);
	
	

}
