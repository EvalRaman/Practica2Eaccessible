package pojo;

import java.math.BigInteger;


public class Usuari {

	private String dni;
	private String nom;
	private String cognoms;
	private String telefon;
	private BigInteger codiCarrer;
	private String nomCarrer;
	private String nomVia;
	private BigInteger numero;
	
	public Usuari(	String dni, 
					String nom, 
					String cognoms, 
					String telefon, 
					BigInteger codiCarrer, 
					String nomCarrer, 
					String nomVia, 
					BigInteger numero) {
		
		this.setDni(dni);
		this.setNom(nom);
		this.setCognoms(cognoms);
		this.setTelefon(telefon);
		this.setCodiCarrer(codiCarrer);
		this.setNomCarrer(nomCarrer);
		this.setNomVia(nomVia);
		this.setNumero(numero);
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognoms() {
		return cognoms;
	}

	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public BigInteger getCodiCarrer() {
		return codiCarrer;
	}

	public void setCodiCarrer(BigInteger codiCarrer) {
		this.codiCarrer = codiCarrer;
	}

	public String getNomCarrer() {
		return nomCarrer;
	}

	public void setNomCarrer(String nomCarrer) {
		this.nomCarrer = nomCarrer;
	}

	public String getNomVia() {
		return nomVia;
	}

	public void setNomVia(String nomVia) {
		this.nomVia = nomVia;
	}

	public BigInteger getNumero() {
		return numero;
	}

	public void setNumero(BigInteger numero) {
		this.numero = numero;
	}

}
