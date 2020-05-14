package pojo;


public class TipoLocal {
	private int codiTipoLocal;
	private String nomTipoLocalCA;
	private String nomTipoLocalES;
	private String nomTipoLocalEN;
	
	public TipoLocal(	int codiTipoLocal, String nomTipoLocalCA, String nomTipoLocalES,
						String nomTipoLocalEN) {
		
		this.setCodiTipoLocal(codiTipoLocal);
		this.setNomTipoLocalCA(nomTipoLocalCA);
		this.setNomTipoLocalES(nomTipoLocalES);
		this.setNomTipoLocalEN(nomTipoLocalEN);
		
	}

	public int getCodiTipoLocal() {
		return codiTipoLocal;
	}

	public void setCodiTipoLocal(int codiTipoLocal) {
		this.codiTipoLocal = codiTipoLocal;
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
