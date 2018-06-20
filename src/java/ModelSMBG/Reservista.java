package ModelSMBG;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Reservista {
	
        @Column (name = "numeroReservista", nullable = true, length = 6)
	private String numeroReservista;
        
        @Column (name = "serieReservista", nullable = true, length = 2)
	private String serieReservista;
        
        @Column (name = "categoriaReservista", nullable = true)
	private String categoriaReservista;
	
        public Reservista() {
            
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
