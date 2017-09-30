package com.Zineb.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.Zineb.Entities.Etudiant;

public interface EtudiantRepository extends CrudRepository<Etudiant,Long> {

}
