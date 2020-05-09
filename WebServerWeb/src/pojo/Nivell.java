package pojo;

import java.math.BigInteger;

public class Nivell {
	private BigInteger codiNivell;
	private String nomNivellCA;
	private String nomNivellES;
	private String nomNivellEN;
	
	public Nivell(BigInteger codiNivell, String nomNivellCA,String nomNivellES, String nomNivellEN) {
		this.setCodiNivell(codiNivell);
		this.setNomNivellCA(nomNivellCA);
		this.setNomNivellES(nomNivellES);
		this.setNomNivellEN(nomNivellEN);

	}

	public BigInteger getCodiNivell() {
		return codiNivell;
	}

	public void setCodiNivell(BigInteger codiNivell) {
		this.codiNivell = codiNivell;
	}

	public String getNomNivellCA() {
		return nomNivellCA;
	}

	public void setNomNivellCA(String nomNivellCA) {
		this.nomNivellCA = nomNivellCA;
	}

	public String getNomNivellES() {
		return nomNivellES;
	}

	public void setNomNivellES(String nomNivellES) {
		this.nomNivellES = nomNivellES;
	}

	public String getNomNivellEN() {
		return nomNivellEN;
	}

	public void setNomNivellEN(String nomNivellEN) {
		this.nomNivellEN = nomNivellEN;
	}
	
}
