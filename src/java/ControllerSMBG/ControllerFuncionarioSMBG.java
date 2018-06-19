/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerSMBG;

import ModelSMBG.Funcionario;
import ModelSMBG.FuncionarioModel;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

/**
 *
 * @author Jessin
 */
@ManagedBean
@SessionScoped
public class ControllerFuncionarioSMBG {
    
    Funcionario funcionario;
    FuncionarioModel funcionarioModel;
    List<Funcionario> listaFuncionario;
    
     public ControllerFuncionarioSMBG() {
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
        
        funcionarioModel.cadastrarFuncionario(funcionario);
        listaTodos();
        funcionario =  new Funcionario();
        
    }
    
    public void removerFuncionario() {
        
        funcionarioModel.removerFuncionario(funcionario);
        listaTodos();
        funcionario =  new Funcionario();
        
    }
    
    public List<Funcionario> listaTodos() {
        funcionarioModel = new FuncionarioModel();
        listaFuncionario = funcionarioModel.buscaTodosOsFuncionarios();
        funcionario =  new Funcionario();
        return listaFuncionario;
        
    }
    
}
