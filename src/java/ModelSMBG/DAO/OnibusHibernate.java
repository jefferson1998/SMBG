package ModelSMBG.DAO;

import ModelSMBG.Entity.Onibus;
import java.util.List;
import javax.persistence.EntityManager;

public class OnibusHibernate implements OnibusDAO {

    private final EntityManager em = GeradorDeEntityManager.getEntityManager();

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
        return em.createQuery("from Onibus").getResultList();
    }

    @Override
    public Onibus buscarPeloOnibusPeloCodigoRenavam(String codigoRenavam) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Onibus buscarPeloOnibusChassis(String chassi) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Onibus buscarPelaOnibusPlaca(String placa) {
        // TODO Auto-generated method stub
        return null;
    }

}
