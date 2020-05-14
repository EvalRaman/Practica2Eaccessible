package pojo;

import java.math.BigInteger;

public class CaracteristicaTipoLocal {
	
	private BigInteger codicaracteristicatipolocal;
	private BigInteger codicaracteristica;
	private BigInteger coditipolocal;
	
	public CaracteristicaTipoLocal(	BigInteger codicaracteristicatipolocal,
									BigInteger codicaracteristica, BigInteger coditipolocal) {
		
		this.setCodicaracteristicatipolocal(codicaracteristicatipolocal);
		this.setCodicaracteristica(codicaracteristica);
		this.setCoditipolocal(coditipolocal);
		
	}

	public BigInteger getCodicaracteristicatipolocal() {
		return codicaracteristicatipolocal;
	}

	public void setCodicaracteristicatipolocal(int i) {
		this.codicaracteristicatipolocal = i;
	}

	public BigInteger getCodicaracteristica() {
		return codicaracteristica;
	}

	public void setCodicaracteristica(int i) {
		this.codicaracteristica = i;
	}

	public BigInteger getCoditipolocal() {
		return coditipolocal;
	}

	public void setCoditipolocal(int i) {
		this.coditipolocal = i;
	}
	
}
