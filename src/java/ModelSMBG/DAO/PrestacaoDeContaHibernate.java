package ModelSMBG.DAO;

import ModelSMBG.Entity.PrestacaoDeConta;
import java.util.List;
import javax.persistence.EntityManager;

public class PrestacaoDeContaHibernate implements PrestacaoDeContaDAO {

    private final EntityManager em = GeradorDeEntityManager.getEntityManager();

    public void inserir(PrestacaoDeConta objeto) {
        // TODO Auto-generated method stub

    }

    public void atualizar(PrestacaoDeConta objeto) {
        // TODO Auto-generated method stub

    }

    public void deletar(PrestacaoDeConta objeto) {
        // TODO Auto-generated method stub

    }

    public List<PrestacaoDeConta> listarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

    public PrestacaoDeConta buscarPeloCpfDoFuncionario(String cpf) {
        // TODO Auto-generated method stub
        return null;
    }

    public PrestacaoDeConta buscarPelaIdentidadeDoFuncionario(String numeroIdentidade) {
        // TODO Auto-generated method stub
        return null;
    }

    public PrestacaoDeConta buscarPelaCnhDoFuncionario(String cnh) {
        // TODO Auto-generated method stub
        return null;
    }

}
