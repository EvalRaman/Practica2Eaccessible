package pojo;

import java.math.BigInteger;

public class TipoLocal {
	private BigInteger codiTipoLocal;
	private String nomTipoLocalCA;
	private String nomTipoLocalES;
	private String nomTipoLocalEN;
	
	public TipoLocal(	BigInteger codiTipoLocal, String nomTipoLocalCA, String nomTipoLocalES,
						String nomTipoLocalEN) {
		
		this.setCodiTipoLocal(codiTipoLocal);
		this.setNomTipoLocalCA(nomTipoLocalCA);
		this.setNomTipoLocalES(nomTipoLocalES);
		this.setNomTipoLocalEN(nomTipoLocalEN);
		
	}

	public BigInteger getCodiTipoLocal() {
		return codiTipoLocal;
	}

	public void setCodiTipoLocal(int i) {
		this.codiTipoLocal = i;
	}

	public String getNomTipoLocalCA() {
		return nomTipoLocalCA;
	}

	public void setNomTipoLocalCA(String nomTipoLocalCA) {
		this.nomTipoLocalCA = nomTipoLocalCA;
	}

	public String getNomTipoLocalES() {
		return nomTipoLocalES;
	}

	public void setNomTipoLocalES(String nomTipoLocalES) {
		this.nomTipoLocalES = nomTipoLocalES;
	}

	public String getNomTipoLocalEN() {
		return nomTipoLocalEN;
	}

	public void setNomTipoLocalEN(String nomTipoLocalEN) {
		this.nomTipoLocalEN = nomTipoLocalEN;
	}
}
