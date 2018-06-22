/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelSMBG;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Rodrigo
 */
@Embeddable
public class CPF implements Serializable{
    
    
    @Column(name = "cpf", nullable = false, length = 14, unique = true)
    private String cpf;

    public CPF() {
        
    }

    public CPF(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        
        if (this == o)
            return true;
        
        if (!(o instanceof CPF))
            return false;
        
        CPF comparadorCpf = (CPF) o;
        
        return this.cpf.equals(comparadorCpf.getCpf());
        
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}
