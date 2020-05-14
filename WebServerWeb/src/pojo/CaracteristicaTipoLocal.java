package pojo;


public class CaracteristicaTipoLocal {
	
	private int codicaracteristicatipolocal;
	private int codicaracteristica;
	private int coditipolocal;
	
	public CaracteristicaTipoLocal(	int codicaracteristicatipolocal,
									int codicaracteristica, int coditipolocal) {
		
		this.setCodicaracteristicatipolocal(codicaracteristicatipolocal);
		this.setCodicaracteristica(codicaracteristica);
		this.setCoditipolocal(coditipolocal);
		
	}

	public CaracteristicaTipoLocal() {
		// TODO Auto-generated constructor stub
	}

	public int getCodicaracteristicatipolocal() {
		return codicaracteristicatipolocal;
	}

	public void setCodicaracteristicatipolocal(int i) {
		this.codicaracteristicatipolocal = i;
	}

	public int getCodicaracteristica() {
		return codicaracteristica;
	}

	public void setCodicaracteristica(int i) {
		this.codicaracteristica = i;
	}

	public int getCoditipolocal() {
		return coditipolocal;
	}

	public void setCoditipolocal(int i) {
		this.coditipolocal = i;
	}
	
}
