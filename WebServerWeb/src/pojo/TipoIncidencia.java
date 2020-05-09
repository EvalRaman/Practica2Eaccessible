package pojo;

import java.math.BigInteger;

public class TipoIncidencia {
	
	private BigInteger codiTipoIncidencia;
	private String descripcio;
	
	public TipoIncidencia(BigInteger codiTipoIncidencia, String descripcio) {
		
		this.setCodiTipoIncidencia(codiTipoIncidencia);
		this.setDescripcio(descripcio);
		
	}

	public BigInteger getCodiTipoIncidencia() {
		return codiTipoIncidencia;
	}

	public void setCodiTipoIncidencia(BigInteger codiTipoIncidencia) {
		this.codiTipoIncidencia = codiTipoIncidencia;
	}

	public String getDescripcio() {
		return descripcio;
	}

	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}
	
}
