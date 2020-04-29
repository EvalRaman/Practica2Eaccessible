package pojo;

import java.math.BigInteger;


public class Local {

	public static class Builder {
		
		private BigInteger codiLocal;
		private BigInteger codiTipoLocal;
		private BigInteger codiCarrer;
		private String nomCarrer;
		private String nomVia;
		private BigInteger numero;
		private String nomLocal;
		private String observacions;
		private boolean verificat;
		
		public Builder(BigInteger codiLocal) {
			this.codiLocal = codiLocal;
		}
		
		public Builder WithCodiTipoLocal(BigInteger codiTipoLocal) {
			this.codiTipoLocal = codiTipoLocal;
			return this;
		}
		
		public Builder WithCodiCarrer(BigInteger codiCarrer) {
			this.codiCarrer = codiCarrer;
			return this;
		}
		
		public Builder WithNomCarrer(String nomCarrer) {
			this.nomCarrer = nomCarrer;
			return this;
		}
		
		public Builder WithNomVia(String nomVia) {
			this.nomVia = nomVia;
			return this;
		}
		
		public Builder WithNumero(BigInteger numero) {
			this.numero = numero;
			return this;
		}
		
		public Builder WithNomLocal(String nomLocal) {
			this.nomLocal = nomLocal;
			return this;
		}
		
		public Builder WithObservacions(String observacions) {
			this.observacions = observacions;
			return this;
		}
		
		public Builder WithVerificat(boolean verificat) {
			this.verificat = verificat;
			return this;
		}
		
		public Local build() {
			
			Local local = new Local();
			local.codiLocal = this.codiLocal;
			local.codiTipoLocal = this.codiTipoLocal;
			local.codiCarrer = this.codiCarrer;
			local.nomCarrer = this.nomCarrer;
			local.nomVia = this.nomVia;
			local.numero = this.numero;
			local.nomLocal = this.nomLocal;
			local.observacions = this.observacions;
			local.verificat = this.verificat;
			
			return local;
		}
	}
	
	private BigInteger codiLocal;
	private BigInteger codiTipoLocal;
	private BigInteger codiCarrer;
	private String nomCarrer;
	private String nomVia;
	private BigInteger numero;
	private String nomLocal;
	private String observacions;
	private boolean verificat;
	
	private Local() {
		//Empty constructor because of the use of the Builder Pattern
	}
	
	public BigInteger getCodiLocal() {
		return codiLocal;
	}

	public void setCodiLocal(BigInteger codiLocal) {
		this.codiLocal = codiLocal;
	}

	public BigInteger getCodiTipoLocal() {
		return codiTipoLocal;
	}

	public void setCodiTipoLocal(BigInteger codiTipoLocal) {
		this.codiTipoLocal = codiTipoLocal;
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

	public void setVerificat(boolean verificat) {
		this.verificat = verificat;
	}
	
}
