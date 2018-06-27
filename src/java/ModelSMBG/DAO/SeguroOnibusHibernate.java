package ModelSMBG.DAO;

import ModelSMBG.Entity.SeguroOnibus;
import java.util.List;
import javax.persistence.EntityManager;

public class SeguroOnibusHibernate implements SeguroOnibusDAO {

    private final EntityManager em = GeradorDeEntityManager.getEntityManager();

    @Override
    public void inserir(SeguroOnibus seguroOnibus) {
        try {
            em.getTransaction().begin();
            em.persist(seguroOnibus);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void atualizar(SeguroOnibus seguroOnibus) {
        try {
            em.getTransaction().begin();
            em.merge(seguroOnibus);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void deletar(SeguroOnibus seguroOnibus) {
        try {
            em.getTransaction().begin();
            em.remove(seguroOnibus);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public List<SeguroOnibus> listarTodos() {
        try {
            return this.em.createQuery("from SeguroOnibus").getResultList();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return null;
    }

    @Override
    public SeguroOnibus buscarPeloCodigoSusepDoCorretor(int codigoSusepDoCorretor) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SeguroOnibus buscarPeloCodigoCpdDoCorretor(int codigoCpdDoCorretor) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SeguroOnibus buscarPeloCodigoSusep(int codigoSusep) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SeguroOnibus buscarPeloCnpjDaEmpresaDoSeguro(String cpnj) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SeguroOnibus buscarPeloCpfOuCnpjDoSegurado(String cpfOuCnpjDoSegurado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SeguroOnibus buscarPeloNumeroEndosso(int numeroEndosso) {
        // TODO Auto-generated method stub
        return null;
    }

}
