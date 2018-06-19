package ModelSMBG;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RotaHibernate implements RotaDAO{
    
        private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("TesteSMBG");
        private static EntityManager em;

        public RotaHibernate() {
            em =  this.emf.createEntityManager();
        }
    
    
	@Override
	public void inserir(Rota rota) {
            em.getTransaction().begin();
            em.persist(rota);
            em.getTransaction().commit();
	}

	@Override
	public void atualizar(Rota rota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(Rota rota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Rota> listarTodos() {
		// TODO Auto-generated method stub
		return null;
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
