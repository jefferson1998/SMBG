/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerSMBG;

import ModelSMBG.Funcionario;
import ModelSMBG.FuncionarioModel;
import ModelSMBG.GeradorDeEntityManager;
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
        funcionarioModel = new FuncionarioModel(entityManager);
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void cadastrarFuncionario() {
        FacesContext context = FacesContext.getCurrentInstance();
        funcionarioModel.cadastrarFuncionario(funcionario);
        context.addMessage(null, new FacesMessage("Cadastro Efetuado!"));
        GeradorDeEntityManager.fecharEntityManager(entityManager);
        listaTodos();
        funcionario =  new Funcionario();
        
    }
    
    public void removerFuncionario() {
        funcionarioModel.removerFuncionario(funcionario);
        listaTodos();
        funcionario =  new Funcionario();
        
    }
    
    public List<Funcionario> listaTodos() {
        //pq tu faz mais um model?
        funcionarioModel = new FuncionarioModel();
        listaFuncionario = funcionarioModel.buscaTodosOsFuncionarios();
        Collections.sort(listaFuncionario);
        GeradorDeEntityManager.fecharEntityManager(entityManager);
        funcionario =  new Funcionario();
        return listaFuncionario;
        
    }
    
    
    public int totalDeMotoristas() {
        //pq tu faz mais um model?
        funcionarioModel = new FuncionarioModel();
        listaFuncionario = funcionarioModel.buscaTodosOsFuncionarios();
        int contador = 0;
        for(int i = 0; i < listaFuncionario.size(); i++) {
            if(listaFuncionario.get(i).getAdmissao().getFuncao().equals("Motorista")) {
                contador ++;
            }
        }
        return contador;
    }
    
    public int totalDeCobradores() {
        //pq tu faz mais um model?
        funcionarioModel = new FuncionarioModel();
        listaFuncionario = funcionarioModel.buscaTodosOsFuncionarios();
        int contador = 0;
        for(int i = 0; i < listaFuncionario.size(); i++) {
            if(listaFuncionario.get(i).getAdmissao().getFuncao().equals("Cobrador")) {
                contador ++;
            }
        }
        return contador;
    }
    
}
