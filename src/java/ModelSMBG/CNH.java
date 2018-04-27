package modelSMBG;

public class CNH {
	private String numeroCNH;
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
