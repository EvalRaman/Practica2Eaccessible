package pojo;


public class Local {
	
	private int codiLocal;
	private int codiTipoLocal;
	private int codiCarrer;
	private String nomCarrer;
	private String nomVia;
	private int numero;
	private String nomLocal;
	private String observacions;
	private String verificat;
	
	public Local(	int codiLocal, int codiTipoLocal, int codiCarrer, 
					String nomCarrer, String nomVia, int numero,	String nomLocal,
					String observacions, String verificat) {
		
		this.codiLocal = codiLocal;
		this.codiTipoLocal = codiTipoLocal;
		this.codiCarrer = codiCarrer;
		this.nomCarrer = nomCarrer;
		this.nomVia = nomVia;
		this.numero = numero;
		this.nomLocal = nomLocal;
		this.observacions = observacions;
		this.verificat = verificat;
	}
	
	public Local() {
		// TODO Auto-generated constructor stub
	}

	public int getCodiLocal() {
		return codiLocal;
	}

	public void setCodiLocal(int codiLocal) {
		this.codiLocal = codiLocal;
	}

	public int getCodiTipoLocal() {
		return codiTipoLocal;
	}

	public void setCodiTipoLocal(int codiTipoLocal) {
		this.codiTipoLocal = codiTipoLocal;
	}

	public int getCodiCarrer() {
		return codiCarrer;
	}

	public void setCodiCarrer(int codiCarrer) {
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomLocal() {
		return nomLocal;
	}

	public void setNomLocal(String nomLocal) {
		this.nomLocal = nomLocal;
	}

	public String getObservacions() {
		return observacions;
	}

	public void setObservacions(String observacions) {
		this.observacions = observacions;
	}

	public String getVerificat() {
		return verificat;
	}

	public void setVerificat(String verificat) {
		this.verificat = verificat;
	}
	
}
