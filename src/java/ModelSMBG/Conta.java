package modelSMBG;

public class Conta {
	
	private String numeroAgencia;
	private String numeroConta;
	
	public Conta(String numeroAgencia, String numeroConta) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
}
