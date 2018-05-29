package ControllerSMBG;

import ModelSMBG.Usuario;
import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class ControllerSessao {
    
//    public Usuario sessionUsuario;
//    
//    public void checkUsuarioSession() throws IOException{
//        if(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioID") != null){
//            int sessionUsuarioID = Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioID").toString());
//            sessionUsuario = LoginSMBG.getUsuarioPeloID(sessionUsuarioID);
//            if(sessionUsuario == null)
//                FacesContext.getCurrentInstance().getExternalContext().redirect("/SMBG/");
//        }else{
//            FacesContext.getCurrentInstance().getExternalContext().redirect("/SMBG/");
//        }
//    }
//    
//    public void deslogar() throws IOException{
//        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuarioID", -1);
//    }
//
//    public Usuario getSessionUsuario() {
//        return sessionUsuario;
//    }
    
    
    
}
