package ModelSMBG.DAO;

import ModelSMBG.Entity.Funcionario;
import java.util.List;
import javax.persistence.EntityManager;

public class FuncionarioHibernate implements FuncionarioDAO {
    
    private final EntityManager em = GeradorDeEntityManager.getEntityManager();

    @Override
    public void inserir(Funcionario funcionario){
        try {
            em.getTransaction().begin();
            em.persist(funcionario);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
            
    }

    @Override
    public void atualizar(Funcionario funcionario) {
        
        try {
            em.getTransaction().begin();
            em.merge(funcionario);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        

    }

    @Override
    public void deletar(Funcionario funcionario) {
        
        try {
            em.getTransaction().begin();
            em.remove(funcionario);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        
    }

    @Override
    public List<Funcionario> listarTodos() {
        try {
            return this.em.createQuery("from Funcionario").getResultList();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return null;
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