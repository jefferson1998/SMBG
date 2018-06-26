package controllerSMBG;

import ModelSMBG.Entity.Funcionario;
import ModelSMBG.Entity.PrestacaoDeConta;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ControllerPrestacaoDeContasSMBG {

    private PrestacaoDeConta prestacaoDeConta;
    private Funcionario funcionarioQuePrestouConta;

    public ControllerPrestacaoDeContasSMBG() {
        prestacaoDeConta = new PrestacaoDeConta();
        prestacaoDeConta.setValorTotalDoCombustivel(
                prestacaoDeConta.getValorDoLitroDeCombustivel() * prestacaoDeConta.getQuantidadeDeLitrosAbastecido());
        
        prestacaoDeConta.setValorArrecadadoDescontado(
                prestacaoDeConta.getValorTotalArrecadadoNoDia() - prestacaoDeConta.getValorTotalDoCombustivel() - 
                        prestacaoDeConta.getSalarioDoMotorista() - prestacaoDeConta.getSalarioDoCobrador());
        
        funcionarioQuePrestouConta = null; //Pegar o nome do funcionario logado na sessao
    }

    public PrestacaoDeConta getPrestacaoDeConta() {
        return prestacaoDeConta;
    }

    public void setPrestacaoDeConta(PrestacaoDeConta prestacaoDeConta) {
        this.prestacaoDeConta = prestacaoDeConta;
    }

    public Funcionario getFuncionarioQuePrestouConta() {
        return funcionarioQuePrestouConta;
    }

    public void setFuncionarioQuePrestouConta(Funcionario funcionarioQuePrestouConta) {
        this.funcionarioQuePrestouConta = funcionarioQuePrestouConta;
    }
    
}
