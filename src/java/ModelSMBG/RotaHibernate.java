package ModelSMBG;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RotaHibernate implements RotaDAO{
    
        private final EntityManager em = GeradorDeEntityManager.getEntityManager();

        public RotaHibernate() {

        }
    
    
	@Override
	public void inserir(Rota rota) {
            em.getTransaction().begin();
            em.persist(rota);
            em.getTransaction().commit();
	}

	@Override
	public void atualizar(Rota rota) {
            em.getTransaction().begin();
            em.merge(rota);
            em.getTransaction().commit();
	}

	@Override
	public void deletar(Rota rota) {
		em.getTransaction().begin();
                em.remove(rota);
                em.getTransaction().commit();
	}

	@Override
	public List<Rota> listarTodos() {
            
		return em.createQuery("from Rota").getResultList();
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
