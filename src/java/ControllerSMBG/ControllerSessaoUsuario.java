/*
 * Copyright 2018 Rodrigo.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ControllerSMBG;

import ModelSMBG.Usuario;
import java.io.IOException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Rodrigo
 */
@ManagedBean
@SessionScoped
public class ControllerSessaoUsuario {
    
    private Usuario usuario;
    private String login;
    private String senha;
    
    public ControllerSessaoUsuario(){
    }
    
    public void logar(){
        usuario = new Usuario(login, senha);
        FacesContext context = FacesContext.getCurrentInstance();
        
        if(this.usuario.getLogin().equals("admin") && this.usuario.getSenha().equals("admin")) {
            context.getExternalContext().getSessionMap().put("user", usuario.getLogin());
            context.getExternalContext().getSessionMap().put("perfil", "administrador");
            
            try {
                context.getExternalContext().redirect("CadastrarFuncionarioSMBG.xhtml");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            //fazer um if pra ver, já que não é adm, se é usuario comum
            context.addMessage("", new FacesMessage("A autenticação falhou!!!"));
        }
    }
    
    public void deslogar() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().invalidateSession();
        
        try {
            context.getExternalContext().redirect("PaginaLoginSMBG.xhtml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
