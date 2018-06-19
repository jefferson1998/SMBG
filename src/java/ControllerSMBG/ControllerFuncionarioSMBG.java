/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerSMBG;

import ModelSMBG.Admissao;
import ModelSMBG.AdmissaoModel;
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
    Admissao admissao;
    AdmissaoModel admissaoModel;
    List<Funcionario> listaFuncionario;
    
     public ControllerFuncionarioSMBG() {
        funcionario =  new Funcionario();
        funcionarioModel = new FuncionarioModel();
        admissao = new Admissao();
        admissaoModel = new AdmissaoModel();
        
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Admissao getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Admissao admissao) {
        this.admissao = admissao;
    }
    
    
    public void cadastrarFuncionario() {
        admissaoModel.cadastrarAdmissao(admissao);
        funcionarioModel.cadastrarFuncionario(funcionario);
        listaTodos();
        admissao =  new Admissao();
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
    
    
    public void cadastrarAdmissao() {
        
      
        
    }
    
}
