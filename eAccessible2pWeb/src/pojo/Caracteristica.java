package pojo;

import java.math.BigInteger;

public class Caracteristica {
	private BigInteger codiCaracteristica;
	private String nomCaracteristicaCA;
	private String nomCaracteristicaES;
	private String nomCaracteristicaEN;
	private Integer tipo;
	private BigInteger codiNivell;
	
	public Caracteristica(	BigInteger codiCaracteristica, String nomCaracteristicaCA,
							String nomCaracteristicaES,	String nomCaracteristicaEN,
							Integer tipo, BigInteger codiNivell) {
		
		this.setCodiCaracteristica(codiCaracteristica);
		this.setNomCaracteristicaCA(nomCaracteristicaCA);
		this.setNomCaracteristicaES(nomCaracteristicaES);
		this.setNomCaracteristicaEN(nomCaracteristicaEN);
		this.setTipo(tipo);
		this.setCodiNivell(codiNivell);
		
	}

	public BigInteger getCodiCaracteristica() {
		return codiCaracteristica;
	}

	public void setCodiCaracteristica(BigInteger codiCaracteristica) {
		this.codiCaracteristica = codiCaracteristica;
	}

	public String getNomCaracteristicaCA() {
		return nomCaracteristicaCA;
	}

	public void setNomCaracteristicaCA(String nomCaracteristicaCA) {
		this.nomCaracteristicaCA = nomCaracteristicaCA;
	}

	public String getNomCaracteristicaES() {
		return nomCaracteristicaES;
	}

	public void setNomCaracteristicaES(String nomCaracteristicaES) {
		this.nomCaracteristicaES = nomCaracteristicaES;
	}

	public String getNomCaracteristicaEN() {
		return nomCaracteristicaEN;
	}

	public void setNomCaracteristicaEN(String nomCaracteristicaEN) {
		this.nomCaracteristicaEN = nomCaracteristicaEN;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public BigInteger getCodiNivell() {
		return codiNivell;
	}

	public void setCodiNivell(BigInteger codiNivell) {
		this.codiNivell = codiNivell;
	}
	
}
