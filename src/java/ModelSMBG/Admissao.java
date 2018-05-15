package modelSMBG;

import java.io.Serializable;

public class Admissao implements Serializable {

    private String dataAdmissao;
    private double valorSalario;
    private String funcao;
    private int horas;
    private String instrucao;
    private int numeroDeFilhos;
    private Conta conta;
    private Funcionario funcionario;

    public Admissao(String dataAdmissao, double valorSalario, String funcao, int horas, String instrucao,
            int numeroDeFilhos, Conta conta, Funcionario funcionario) {
        this.dataAdmissao = dataAdmissao;
        this.valorSalario = valorSalario;
        this.funcao = funcao;
        this.horas = horas;
        this.instrucao = instrucao;
        this.numeroDeFilhos = numeroDeFilhos;
        this.conta = conta;
        this.funcionario = funcionario;
    }

    public Admissao() {
         
    }
    
    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getInstrucao() {
        return instrucao;
    }

    public void setInstrucao(String instrucao) {
        this.instrucao = instrucao;
    }

    public int getNumeroDeFilhos() {
        return numeroDeFilhos;
    }

    public void setNumeroDeFilhos(int numeroDeFilhos) {
        this.numeroDeFilhos = numeroDeFilhos;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Admissao)) {
            return false;
        }
        Admissao admissao = (Admissao) o;
        return this.funcionario.equals(admissao.getFuncionario());
    }

}
