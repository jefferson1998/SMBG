package modelSMBG;

public class Reservista {
	
	private String numeroReservista;
	private String serieReservista;
	private String categoriaReservista;
	
	public Reservista(String numeroReservista, String serieReservista, String categoriaReservista) {
		this.numeroReservista = numeroReservista;
		this.serieReservista = serieReservista;
		this.categoriaReservista = categoriaReservista;
	}

	public String getNumeroReservista() {
		return numeroReservista;
	}

	public void setNumeroReservista(String numeroReservista) {
		this.numeroReservista = numeroReservista;
	}

	public String getSerieReservista() {
		return serieReservista;
	}

	public void setSerieReservista(String serieReservista) {
		this.serieReservista = serieReservista;
	}

	public String getCategoriaReservista() {
		return categoriaReservista;
	}

	public void setCategoriaReservista(String categoriaReservista) {
		this.categoriaReservista = categoriaReservista;
	}
	
}
