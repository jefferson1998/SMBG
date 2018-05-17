package modelSMBG;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Identidade {
    
	@Column(name = "nome", nullable = false)
	private String nome;
        
        @Column(name = "numeroIdentidade", nullable = false, length = 10)
	private String numeroIdentidade;
        
        @Column(name = "orgaoEmissor", nullable = false, length = 5)
        private String orgaoEmissor;
        
        @Column (name = "dataEmissao", nullable = false)
	private Date dataDeEmissao;
        
        @Column (name = "nomePai", nullable = true)
	private String nomeDoPai;
        
        @Column (name = "nomeMae", nullable = false)
	private String nomeDaMae;
        
        @Column (name = "naturalidade", nullable = true)
	private String naturalidade;
        
        @Column (name = "dataNascimento", nullable = true)
	private Date dataDeNascimento;
        
        @Column (name = "ufIdentidade", nullable = false, length = 2)
	private String uFIdentidade;
	
	
	public Identidade(String nome, String numeroIdentidade, String orgaoEmissor, Date dataDeEmissao, String nomeDoPai,
			String nomeDaMae, String naturalidade, Date dataDeNascimento, String uFIdentidade) {
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

	public Date getDataDeEmissao() {
		return dataDeEmissao;
	}

	public void setDataDeEmissao(Date dataDeEmissao) {
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

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
                this.dataDeNascimento = dataDeNascimento;
        }

	public String getuFIdentidade() {
		return uFIdentidade;
	}

	public void setuFIdentidade(String uFIdentidade) {
		this.uFIdentidade = uFIdentidade;
	}
	
	
}
