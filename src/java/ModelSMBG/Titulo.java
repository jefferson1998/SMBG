package modelSMBG;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Titulo {
	
        @Column (name = "numeroTitulo", nullable = true, length = 12)
	private String numeroTitulo;
        
        @Column (name = "zonaTituloTitulo", nullable = true)
	private int zonaTitulo;
        
        @Column (name = "zecaoTitulo", nullable = false)
	private int secaoTitulo;
	
	public Titulo(String numeroTitulo, int zonaTitulo, int secaoTitulo) {
		this.numeroTitulo = numeroTitulo;
		this.zonaTitulo = zonaTitulo;
		this.secaoTitulo = secaoTitulo;
	}

	public String getNumeroTitulo() {
		return numeroTitulo;
	}

	public void setNumeroTitulo(String numeroTitulo) {
		this.numeroTitulo = numeroTitulo;
	}

	public int getZonaTitulo() {
		return zonaTitulo;
	}

	public void setZonaTitulo(int zonaTitulo) {
		this.zonaTitulo = zonaTitulo;
	}

	public int getSecaoTitulo() {
		return secaoTitulo;
	}

	public void setSecaoTitulo(int secaoTitulo) {
		this.secaoTitulo = secaoTitulo;
	}
}
