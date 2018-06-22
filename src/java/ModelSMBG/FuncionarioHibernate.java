package ModelSMBG;

import java.sql.SQLException;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;

public class FuncionarioHibernate implements FuncionarioDAO {
    
    private final EntityManager em = GeradorDeEntityManager.getEntityManager();

    public FuncionarioHibernate() {
        
    }
    
    @Override
    public void inserir(Funcionario funcionario){
        FacesContext context = FacesContext.getCurrentInstance();
        
        em.getTransaction().begin();
        em.persist(funcionario);
        em.getTransaction().commit();
            
        context.addMessage(null, new FacesMessage("Cadastro Efetuado!"));
    }

    @Override
    public void atualizar(Funcionario funcionario) {
        FacesContext context = FacesContext.getCurrentInstance();
        
        em.getTransaction().begin();
        em.merge(funcionario);
        em.getTransaction().commit();

        context.addMessage(null, new FacesMessage("Alteração Efetuada!"));
    }

    @Override
    public void deletar(Funcionario funcionario) {
        FacesContext context = FacesContext.getCurrentInstance();
        
        em.getTransaction().begin();
        em.remove(funcionario);
        em.getTransaction().commit();
        
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