package ModelSMBG;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdmissaoHibernate implements AdmissaoDAO {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("TesteSMBG");
        private static EntityManager em;

        public AdmissaoHibernate() {
             em =  this.emf.createEntityManager();
        }
        
        
	public void inserir(Admissao admissao) {
            em.getTransaction().begin();
            em.persist(admissao);
            em.getTransaction().commit();
		
	}
	
	public void atualizar(Admissao admissao) {
		// TODO Auto-generated method stub
		
	}

	public void deletar(Admissao admissao) {
		// TODO Auto-generated method stub
		
	}
	
	public List<Admissao> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Admissao buscarPeloCpfDoFuncionario(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Admissao buscarPelaIdentidadeDoFuncionario(String numeroIdentidade) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Admissao buscarPelaCnhDoFuncionario(String cnh) {
		// TODO Auto-generated method stub
		return null;
	}

}
