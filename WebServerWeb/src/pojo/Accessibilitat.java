package pojo;


public class Accessibilitat {
	
	private int codiAccessibilitat;
	private int codiLocal;
	private int codiCaracteristica;
	private int valor;
	private String verificat;
	
	public Accessibilitat(	int codiAccessibilitat, int codiLocal, 
							int codiCaracteristica, int valor, String verificat) {
		
		this.setCodiAccessibilitat(codiAccessibilitat);
		this.setCodiLocal(codiLocal);
		this.setCodiCaracteristica(codiCaracteristica);
		this.setValor(valor);
		this.setVerificat(verificat);
		
	}

	public int getCodiAccessibilitat() {
		return codiAccessibilitat;
	}

	public void setCodiAccessibilitat(int codiAccessibilitat) {
		this.codiAccessibilitat = codiAccessibilitat;
	}

	public int getCodiLocal() {
		return codiLocal;
	}

	public void setCodiLocal(int codiLocal) {
		this.codiLocal = codiLocal;
	}

	public int getCodiCaracteristica() {
		return codiCaracteristica;
	}

	public void setCodiCaracteristica(int codiCaracteristica) {
		this.codiCaracteristica = codiCaracteristica;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getVerificat() {
		return verificat;
	}

	public void setVerificat(String verificat) {
		this.verificat = verificat;
	}
	
}
