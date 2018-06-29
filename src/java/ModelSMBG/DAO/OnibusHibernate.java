package ModelSMBG.DAO;

import ModelSMBG.Entity.Onibus;
import java.util.List;
import javax.persistence.EntityManager;

public class OnibusHibernate implements OnibusDAO {

    private EntityManager em = GeradorDeEntityManager.getEntityManager();

    public OnibusHibernate() {

    }

    @Override
    public void inserir(Onibus onibus) {

        try {
            em.getTransaction().begin();
            em.persist(onibus);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

    }

    @Override
    public void atualizar(Onibus onibus) {

        try {
            em.getTransaction().begin();
            em.merge(onibus);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

    }

    @Override
    public void deletar(Onibus onibus) {

        try {
            em.getTransaction().begin();
            em.remove(onibus);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

    }

    @Override
    public List<Onibus> listarTodos() {
        List<Onibus> lista;
        try {
            lista = em.createQuery("from Onibus").getResultList();
        } catch (Exception e) {
            lista = null;
        }
        return lista;
       
    }

    @Override
    public Onibus buscarPeloOnibusPeloCodigoRenavam(String codigoRenavam) {
        
        try {
            return (Onibus) em.createQuery("from Onibus WHERE codigoRenavam = ?").setParameter(1, codigoRenavam).getSingleResult();
        } catch (Exception e) {
        } finally {
            em.close();
        }
        return null;
     
    }

    @Override
    public Onibus buscarPeloOnibusChassis(String chassi) {
        try {
            return (Onibus) em.createQuery("from Onibus WHERE chassi = ?").setParameter(1, chassi).getSingleResult();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return null;
    }

    @Override
    public Onibus buscarPelaOnibusPlaca(String placa) {
        try {
            return (Onibus) em.createQuery("from Onibus WHERE placa = ?").setParameter(1, placa).getSingleResult();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return null;
    }

}
