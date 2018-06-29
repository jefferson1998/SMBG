package ModelSMBG.DAO;

import ModelSMBG.Entity.Funcionario;
import java.util.List;
import javax.persistence.EntityManager;

public class FuncionarioHibernate implements FuncionarioDAO {
    
    private EntityManager em = GeradorDeEntityManager.getEntityManager();

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
        List<Funcionario> funcionarios;
        try {
            funcionarios = this.em.createQuery("from Funcionario").getResultList();
        } catch (Exception e) {
            funcionarios = null;
        } 
        return funcionarios;
    }

    @Override
    public Funcionario buscarPeloCpf(String cpf) {
        Funcionario funcionario;
        try {
            funcionario = (Funcionario) em.createQuery("from Funcionario f WHERE f.cpf = ?1").setParameter(1, cpf).getSingleResult();
        } catch (Exception e) {
            funcionario = null;
        } 
        return funcionario;
    }

    public Funcionario buscarPelaIdentidade(String numeroIdentidade) {
        return (Funcionario) em.createQuery("from Funcionario WHERE numeroidentidade = ?").setParameter(1, numeroIdentidade).getSingleResult();
        
    }

    public Funcionario buscarPelaCnh(String numeroCnh) {
        return (Funcionario) em.createQuery("from Funcionario WHERE numerocnh = ?").setParameter(1, numeroCnh).getSingleResult();
    }

}
