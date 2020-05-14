package pojo;

import java.math.BigInteger;

public class Accessibilitat {
	
	private BigInteger codiAccessibilitat;
	private BigInteger codiLocal;
	private BigInteger codiCaracteristica;
	private BigInteger valor;
	private String verificat;
	
	public Accessibilitat(	BigInteger codiAccessibilitat, BigInteger codiLocal, 
							BigInteger codiCaracteristica, BigInteger valor, String verificat) {
		
		this.setCodiAccessibilitat(codiAccessibilitat);
		this.setCodiLocal(codiLocal);
		this.setCodiCaracteristica(codiCaracteristica);
		this.setValor(valor);
		this.setVerificat(verificat);
		
	}

	public BigInteger getCodiAccessibilitat() {
		return codiAccessibilitat;
	}

	public void setCodiAccessibilitat(BigInteger codiAccessibilitat) {
		this.codiAccessibilitat = codiAccessibilitat;
	}

	public BigInteger getCodiLocal() {
		return codiLocal;
	}

	public void setCodiLocal(BigInteger codiLocal) {
		this.codiLocal = codiLocal;
	}

	public BigInteger getCodiCaracteristica() {
		return codiCaracteristica;
	}

	public void setCodiCaracteristica(BigInteger codiCaracteristica) {
		this.codiCaracteristica = codiCaracteristica;
	}

	public BigInteger getValor() {
		return valor;
	}

	public void setValor(BigInteger valor) {
		this.valor = valor;
	}

	public String getVerificat() {
		return verificat;
	}

	public void setVerificat(String verificat) {
		this.verificat = verificat;
	}
	
}
