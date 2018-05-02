package modelSMBG;

public class Identidade {
	
	private String nome;
	private String numeroIdentidade;
        private String orgaoEmissor;
	private String dataDeEmissao;
	private String nomeDoPai;
	private String nomeDaMae;
	private String naturalidade;
	private String dataDeNascimento;
	private String uFIdentidade;
	
	
	public Identidade(String nome, String numeroIdentidade, String orgaoEmissor, String dataDeEmissao, String nomeDoPai,
			String nomeDaMae, String naturalidade, String dataDeNascimento, String uFIdentidade) {
		this.nome = nome;
		this.numeroIdentidade = numeroIdentidade;
                this.orgaoEmissor = orgaoEmissor;
		this.dataDeEmissao = dataDeEmissao;
		this.nomeDoPai = nomeDoPai;
		this.nomeDaMae = nomeDaMae;
		this.naturalidade = naturalidade;
		this.dataDeNascimento = dataDeNascimento;
                this.uFIdentidade = uFIdentidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroIdentidade() {
		return numeroIdentidade;
	}

	public void setNumeroIdentidade(String numeroIdentidade) {
		this.numeroIdentidade = numeroIdentidade;
	}
        
        public String getOrgaoEmissor() {
            return orgaoEmissor;
        }
        
        public void setOrgaoEmissor(String orgaoEmissor) {
            this.orgaoEmissor = orgaoEmissor;
        }

	public String getDataDeEmissao() {
		return dataDeEmissao;
	}

	public void setDataDeEmissao(String dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
	}

	public String getNomeDoPai() {
		return nomeDoPai;
	}

	public void setNomeDoPai(String nomeDoPai) {
		this.nomeDoPai = nomeDoPai;
	}

	public String getNomeDaMae() {
		return nomeDaMae;
	}

	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getuFIdentidade() {
		return uFIdentidade;
	}

	public void setuFIdentidade(String uFIdentidade) {
		this.uFIdentidade = uFIdentidade;
	}
	
	
}
