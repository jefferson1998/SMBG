package ModelSMBG;

import ModelSMBG.Entity.Funcionario;
import ModelSMBG.DAO.FuncionarioDAO;
import ModelSMBG.DAO.FuncionarioHibernate;
import ModelSMBG.DAO.DAO;
import java.util.List;

public class FuncionarioModel {

   private DAO<Funcionario> daoFuncionario = new FuncionarioHibernate();
    
    public void cadastrarFuncionario(Funcionario funcionario) throws Exception {
        if (buscarFuncionarioPeloCpf(funcionario.getCpf()) == null) {
            funcionario.setSenha(funcionario.getCpf().substring(9,11) + "" + funcionario.getCpf().substring(12,funcionario.getCpf().length()));
            daoFuncionario.inserir(funcionario);
        } else {
            throw new Exception("CPF já cadastrado!");
        }
    }

    public void atualizarFuncionario(Funcionario funcionario) throws Exception{
        if (buscarFuncionarioPeloCpf(funcionario.getCpf()) == null) {
            daoFuncionario.atualizar(funcionario);
        } else {
            throw new Exception("CPF já cadastrado!");
        }
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
