package ControllerSMBG;

import ModelSMBG.DAO.GeradorDeEntityManager;
import ModelSMBG.Entity.Onibus;
import ModelSMBG.Entity.SeguroOnibus;
import ModelSMBG.SeguroOnibusModel;
import java.util.Collections;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;


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
    
    public String cadastrarSeguro() {
        seguroModel.cadastrarSeguroOnibus(seguroOnibus);
        listaTodos();
        seguroOnibus = new SeguroOnibus();
        return "";
    }

    public List<SeguroOnibus> listaTodos(){
        seguroModel = new SeguroOnibusModel();
        listaSeguro = seguroModel.listarTodoOsSegurosDosOnibus();
        Collections.sort(listaSeguro);
        return listaSeguro;
    }
    
    public void removerSeguro() {
        seguroModel.removerSeguroOnibus(seguroOnibus);
        listaTodos();
        seguroOnibus = new SeguroOnibus();
    }
    
    public void alterarSeguro() {
        seguroModel.atualizarSeguroOnibus(seguroOnibus);
        listaTodos();
        seguroOnibus = new SeguroOnibus();
    }
}
