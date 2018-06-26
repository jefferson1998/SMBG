package ModelSMBG.Entity;

import ModelSMBG.DAO.Persistivel;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Table(name = "Funcionario")
@AttributeOverride(name = "id", column = @Column(name = "Cod_Funcionario"))
public class Funcionario extends Persistivel implements Serializable, Comparable<Funcionario> {

    @Column(name = "senhaDoUsuario", length = 20)
    private String senha;
    
    @Embedded
    private Identidade funcionarioIdentidade;

    @Embedded
    private CPF cpf;

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

    @ElementCollection
    @CollectionTable(name = "email_Funcionario", joinColumns = @JoinColumn(name = "Cod_Funcionario"))
    @Column(name = "email_funcionario")
    private List<String> emailFuncionario;

    @ElementCollection
    @CollectionTable(name = "telefone_Funcionario", joinColumns = @JoinColumn(name = "Cod_Funcionario"))
    @Column(name = "telefone")
    private List<String> numeroTelefoneFuncionario;

    @Column(name = "estadoCivil")
    private String estadoCivil;

    @JoinColumn(name = "Cod_admissao", referencedColumnName = "Cod_Admissao")
    @OneToOne(cascade = CascadeType.ALL)
    private Admissao admissao;

    public Funcionario() {

        funcionarioIdentidade = new Identidade();
        funcionarioEndereco = new Endereco();
        funcionarioCNH = new CNH();
        funcionarioTitulo = new Titulo();
        funcionarioCTPS = new CTPS();
        funcionarioReservista = new Reservista();
        cpf = new CPF();
        admissao = new Admissao();

    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Identidade getFuncionarioIdentidade() {
        return funcionarioIdentidade;
    }

    public void setFuncionarioIdentidade(Identidade funcionarioIdentidade) {
        this.funcionarioIdentidade = funcionarioIdentidade;
    }

    public CPF getCPF() {
        return cpf;
    }

    public void setCPF(CPF cpf) {
        this.cpf = cpf;
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

    public List<String> getEmailFuncionario() {
        return emailFuncionario;
    }

    public void setEmailFuncionario(List<String> emailFuncionario) {
        this.emailFuncionario = emailFuncionario;
    }

    public List<String> getNumeroTelefoneFuncionario() {
        return numeroTelefoneFuncionario;
    }

    public void setNumeroTelefoneFuncionario(List<String> numeroTelefoneFuncionario) {
        this.numeroTelefoneFuncionario = numeroTelefoneFuncionario;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public Admissao getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Admissao admissao) {
        this.admissao = admissao;
    }

    @Override
    public int compareTo(Funcionario funcionario) {
        if (this.funcionarioIdentidade.getNome().compareTo(funcionario.funcionarioIdentidade.getNome()) != 0) {
            return this.funcionarioIdentidade.getNome().compareTo(funcionario.funcionarioIdentidade.getNome());
        }
        
        if (this.funcionarioIdentidade.getDataDeNascimento().substring(
                this.funcionarioIdentidade.getDataDeNascimento().length() - 4).compareTo(
                funcionario.getFuncionarioIdentidade().getDataDeNascimento().substring(
                        funcionario.getFuncionarioIdentidade().getDataDeNascimento().length() - 4)) > 0) {
            return -1;
        }

        if (this.funcionarioIdentidade.getDataDeNascimento().substring(
                this.funcionarioIdentidade.getDataDeNascimento().length() - 4).compareTo(
                funcionario.getFuncionarioIdentidade().getDataDeNascimento().substring(
                        funcionario.getFuncionarioIdentidade().getDataDeNascimento().length() - 4)) < 0) {
            return 1;
        }

        if (this.funcionarioIdentidade.getDataDeNascimento().substring(3, 5).compareTo(
                funcionario.getFuncionarioIdentidade().getDataDeNascimento().substring(3, 5)) > 0) {
            return -1;
        }

        if (this.funcionarioIdentidade.getDataDeNascimento().substring(3, 5).compareTo(
                funcionario.getFuncionarioIdentidade().getDataDeNascimento().substring(3, 5)) < 0) {
            return 1;
        }

        if (this.funcionarioIdentidade.getDataDeNascimento().substring(0, 3).compareTo(
                funcionario.getFuncionarioIdentidade().getDataDeNascimento().substring(0, 3)) > 0) {
            return -1;
        }

        if (this.funcionarioIdentidade.getDataDeNascimento().substring(0, 3).compareTo(
                funcionario.getFuncionarioIdentidade().getDataDeNascimento().substring(0, 3)) < 0) {
            return 1;
        }

        return 0;
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

    @Override
    public int hashCode() {
        return Objects.hash(cpf, estadoCivil, funcionarioIdentidade.getNumeroIdentidade(),
                funcionarioIdentidade.getNome(), funcionarioIdentidade.getDataDeEmissao(),
                funcionarioIdentidade.getOrgaoEmissor(), funcionarioIdentidade.getNomeDaMae(),
                funcionarioIdentidade.getUFIdentidade(), funcionarioEndereco);
    }

}
