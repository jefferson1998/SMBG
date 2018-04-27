package modelSMBG;

public class CTPS {
	
	private String numeroCTPS;
	private String serieCTPS;
	private String estadoCTPS;
	
	public CTPS(String numeroCTPS, String serieCTPS, String estadoCTPS) {
		this.numeroCTPS = numeroCTPS;
		this.serieCTPS = serieCTPS;
		this.estadoCTPS = estadoCTPS;
	}

	public String getNumeroCTPS() {
		return numeroCTPS;
	}

	public void setNumeroCTPS(String numeroCTPS) {
		this.numeroCTPS = numeroCTPS;
	}

	public String getSerieCTPS() {
		return serieCTPS;
	}

	public void setSerieCTPS(String serieCTPS) {
		this.serieCTPS = serieCTPS;
	}

	public String getEstadoCTPS() {
		return estadoCTPS;
	}

	public void setEstadoCTPS(String estadoCTPS) {
		this.estadoCTPS = estadoCTPS;
	}
}
