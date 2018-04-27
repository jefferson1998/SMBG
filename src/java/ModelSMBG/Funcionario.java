package modelSMBG;

public class Funcionario {

	private Identidade funcionarioIdentidade;
	private String cpf;
	private Endereco funcionarioEndereco;
	private CNH funcionarioCNH;
	private String pis;
	private Titulo funcionarioTitulo;
	private CTPS funcionarioCTPS;
        private Reservista funcionarioReservista;
	private String emailFuncionario;
	private String numeroFuncionario;

	public Funcionario(Identidade funcionarioIdentidade, String cpf,
			Endereco funcionarioEndereco, CNH funcionarioCNH, String pis,
			Titulo funcionarioTitulo, CTPS funcionarioCTPS,Reservista funcionarioReservista,
                        String emailFuncionario,String numeroFuncionario) {
		this.funcionarioIdentidade = funcionarioIdentidade;
		this.cpf = cpf;
		this.funcionarioEndereco = funcionarioEndereco;
		this.funcionarioCNH = funcionarioCNH;
		this.pis = pis;
		this.funcionarioTitulo = funcionarioTitulo;
		this.funcionarioCTPS = funcionarioCTPS;
                this.funcionarioReservista = funcionarioReservista;
		this.emailFuncionario = emailFuncionario;
		this.numeroFuncionario = numeroFuncionario;
	}

	public Identidade getFuncionarioIdentidade() {
		return funcionarioIdentidade;
	}

	public void setFuncionarioIdentidade(Identidade funcionarioIdentidade) {
		this.funcionarioIdentidade = funcionarioIdentidade;
	}

	public String getCPF() {
		return cpf;
	}

	public void setCPF(String cPF) {
		cpf = cPF;
	}

	public Endereco getFuncionarioEndereco() {
		return funcionarioEndereco;
	}

	public void setFuncionarioEndereco(Endereco funcionarioEndereco) {
		this.funcionarioEndereco = funcionarioEndereco;
	}

	public CNH getFuncionarioCNH() {
		return funcionarioCNH;
	}

	public void setFuncionarioCNH(CNH funcionarioCNH) {
		this.funcionarioCNH = funcionarioCNH;
	}

	public String getPIS() {
		return pis;
	}

	public void setPIS(String pIS) {
		pis = pIS;
	}

	public Titulo getFuncionarioTitulo() {
		return funcionarioTitulo;
	}

	public void setFuncionarioTitulo(Titulo funcionarioTitulo) {
		this.funcionarioTitulo = funcionarioTitulo;
	}

	public CTPS getFuncionarioCTPS() {
		return funcionarioCTPS;
	}

	public void setFuncionarioCTPS(CTPS funcionarioCTPS) {
		this.funcionarioCTPS = funcionarioCTPS;
	}
        
        public void setFuncionarioReservista(Reservista funcionarioReservista) {
            this.funcionarioReservista = funcionarioReservista;
        }
        
        public Reservista getFuncionarioReservista() {
            return funcionarioReservista;
        }
        
	public String getEmailFuncionario() {
		return emailFuncionario;
	}

	public void setEmailFuncionario(String emailFuncionario) {
		this.emailFuncionario = emailFuncionario;
	}

	public String getNumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setNumeroFuncionario(String numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}
        
        public String navegar (String pagina) {
            return pagina;
        }
}