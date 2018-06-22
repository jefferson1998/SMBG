/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerSMBG;

import ModelSMBG.Rota;
import ModelSMBG.RotaModel;
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
public class ControllerRotaSMBG {
    
    Rota rota;
    RotaModel rotaModel;
    List<Rota> listaRota;
    
     public ControllerRotaSMBG() {
        rota =  new Rota();
        rotaModel = new RotaModel();
        
    }

    public Rota getRota() {
        return rota;
    }

    public void setRota(Rota rota) {
        this.rota = rota;
    }

    
    public void cadastrarRota() {
        
        rotaModel.cadastrarRota(rota);
        listaTodos();
        rota =  new Rota();
        
    }
    
    public void removerRota() {
        
       rotaModel.removerRota(rota);
       listaTodos();
       rota =  new Rota();
        
    }
    
    public void atualizarRota() {
        
       rotaModel.atualizarRota(rota);
       listaTodos();
       rota =  new Rota();
        
    }
    
    public List<Rota> listaTodos() {
        rotaModel = new RotaModel();
        listaRota = rotaModel.listarTodasAsRotas();
         Collections.sort(listaRota);
        return listaRota;
        
    }
    
}
