package pojo;

import java.math.BigInteger;
import java.sql.Timestamp;

public class Incidencia {
	
	private BigInteger idIncidencia;
	private Timestamp dataHora; 
	private BigInteger codiTipusIncidencia;
	private BigInteger idRegistre;
	private String nomTaula;
	
	public Incidencia (	BigInteger idIncidencia,	Timestamp dataHora,	BigInteger codiTipusIncidencia,
						BigInteger idRegistre, String nomTaula) {
		
		this.setIdIncidencia(idIncidencia);
		this.setDataHora(dataHora);
		this.setCodiTipusIncidencia(codiTipusIncidencia);
		this.setIdRegistre(idRegistre);
		this.setNomTaula(nomTaula);
		
	}

	public BigInteger getIdIncidencia() {
		return idIncidencia;
	}

	public void setIdIncidencia(BigInteger idIncidencia) {
		this.idIncidencia = idIncidencia;
	}

	public Timestamp getDataHora() {
		return dataHora;
	}

	public void setDataHora(Timestamp dataHora) {
		this.dataHora = dataHora;
	}

	public BigInteger getCodiTipusIncidencia() {
		return codiTipusIncidencia;
	}

	public void setCodiTipusIncidencia(BigInteger codiTipusIncidencia) {
		this.codiTipusIncidencia = codiTipusIncidencia;
	}

	public BigInteger getIdRegistre() {
		return idRegistre;
	}

	public void setIdRegistre(BigInteger idRegistre) {
		this.idRegistre = idRegistre;
	}

	public String getNomTaula() {
		return nomTaula;
	}

	public void setNomTaula(String nomTaula) {
		this.nomTaula = nomTaula;
	}
	
	
}
