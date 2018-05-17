package modelSMBG;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.persistence.OneToMany;
 
@Entity 
@Table(name = "Funcionario")
public class Funcionario implements Serializable {
 
    @Id
    private Long Cod_Funcionario;
    
    @Embedded
    private Identidade funcionarioIdentidade;
    
    @Column(name = "cpf", nullable = false, length = 11, unique = true)
    private String cpf;
    
    @Embedded
    private Endereco funcionarioEndereco;
    
    @Embedded
    private CNH funcionarioCNH;
    
    @Column(name = "pis", nullable = true, unique = false)
    private String pis;
    
    @Embedded
    private Titulo funcionarioTitulo;
    
    @Embedded
    private CTPS funcionarioCTPS;
    
    @Embedded
    private Reservista funcionarioReservista;
    
    @OneToMany
    private List<String> emailFuncionario;
    
    @OneToMany
    private List<String> numeroFuncionario;
    
    @Column(name = "estadoCivil")
    private String estadoCivil;
 
    public Funcionario(Identidade funcionarioIdentidade, String cpf,
            Endereco funcionarioEndereco, CNH funcionarioCNH, String pis,
            Titulo funcionarioTitulo, CTPS funcionarioCTPS, Reservista funcionarioReservista,
            String emailFuncionario, String numeroFuncionario, String estadoCivil) {
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
        this.estadoCivil = estadoCivil;
    }

    public Funcionario() {
        
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

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Funcionario)) {
            return false;
        }

        Funcionario funcionario = (Funcionario) o;
        return this.cpf.equals(funcionario.getCPF());
    }

    public Long getCod_Funcionario() {
        return Cod_Funcionario;
    }

    public void setCod_Funcionario(Long Cod_Funcionario) {
        this.Cod_Funcionario = Cod_Funcionario;
    }
}
