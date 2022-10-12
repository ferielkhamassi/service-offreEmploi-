package com.iset.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iset.dao.OffreRepository;
import com.iset.entities.Offre;

@RestController
@RequestMapping("/Offres") 
public class RestOffres { 
	@Autowired
	OffreRepository offreRepository; 
	@GetMapping
	public List<Offre> getAll() { 
		return offreRepository.findAll();
		}
	
	@GetMapping("/{uid}") 
	public Offre getbyid(@PathVariable Long uid ) { 
	 
	return offreRepository.findById(uid).get(); 
	}
	
	} 
