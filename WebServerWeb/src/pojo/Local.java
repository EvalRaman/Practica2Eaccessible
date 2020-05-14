package pojo;

import java.math.BigInteger;


public class Local {
	
	private BigInteger codiLocal;
	private BigInteger codiTipoLocal;
	private BigInteger codiCarrer;
	private String nomCarrer;
	private String nomVia;
	private BigInteger numero;
	private String nomLocal;
	private String observacions;
	private boolean verificat;
	
	private Local(	BigInteger codiLocal, BigInteger codiTipoLocal, BigInteger codiCarrer, 
					String nomCarrer, String nomVia, BigInteger numero,	String nomLocal,
					String observacions, boolean verificat) {
		
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
	
	public BigInteger getCodiLocal() {
		return codiLocal;
	}

	public void setCodiLocal(int i) {
		this.codiLocal = i;
	}

	public BigInteger getCodiTipoLocal() {
		return codiTipoLocal;
	}

	public void setCodiTipoLocal(int i) {
		this.codiTipoLocal = i;
	}

	public BigInteger getCodiCarrer() {
		return codiCarrer;
	}

	public void setCodiCarrer(int i) {
		this.codiCarrer = i;
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

	public void setNumero(int i) {
		this.numero = i;
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

	public boolean isVerificat() {
		return verificat;
	}

	public void setVerificat(String string) {
		this.verificat = string;
	}
	
}
