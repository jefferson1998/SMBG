/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerSMBG;

import ModelSMBG.Entity.Funcionario;
import ModelSMBG.FuncionarioModel;
import ModelSMBG.DAO.GeradorDeEntityManager;
import ModelSMBG.IteratorFuncionario;
import java.util.Collections;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;

/**
 *
 * @author Jessin
 */
@ManagedBean
@SessionScoped
public class ControllerFuncionarioSMBG {
    
    private final EntityManager entityManager;
    private Funcionario funcionario;
    private FuncionarioModel funcionarioModel;
    private List<Funcionario> listaFuncionario;
    
     public ControllerFuncionarioSMBG() {
        this.entityManager = GeradorDeEntityManager.getEntityManager();
        funcionario =  new Funcionario();
        funcionarioModel = new FuncionarioModel();
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void cadastrarFuncionario() {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            funcionarioModel.cadastrarFuncionario(funcionario);
            context.addMessage(null, new FacesMessage("Cadastro Efetuado!"));
            GeradorDeEntityManager.fecharEntityManager(entityManager);
            listaTodos();
            funcionario = new Funcionario();
        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage(ex.getMessage()));
        }

    }
    
    public void removerFuncionario() {
        funcionarioModel.removerFuncionario(funcionario);
        listaTodos();
        funcionario =  new Funcionario();
        
    }
    
    public List<Funcionario> listaTodos() {
        listaFuncionario = funcionarioModel.buscaTodosOsFuncionarios();
        Collections.sort(listaFuncionario);
        GeradorDeEntityManager.fecharEntityManager(entityManager);
        funcionario =  new Funcionario();
        return listaFuncionario;
        
    }
    
    
    public int totalDeMotoristas() {
        listaFuncionario = funcionarioModel.buscaTodosOsFuncionarios();
        int contador = 0;
        
        IteratorFuncionario iteratorFuncionario = new IteratorFuncionario(listaFuncionario);
        while (iteratorFuncionario.hasNext()){
            if(iteratorFuncionario.next().getAdmissao().getFuncao().equals("Motorista"))
                contador++;
        }
        return contador;
    }
    
    public int totalDeCobradores() {
        listaFuncionario = funcionarioModel.buscaTodosOsFuncionarios();
        int contador = 0;
        IteratorFuncionario iteratorFuncionario = new IteratorFuncionario(listaFuncionario);
        while (iteratorFuncionario.hasNext()){
            if(iteratorFuncionario.next().getAdmissao().getFuncao().equals("Cobrador"))
                contador++;
        }
        return contador;
    }
}
