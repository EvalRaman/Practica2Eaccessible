package pojo;


public class Caracteristica {
	private int codiCaracteristica;
	private String nomCaracteristicaCA;
	private String nomCaracteristicaES;
	private String nomCaracteristicaEN;
	private int tipo;
	private int codiNivell;
	
	public Caracteristica(	int codiCaracteristica, String nomCaracteristicaCA,
							String nomCaracteristicaES,	String nomCaracteristicaEN,
							int tipo, int codiNivell) {
		
		this.setCodiCaracteristica(codiCaracteristica);
		this.setNomCaracteristicaCA(nomCaracteristicaCA);
		this.setNomCaracteristicaES(nomCaracteristicaES);
		this.setNomCaracteristicaEN(nomCaracteristicaEN);
		this.setTipo(tipo);
		this.setCodiNivell(codiNivell);
		
	}

	public int getCodiCaracteristica() {
		return codiCaracteristica;
	}

	public void setCodiCaracteristica(int codiCaracteristica) {
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

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getCodiNivell() {
		return codiNivell;
	}

	public void setCodiNivell(int codiNivell) {
		this.codiNivell = codiNivell;
	}
	
}
