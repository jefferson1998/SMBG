package ModelSMBG.DAO;

import ModelSMBG.Entity.Rota;
import java.util.List;
import javax.persistence.EntityManager;

public class RotaHibernate implements RotaDAO {

    private final EntityManager em = GeradorDeEntityManager.getEntityManager();

    public RotaHibernate() {

    }

    @Override
    public void inserir(Rota rota) {

        try {
            em.getTransaction().begin();
            em.persist(rota);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }

    }

    @Override
    public void atualizar(Rota rota) {

        try {
            em.getTransaction().begin();
            em.merge(rota);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }

    }

    @Override
    public void deletar(Rota rota) {
        try {
            em.getTransaction().begin();
            em.remove(rota);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<Rota> listarTodos() {
        List<Rota> lista;
       
            lista = em.createQuery("from Rota").getResultList();
            return lista;
        
    }

    public List<Rota> buscarPelaOrigem(String origem) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Rota> buscarPeloDestino(String destino) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Rota> buscarPeloHorarioDeSaida(String horarioDeSaida) {
        // TODO Auto-generated method stub
        return null;
    }

}
