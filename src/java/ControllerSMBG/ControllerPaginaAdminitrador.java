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

    public void irPaginaCadastrarFuncionario() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            context.getExternalContext().redirect("CadastrarFuncionarioSMBG.xhtml");
        } catch (IOException e) {

        }
    }
    
    public void irPaginaCadastrarAdmissaoDoFuncionario() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            context.getExternalContext().redirect("CadastrarAdmissaoDoFuncionarioSMBG.xhtml");
        } catch (IOException e) {
        }
    }
    
    public void irPaginaCadastrarRota() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            context.getExternalContext().redirect("CadastrarRotaSMBG.xhtml");
        } catch (IOException e) {

        }
    }
    
     public void irPaginaCadastrarOnibus() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            context.getExternalContext().redirect("CadastrarOnibusSMBG.xhtml");
        } catch (IOException e) {

        }
    }

    public void irPaginaCadastrarSeguroDoOnibus() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            context.getExternalContext().redirect("CadastrarSeguroSMBG.xhtml");
        } catch (IOException e) {

        }
    }
    
    public void irPaginaAtualizarFuncionario() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            context.getExternalContext().redirect("AtualizarFuncionarioSMBG.xhtml");
        } catch (IOException e) {

        }
    }
    
    public void irPaginaAtualizarAdmissaoDoFuncionario() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            context.getExternalContext().redirect("AtualizarAdmissaoDoFuncionarioSMBG.xhtml");
        } catch (IOException e) {

        }
    }
    
    public void irPaginaAtualizarOnibus() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            context.getExternalContext().redirect("AtualizarOnibusSMBG.xhtml");
        } catch (IOException e) {

        }
    }
    
    public void irPaginaAtualizarRota() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            context.getExternalContext().redirect("AtualizarRotaSMBG.xhtml");
        } catch (IOException e) {

        }
    }
    
    public void irPaginaAtualizarSeguroDoOnibus() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            context.getExternalContext().redirect("AtualizarSeguroSMBG.xhtml");
        } catch (IOException e) {

        }
    }
    
    public void irPaginaAtualizarViagem() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            context.getExternalContext().redirect("AtualizarViagemSMBG.xhtml");
        } catch (IOException e) {

        }
    }
    
    public void irPaginaBuscarFuncionario() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            context.getExternalContext().redirect("BuscaFuncionarioSMBG.xhtml");
        } catch (IOException e) {

        }
    }
    
    public void irPaginaBuscarAdmissaoDoFuncionario() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            context.getExternalContext().redirect("BuscaAdmissaoDoFuncionarioSMBG.xhtml");
        } catch (IOException e) {

        }
    }
    
    public void irPaginaBuscarOnibus() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            context.getExternalContext().redirect("BuscaOnibusSMBG.xhtml");
        } catch (IOException e) {

        }
    }
    
    public void irPaginaBuscaRota() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            context.getExternalContext().redirect("BuscaRotaSMBG.xhtml");
        } catch (IOException e) {

        }
    }
    
    public void irPaginaBuscarSeguroDoOnibus() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            context.getExternalContext().redirect("BuscaSeguroSMBG.xhtml");
        } catch (IOException e) {

        }
    }
    
    public void irPaginaBuscarViagem() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            context.getExternalContext().redirect("BuscaViagemSMBG.xhtml");
        } catch (IOException e) {

        }
    }
    
    public void irPaginaRemoverFuncionario() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            context.getExternalContext().redirect("RemoverFuncionarioSMBG.xhtml");
        } catch (IOException e) {

        }
    }
   
    public void irPaginaRemoverOnibus() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            context.getExternalContext().redirect("RemoverOnibusSMBG.xhtml");
        } catch (IOException e) {

        }
    }
    
    public void irPaginaRemoverRota() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            context.getExternalContext().redirect("RemoverRotaSMBG.xhtml");
        } catch (IOException e) {

        }
    }
    
    public Usuario getSessionUsuario() {
        return sessionUsuario;
    }
    
    
}
