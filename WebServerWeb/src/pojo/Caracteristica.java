package pojo;


public class Caracteristica {
	private int codiCaracteristica;
	private String nomCaracteristicaCA;
	private String nomCaracteristicaES;
	private String nomCaracteristicaEN;
	private Integer tipo;
	private int codiNivell;
	
	public Caracteristica(	int codiCaracteristica, String nomCaracteristicaCA,
							String nomCaracteristicaES,	String nomCaracteristicaEN,
							Integer tipo, int codiNivell) {
		
		this.setCodiCaracteristica(codiCaracteristica);
		this.setNomCaracteristicaCA(nomCaracteristicaCA);
		this.setNomCaracteristicaES(nomCaracteristicaES);
		this.setNomCaracteristicaEN(nomCaracteristicaEN);
		this.setTipo(tipo);
		this.setCodiNivell(codiNivell);
		
	}

	public Caracteristica() {
		// TODO Auto-generated constructor stub
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

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public int getCodiNivell() {
		return codiNivell;
	}

	public void setCodiNivell(int codiNivell) {
		this.codiNivell = codiNivell;
	}
	
}
