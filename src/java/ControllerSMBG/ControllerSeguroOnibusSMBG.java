package ControllerSMBG;

import ModelSMBG.Onibus;
import ModelSMBG.OnibusModel;
import ModelSMBG.SeguroOnibus;
import ModelSMBG.SeguroOnibusModel;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class ControllerSeguroOnibusSMBG {
    
    SeguroOnibus seguroOnibus;
    Onibus onibus;
    SeguroOnibusModel seguroModel;
    List<SeguroOnibus> listaSeguro;
    
    public ControllerSeguroOnibusSMBG() {
        onibus = new Onibus();
        seguroModel  = new SeguroOnibusModel();
        seguroOnibus = new SeguroOnibus();
    }

    public SeguroOnibus getSeguroOnibus() {
        return seguroOnibus;
    }

    public void setSeguroOnibus(SeguroOnibus seguroOnibus) {
        this.seguroOnibus = seguroOnibus;
    }
    
    public void cadastrarSeguro() {
        seguroModel.cadastrarSeguroOnibus(seguroOnibus);
        listaTodos();
        seguroOnibus = new SeguroOnibus();
    }

    public List<SeguroOnibus> listaTodos(){
        seguroModel = new SeguroOnibusModel();
        listaSeguro = seguroModel.listarTodoOsSegurosDosOnibus();
        return listaSeguro;
    }
    
    public void removerSeguro() {
        seguroModel.removerSeguroOnibus(seguroOnibus);
        listaTodos();
        seguroOnibus = new SeguroOnibus();
    }
}
