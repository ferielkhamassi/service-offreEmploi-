package com.iset.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id; 


@Entity
public class Offre {
	@Id
	@GeneratedValue
	Long code;
	String intitulé;
	String specialité;
	String société;
	int nbpostes;
	String pays;
	
	public Offre() {

	}

	public Offre( String intitulé, String specialité, String société, int nbpostes, String pays) {
		super();
		
		this.intitulé = intitulé;
		this.specialité = specialité;
		this.société = société;
		this.nbpostes = nbpostes;
		this.pays = pays;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getIntitulé() {
		return intitulé;
	}

	public void setIntitulé(String intitulé) {
		this.intitulé = intitulé;
	}

	public String getSpecialité() {
		return specialité;
	}

	public void setSpecialité(String specialité) {
		this.specialité = specialité;
	}

	public String getSociété() {
		return société;
	}

	public void setSociété(String société) {
		this.société = société;
	}

	public int getNbpostes() {
		return nbpostes;
	}

	public void setNbpostes(int nbpostes) {
		this.nbpostes = nbpostes;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}	
	
	
	
	
	
	
	

}
