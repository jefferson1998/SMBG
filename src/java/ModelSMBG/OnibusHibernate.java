package ModelSMBG;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OnibusHibernate implements OnibusDAO {

        private static EntityManager em;
        private ConexaoBancoDeDados conexao;
        
        public OnibusHibernate() {
           em = (EntityManager) ConexaoBancoDeDados.getConexao();
        }
        
	public void inserir(Onibus onibus) {
            em.getTransaction().begin();
            em.persist(onibus);
            em.getTransaction().commit();
	}

	public void atualizar(Onibus onibus) {
            em.getTransaction().begin();
            em.merge(onibus);
            em.getTransaction().commit();
	}

	
	public void deletar(Onibus onibus) {
            em.getTransaction().begin();
            em.remove(onibus);
            em.getTransaction().commit();
		
	}

	
	public List<Onibus> listarTodos() {
            return this.em.createQuery("from Onibus").getResultList();
	}

	
	public Onibus buscarPeloOnibusPeloCodigoRenavam(String codigoRenavam) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Onibus buscarPeloOnibusChassis(String chassi) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Onibus buscarPelaOnibusPlaca(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
