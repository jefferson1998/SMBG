package ModelSMBG.DAO;

import ModelSMBG.Entity.SeguroOnibus;
import java.util.List;
import javax.persistence.EntityManager;

public class SeguroOnibusHibernate implements SeguroOnibusDAO {

    private EntityManager em = GeradorDeEntityManager.getEntityManager();

    @Override
    public void inserir(SeguroOnibus seguroOnibus) {
        try {
            em.getTransaction().begin();
            em.persist(seguroOnibus);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
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
        }
    }

    @Override
    public List<SeguroOnibus> listarTodos() {
        
        List<SeguroOnibus> lista;
        
        lista = this.em.createQuery("from SeguroOnibus").getResultList();
        return lista;
    }

    @Override
    public SeguroOnibus buscarPeloCodigoSusepDoCorretor(int codigoSusepDoCorretor) {
        try {
            return (SeguroOnibus) em.createQuery("from SeguroOnibus WHERE codigoSusepDoCorretor = ?").
                    setParameter(1, codigoSusepDoCorretor).getSingleResult();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return null;
    }

    @Override
    public SeguroOnibus buscarPeloCodigoCpdDoCorretor(int codigoCpdDoCorretor) {
        try {
            return (SeguroOnibus) em.createQuery("from SeguroOnibus WHERE codigoCpdDoCorretor = ?").
                    setParameter(1, codigoCpdDoCorretor).getSingleResult();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return null;
    }

    @Override
    public SeguroOnibus buscarPeloCodigoSusep(int codigoSusep) {
       
            return (SeguroOnibus) em.createQuery("from SeguroOnibus WHERE codigoSusep = ?").
                    setParameter(1, codigoSusep).getSingleResult();
    }

    @Override
    public SeguroOnibus buscarPeloCnpjDaEmpresaDoSeguro(String cpnj) {
      
            return (SeguroOnibus) em.createQuery("from SeguroOnibus WHERE cpnj = ?").
                    setParameter(1, cpnj).getSingleResult();
        
    }

    @Override
    public SeguroOnibus buscarPeloCpfOuCnpjDoSegurado(String cpfOuCnpjDoSegurado) {
        
            return (SeguroOnibus) em.createQuery("from SeguroOnibus WHERE cpfOuCnpjDoSegurado = ?").
                    setParameter(1, cpfOuCnpjDoSegurado).getSingleResult();
        
    }

    @Override
    public SeguroOnibus buscarPeloNumeroEndosso(int numeroEndosso) {
      
            return (SeguroOnibus) em.createQuery("from SeguroOnibus WHERE numeroEndosso = ?").
                    setParameter(1, numeroEndosso).getSingleResult();
       
    }

}
