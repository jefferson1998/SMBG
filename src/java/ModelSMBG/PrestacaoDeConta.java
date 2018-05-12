package modelSMBG;

public class PrestacaoDeConta {

    private Funcionario funcionario;
    private double valorTotalArrecadadoNoDia;
    private double valorArrecadadoDescontado;
    private double valorTotalDoCombustivel;
    private double valorDoLitroDeCombustivel;
    private double quantidadeDeLitrosAbastecido;
    private double valorTroco;
    private double salarioDoCobrador;
    private double salarioDoMotorista;

    public PrestacaoDeConta(Funcionario funcionario, double valorTotalArrecadadoNoDia, double valorArrecadadoDescontado,
            double valorTotalDoCombustivel, double valorDoLitroDeCombustivel, double quantidadeDeLitrosAbastecido,
            double valorTroco, double salarioDoCobrador, double salarioDoMotorista) {
        this.funcionario = funcionario;
        this.valorTotalArrecadadoNoDia = valorTotalArrecadadoNoDia;
        this.valorArrecadadoDescontado = valorArrecadadoDescontado;
        this.valorTotalDoCombustivel = valorTotalDoCombustivel;
        this.valorDoLitroDeCombustivel = valorDoLitroDeCombustivel;
        this.quantidadeDeLitrosAbastecido = quantidadeDeLitrosAbastecido;
        this.valorTroco = valorTroco;
        this.salarioDoCobrador = salarioDoCobrador;
        this.salarioDoMotorista = salarioDoMotorista;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getValorTotalArrecadadoNoDia() {
        return valorTotalArrecadadoNoDia;
    }

    public void setValorTotalArrecadadoNoDia(double valorTotalArrecadadoNoDia) {
        this.valorTotalArrecadadoNoDia = valorTotalArrecadadoNoDia;
    }

    public double getValorArrecadadoDescontado() {
        return valorArrecadadoDescontado;
    }

    public void setValorArrecadadoDescontado(double valorArrecadadoDescontado) {
        this.valorArrecadadoDescontado = valorArrecadadoDescontado;
    }

    public double getValorTotalDoCombustivel() {
        return valorTotalDoCombustivel;
    }

    public void setValorTotalDoCombustivel(double valorTotalDoCombustivel) {
        this.valorTotalDoCombustivel = valorTotalDoCombustivel;
    }

    public double getValorDoLitroDeCombustivel() {
        return valorDoLitroDeCombustivel;
    }

    public void setValorDoLitroDeCombustivel(double valorDoLitroDeCombustivel) {
        this.valorDoLitroDeCombustivel = valorDoLitroDeCombustivel;
    }

    public double getQuantidadeDeLitrosAbastecido() {
        return quantidadeDeLitrosAbastecido;
    }

    public void setQuantidadeDeLitrosAbastecido(double quantidadeDeLitrosAbastecido) {
        this.quantidadeDeLitrosAbastecido = quantidadeDeLitrosAbastecido;
    }

    public double getValorTroco() {
        return valorTroco;
    }

    public void setValorTroco(double valorTroco) {
        this.valorTroco = valorTroco;
    }

    public double getSalarioDoCobrador() {
        return salarioDoCobrador;
    }

    public void setSalarioDoCobrador(double salarioDoCobrador) {
        this.salarioDoCobrador = salarioDoCobrador;
    }

    public double getSalarioDoMotorista() {
        return salarioDoMotorista;
    }

    public void setSalarioDoMotorista(double salarioDoMotorista) {
        this.salarioDoMotorista = salarioDoMotorista;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrestacaoDeConta)) {
            return false;
        }

        PrestacaoDeConta prestacaoDeConta = (PrestacaoDeConta) obj;

        return this.funcionario.getCPF().equals(prestacaoDeConta.funcionario.getCPF())
                || this.funcionario.getFuncionarioIdentidade().equals(prestacaoDeConta.funcionario.getFuncionarioIdentidade())
                || this.funcionario.getFuncionarioCNH().equals(prestacaoDeConta.funcionario.getFuncionarioCNH());
    }

}
