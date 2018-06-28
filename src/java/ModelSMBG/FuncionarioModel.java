package ModelSMBG;

import ModelSMBG.Entity.Funcionario;
import ModelSMBG.DAO.FuncionarioDAO;
import ModelSMBG.DAO.FuncionarioHibernate;
import ModelSMBG.DAO.DAO;
import java.util.List;

public class FuncionarioModel {

    private DAO daoFuncionario = new FuncionarioHibernate();

    public void cadastrarFuncionario(Funcionario funcionario) {
        if (buscarFuncionarioPeloCpf(funcionario.getCpf()) == null && 
                ChecarNulo.naoNulo(funcionario.getCpf(), funcionario.getFuncionarioIdentidade(), funcionario.getAdmissao())) {
            daoFuncionario.inserir(funcionario);
        }
    }

    public void atualizarFuncionario(Funcionario funcionario) {
        daoFuncionario.atualizar(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        daoFuncionario.deletar(funcionario);
    }

    public List<Funcionario> buscaTodosOsFuncionarios() {
        return daoFuncionario.listarTodos();
    }

    public Funcionario buscarFuncionarioPeloCpf(String cpf) {
        return ((FuncionarioDAO) daoFuncionario).buscarPeloCpf(cpf);
    }

    public Funcionario buscarFuncionarioPelaIdentidade(String numeroIdentidade) {
        return ((FuncionarioDAO) daoFuncionario).buscarPelaIdentidade(numeroIdentidade);
    }

    public Funcionario buscarFuncionarioPelaCnh(String cnh) {
        return ((FuncionarioDAO) daoFuncionario).buscarPelaCnh(cnh);
    }

}
