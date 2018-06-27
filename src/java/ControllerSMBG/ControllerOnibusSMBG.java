package ControllerSMBG;

import ModelSMBG.Entity.Onibus;
import ModelSMBG.OnibusModel;
import java.util.Collections;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class ControllerOnibusSMBG {

    OnibusModel onibusModel;
    Onibus onibus;
    List<Onibus> listaOnibus;

    public ControllerOnibusSMBG() {
        onibusModel = new OnibusModel();
        onibus = new Onibus();
    }

    public Onibus getOnibus() {
        return onibus;
    }

    public void setOnibus(Onibus onibus) {
        this.onibus = onibus;
    }

    public void cadastrarOnibus() {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            onibusModel.cadastrarOnibus(onibus);
            listaTodos();
            onibus = new Onibus();
        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage(ex.getMessage()));
        }
    }

    public void alterarOnibus() {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            onibusModel.atualizarOnibus(onibus);
            listaTodos();
            onibus = new Onibus();
        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage(ex.getMessage()));
        }
    }

    public void removerOnibus() {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            onibusModel.removerOnibus(onibus);
            listaTodos();
            onibus = new Onibus();
        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage(ex.getMessage()));
        }
    }

    public List<Onibus> listaTodos() {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            onibusModel = new OnibusModel();
            listaOnibus = onibusModel.listarTodosOsOnibus();
            Collections.sort(listaOnibus);
            return listaOnibus;
        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage(ex.getMessage()));
        }
        return null;
    }

}
