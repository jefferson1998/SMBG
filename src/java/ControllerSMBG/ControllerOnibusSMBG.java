package ControllerSMBG;

import ModelSMBG.Onibus;
import ModelSMBG.OnibusModel;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


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
        onibusModel.cadastrarOnibus(onibus);
        listaTodos();
        onibus = new Onibus();
    }
    
    public List<Onibus> listaTodos(){
        onibusModel = new OnibusModel();
        listaOnibus = onibusModel.listarTodosOsOnibus();
        return listaOnibus;
    }
    
    public void removerOnibus() {
        onibusModel.removerOnibus(onibus);
        listaTodos();
        onibus = new Onibus();
    }
    
    
    
}
