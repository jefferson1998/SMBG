package ModelSMBG;

import java.util.List;
import javax.persistence.EntityManager;

public class FuncionarioHibernate implements FuncionarioDAO {
    
    private final EntityManager em = GeradorDeEntityManager.getEntityManager();

    public FuncionarioHibernate() {
        
    }
    
    @Override
    public void inserir(Funcionario funcionario) {
        em.getTransaction().begin();
        em.persist(funcionario);
        em.getTransaction().commit();
    }

    @Override
    public void atualizar(Funcionario funcionario) {
        em.getTransaction().begin();
        em.merge(funcionario);
        em.getTransaction().commit();

    }

    @Override
    public void deletar(Funcionario funcionario) {
        em.getTransaction().begin();
        em.remove(funcionario);
        em.getTransaction().commit();
    }

    @Override
    public List<Funcionario> listarTodos() {
        return this.em.createQuery("from Funcionario").getResultList();
    }

    @Override
    public Funcionario buscarPeloCpf(String cpf) {
        // TODO Auto-generated method stub
        return null;
    }

    public Funcionario buscarPelaIdentidade(String numeroIdentidade) {
        // TODO Auto-generated method stub
        return null;
    }

    public Funcionario buscarPelaCnh(String cnh) {
        // TODO Auto-generated method stub
        return null;
    }

}