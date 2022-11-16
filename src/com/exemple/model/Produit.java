package com.exemple.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produit")
public class Produit {

	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String nom;
	
	@Column
	private String famille;
	
	@Column(name="prix_achat")
	private double pachat;
	
	@Column(name="prix_vente")
	private double pvente;

	public Produit() {

	}

	public Produit(int id, String nom, String famille, double pachat, double pvente) {
		super();
		this.id = id;
		this.nom = nom;
		this.famille = famille;
		this.pachat = pachat;
		this.pvente = pvente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getFamille() {
		return famille;
	}

	public void setFamille(String famille) {
		this.famille = famille;
	}

	public double getPachat() {
		return pachat;
	}

	public void setPachat(double pachat) {
		this.pachat = pachat;
	}

	public double getPvente() {
		return pvente;
	}

	public void setPvente(double pvente) {
		this.pvente = pvente;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", famille=" + famille + ", pachat=" + pachat + ", pvente="
				+ pvente + "]";
	}

}
