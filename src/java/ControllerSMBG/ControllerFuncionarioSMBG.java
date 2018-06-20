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
    AdmissaoModel admissaoModel;
    Admissao admissao;
    List<Funcionario> listaFuncionario;
    
     public ControllerFuncionarioSMBG() {
        funcionario =  new Funcionario();
        funcionarioModel = new FuncionarioModel();
        admissao = funcionario.getAdmissao();
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void cadastrarFuncionario() {
        
        funcionarioModel.cadastrarFuncionario(funcionario);
        admissaoModel.cadastrarAdmissao(funcionario.getAdmissao());
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
