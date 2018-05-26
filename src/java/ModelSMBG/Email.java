package ModelSMBG;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "email_Funcionario")
public class Email extends Persistivel implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    @Column(name = "email_Funcionario", nullable = false, unique = true)
    private String email;
    
    @JoinColumn(name = "Cod_Funcionario", referencedColumnName = "Cod_Funcionario")
    @OneToMany(cascade = CascadeType.ALL)
    private Funcionario funcionario;
    
    public Email() {
        
    }
    
    public Email(String email, Funcionario funcionario) {
        this.email = email;
        this.funcionario = funcionario;
        this.id = id;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
     public String getFuncionario() {
        return this.funcionario;
    }
    
    public void setId(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        
        if(!(this instanceof Email))
            return false;
        
        Email email = (Email) obj;
        
        return this.getFuncionario().equals(email.getFuncionario());
    }
}
