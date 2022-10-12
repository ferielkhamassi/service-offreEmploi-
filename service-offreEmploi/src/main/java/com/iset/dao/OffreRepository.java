package com.iset.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iset.entities.Offre;

public interface OffreRepository  extends JpaRepository <Offre, Long> {

	List<Offre> findAll();
	

}
