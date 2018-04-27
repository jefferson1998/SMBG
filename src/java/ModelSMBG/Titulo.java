package modelSMBG;

public class Titulo {
	
	private String numeroTitulo;
	private int zona;
	private int secao;
	
	public Titulo(String numeroTitulo, int zona, int secao) {
		this.numeroTitulo = numeroTitulo;
		this.zona = zona;
		this.secao = secao;
	}

	public String getNumeroTitulo() {
		return numeroTitulo;
	}

	public void setNumeroTitulo(String numeroTitulo) {
		this.numeroTitulo = numeroTitulo;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}

	public int getSecao() {
		return secao;
	}

	public void setSecao(int secao) {
		this.secao = secao;
	}
}
