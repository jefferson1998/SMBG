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

/**
 *
 * @author Jessin
 */
@ManagedBean
@SessionScoped
public class ControllerFuncionarioSMBG {

    private Funcionario funcionario;
    private FuncionarioModel funcionarioModel;
    private List<Funcionario> listaFuncionario;

    public ControllerFuncionarioSMBG() {
        funcionario = new Funcionario();
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
            listaTodos();
            funcionario = new Funcionario();
            context.addMessage(null, new FacesMessage("Cadastro Efetuado!"));
        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage(ex.getMessage()));
        }

    }

    public void removerFuncionario() {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            funcionarioModel.removerFuncionario(funcionario);
            listaTodos();
            funcionario = new Funcionario();
            context.addMessage(null, new FacesMessage("Remoção Efetuada!"));
        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage(ex.getMessage()));
        }

    }

    public List<Funcionario> listaTodos() {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            listaFuncionario = funcionarioModel.buscaTodosOsFuncionarios();
            Collections.sort(listaFuncionario);
            funcionario = new Funcionario();
            return listaFuncionario;
        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage(ex.getMessage()));
            return null;
        }

    }

    public int totalDeMotoristas() {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            listaFuncionario = funcionarioModel.buscaTodosOsFuncionarios();

            int contador = 0;
            IteratorFuncionario iteratorFuncionario = new IteratorFuncionario(listaFuncionario);
            while (iteratorFuncionario.hasNext()) {
                if (iteratorFuncionario.next().getAdmissao().getFuncao().equals("Motorista")) {
                    contador++;
                }
            }
            return contador;
        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage(ex.getMessage()));
        }
        return 0;
    }

    public int totalDeCobradores() {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            listaFuncionario = funcionarioModel.buscaTodosOsFuncionarios();

            int contador = 0;
            IteratorFuncionario iteratorFuncionario = new IteratorFuncionario(listaFuncionario);
            while (iteratorFuncionario.hasNext()) {
                if (iteratorFuncionario.next().getAdmissao().getFuncao().equals("Cobrador")) {
                    contador++;
                }
            }
            return contador;
        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage(ex.getMessage()));
        }
        return 0;
    }
}
