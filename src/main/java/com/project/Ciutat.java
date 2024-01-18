package com.project;

import java.io.Serializable;

public class Ciutat implements Serializable {

	private long ciutatId;
	private String nom;
	private String pais;
	private int codiPostal;

	public Ciutat() { }

	public Ciutat(String nom, String pais, int codiPostal) {
		this.nom = nom;
		this.pais = pais;
		this.codiPostal = codiPostal;
	}

	public long getCiutatId() {
		return this.ciutatId;
	}

	public void setCiutatId(long id) {
		this.ciutatId = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getCodiPostal() {
		return codiPostal;
	}

	public void setCodiPostal(int codiPostal) {
		this.codiPostal = codiPostal;
	}

	@Override
    public String toString () {
      	return this.getNom() + ", " + this.getPais() + " " + this.getCodiPostal();
    }
}