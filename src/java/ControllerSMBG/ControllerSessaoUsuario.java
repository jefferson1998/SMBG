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

import ModelSMBG.Entity.Funcionario;
import ModelSMBG.FuncionarioModel;
import ModelSMBG.Entity.Usuario;
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
    private FuncionarioModel fm = new FuncionarioModel();

    public ControllerSessaoUsuario() {
        usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario user) {
        this.usuario = user;
    }

    public String logar() {
        String ret = "";
        FacesContext context = FacesContext.getCurrentInstance();
        
        Funcionario funcionario = fm.buscarFuncionarioPeloCpf(this.usuario.getLogin());
        
        if (this.usuario.getLogin().equals("admin") && this.usuario.getSenha().equals("admin")) {

            context.getExternalContext().getSessionMap().put("adm", this.usuario.getLogin());
            ret = "/PaginaAdmin.xhtml";
            //context.getExternalContext().getSessionMap().put("perfil", "adm");
            //context.getExternalContext().getSessionMap().put("erroLogin", "nao");

            //context.getExternalContext().redirect("PaginaAdmin.xhtml");
        } else if (funcionario != null && funcionario.getSenha().equals(this.usuario.getSenha())) {
            context.getExternalContext().getSessionMap().put("user", this.usuario.getLogin());
            ret = "/PrestacaoDeContaSMBG.xhtml";
        } else {
            context.addMessage(null, new FacesMessage("A autenticação falhou!!!"));
        }
        return ret;
    }

    public void deslogar() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().invalidateSession();

        try {
            context.getExternalContext().redirect("PaginaLoginSMBG.xhtml");
        } catch (IOException e) {

        }
    }

    public boolean checarErro() {
        boolean temErro = false;

        FacesContext context = FacesContext.getCurrentInstance();

        if (context.getExternalContext().getSessionMap().get("erroLogin") != null) {
            if (context.getExternalContext().getSessionMap().get("erroLogin").toString().equals("sim")) {
                temErro = true;
                context.getExternalContext().getSessionMap().put("erroLogin", "nao");
            }
        }
        return temErro;
    }

}
