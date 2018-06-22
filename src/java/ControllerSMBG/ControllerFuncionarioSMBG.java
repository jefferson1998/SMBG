/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerSMBG;

import ModelSMBG.AdmissaoModel;
import ModelSMBG.Funcionario;
import ModelSMBG.FuncionarioModel;
import java.util.Collections;
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
    
    private Funcionario funcionario;
    private FuncionarioModel funcionarioModel;
    private AdmissaoModel admissaoModel;
    private List<Funcionario> listaFuncionario;
    
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
        Collections.sort(listaFuncionario);
        funcionario =  new Funcionario();
        return listaFuncionario;
        
    }
    
    
    public int totalDeMotoristas() {
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
