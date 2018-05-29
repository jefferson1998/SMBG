package ControllerSMBG;

import ModelSMBG.Usuario;
import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class ControllerPaginaAdminitrador {
    
    public Usuario sessionUsuario;
    
    public void checkUsuarioSession() throws IOException{
        if(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioID") != null){
            int sessionUsuarioID = Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioID").toString());
            if(sessionUsuario == null)
                FacesContext.getCurrentInstance().getExternalContext().redirect("/SMBG/");
        }else{
            FacesContext.getCurrentInstance().getExternalContext().redirect("/SMBG/");
        }
    }
    
    public void retornarPaginaAdministrador() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            context.getExternalContext().redirect("PaginaAdministradorSMBG.xhtml");
        } catch (IOException e) {

        }
    }
    
    public void irAdmissao() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            context.getExternalContext().redirect("CadastrarAdmissaoDoFuncionarioSMBG.xhtml");
        } catch (IOException e) {

        }
    }

    public Usuario getSessionUsuario() {
        return sessionUsuario;
    }
    
    
}
