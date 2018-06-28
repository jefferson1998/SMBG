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
    public List<Funcionario> listarTodos() {
        return this.em.createQuery("from Funcionario").getResultList();
    }

    @Override
    public Funcionario buscarPeloCpf(String cpf) {
        return (Funcionario) em.createQuery("from Funcionario WHERE cpf = ?").setParameter(1, cpf).getSingleResult();
    }

    public Funcionario buscarPelaIdentidade(String numeroIdentidade) {
        return (Funcionario) em.createQuery("from Funcionario WHERE numeroidentidade = ?").setParameter(1, numeroIdentidade).getSingleResult();
        
    }

    public Funcionario buscarPelaCnh(String numeroCnh) {
        return (Funcionario) em.createQuery("from Funcionario WHERE numerocnh = ?").setParameter(1, numeroCnh).getSingleResult();
    }

}
