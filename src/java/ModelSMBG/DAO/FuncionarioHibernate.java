package ModelSMBG.DAO;

import ModelSMBG.Entity.Funcionario;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;

public class FuncionarioHibernate implements FuncionarioDAO {
    
    private final EntityManager em = GeradorDeEntityManager.getEntityManager();

    @Override
    public void inserir(Funcionario funcionario){
        em.getTransaction().begin();
        em.persist(funcionario);
        em.getTransaction().commit();
            
    }

    @Override
    public void atualizar(Funcionario funcionario) {
        //poe essas coisas da tela no Controller
        FacesContext context = FacesContext.getCurrentInstance();
        
        em.getTransaction().begin();
        em.merge(funcionario);
        em.getTransaction().commit();

        //poe essas coisas da tela no Controller
        context.addMessage(null, new FacesMessage("Alteração Efetuada!"));
    }

    @Override
    public void deletar(Funcionario funcionario) {
        //poe essas coisas da tela no Controller
        FacesContext context = FacesContext.getCurrentInstance();
        
        em.getTransaction().begin();
        em.remove(funcionario);
        em.getTransaction().commit();
        
        //poe essas coisas da tela no Controller
        context.addMessage(null, new FacesMessage("Remoção Efetuada!"));
    }

    @Override
    public List<Funcionario> listarTodos() {
        return this.em.createQuery("from Funcionario").getResultList();
    }

    @Override
    public Funcionario buscarPeloCpf(String cpf) {
        // TODO Auto-generated method stub
        return null;
    }

    public Funcionario buscarPelaIdentidade(String numeroIdentidade) {
        // TODO Auto-generated method stub
        return null;
    }

    public Funcionario buscarPelaCnh(String cnh) {
        // TODO Auto-generated method stub
        return null;
    }

}