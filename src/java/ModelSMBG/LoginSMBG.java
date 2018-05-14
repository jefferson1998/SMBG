package ModelSMBG;

import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class LoginSMBG {

    private String usuario;
    private String senha;

    public LoginSMBG(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LoginSMBG() {
    }

    public void logar() {
        FacesContext context = FacesContext.getCurrentInstance();

        if (this.usuario.equals("admin") && this.senha.equals("admin")) {

            context.getExternalContext().getSessionMap().put("user", usuario);
            context.getExternalContext().getSessionMap().put("perfil", "usuario");
            try {
                context.getExternalContext().redirect("PaginaAdministradorSMBG.xhtml");

            } catch (IOException e) {
                
            }
        } else {
            context.addMessage(null, new FacesMessage("A autenticação falhou!!!"));
        }
       
    }

    public void deslogar() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().invalidateSession();
        
        try {
            context.getExternalContext().redirect("PaginaLoginSMBG.xhtml");
        } catch (IOException e) {
            
        }
    }
}
