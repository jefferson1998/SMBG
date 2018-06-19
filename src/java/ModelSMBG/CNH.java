package ModelSMBG;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CNH {
    
        @Column (name = "numeroCNH", nullable = true)
	private String numeroCNH;
        
        @Column (name = "categoriaCNH", nullable = true)
	private String categoriaCNH;
	
	public CNH(String numeroCNH, String categoriaCNH) {
		this.numeroCNH = numeroCNH;
		this.categoriaCNH = categoriaCNH;
	}
	
	public String getNumeroCNH() {
		return numeroCNH;
	}
	
	public void setNumeroCNH(String numeroCNH) {
		this.numeroCNH = numeroCNH;
	}
	
	public String getCategoriaCNH() {
		return categoriaCNH;
	}
	
	public void setCategoriaCNH(String categoriaCNH) {
		this.categoriaCNH = categoriaCNH;
	}
}
