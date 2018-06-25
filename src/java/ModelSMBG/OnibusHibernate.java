package ModelSMBG;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;

public class OnibusHibernate implements OnibusDAO {

        private final EntityManager em = GeradorDeEntityManager.getEntityManager();
        
        public OnibusHibernate() {

        }
        
        @Override
	public void inserir(Onibus onibus){
            FacesContext context = FacesContext.getCurrentInstance();
            
                em.getTransaction().begin();
                em.persist(onibus);
                em.getTransaction().commit();
                context.addMessage(null, new FacesMessage("Cadastro Efetuado!"));
                
	}

        @Override
	public void atualizar(Onibus onibus) {
            FacesContext context = FacesContext.getCurrentInstance();
            
            em.getTransaction().begin();
            em.merge(onibus);
            em.getTransaction().commit();
            
            context.addMessage(null, new FacesMessage("Alteração Efetuada!"));
	}

	@Override
	public void deletar(Onibus onibus) {
            FacesContext context = FacesContext.getCurrentInstance();
            
            em.getTransaction().begin();
            em.remove(onibus);
            em.getTransaction().commit();
            
            context.addMessage(null, new FacesMessage("Remoção Efetuada!"));
		
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
