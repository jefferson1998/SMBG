package modelSMBG;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity 
@Table(name = "Funcionario")
public class Funcionario extends Persistivel implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @JoinColumn(name = "Cod_Viagem", referencedColumnName = "Viagem")
    @ManyToOne
    private Viagem viagem;
    
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
    private List<Email> emailFuncionario;
    
    @OneToMany
    private List<NumeroTelefone> numeroTelefoneFuncionario;
    
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
        this.numeroTelefoneFuncionario = numeroTelefoneFuncionario;
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

    public List<Email> getEmailFuncionario() {
        return emailFuncionario;
    }

    public void setEmailFuncionario(List<Email> emailFuncionario) {
        this.emailFuncionario = emailFuncionario;
    }

     public List<NumeroTelefone> getNumeroTelefoneFuncionario() {
        return numeroTelefoneFuncionario;
    }

    public void setNumeroTelefoneFuncionario(List<NumeroTelefone> numeroTelefoneFuncionario) {
        this.numeroTelefoneFuncionario = numeroTelefoneFuncionario;
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

}
