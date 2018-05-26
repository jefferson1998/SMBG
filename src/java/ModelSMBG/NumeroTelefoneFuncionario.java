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
@Table(name = "Telefone_Funcionario")
public class NumeroTelefoneFuncionario extends Persistivel implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "Telefone", nullable = false, unique = true)
    private String numeroTelefone;
    
    @JoinColumn(name = "Cod_Funcionario", referencedColumnName = "Cod_Funcionario")
    @OneToMany(cascade = CascadeType.ALL)
    private Funcionario funcionario;
    
    public NumeroTelefoneFuncionario() {
        
    }
    
     public NumeroTelefoneFuncionario(String numeroTelefone, Funcionario funcionario) {
        this.numeroTelefone = numeroTelefone;
        this.funcionario = funcionario;
    }
     
    public void setNumeroTelefone(String numeroTelefone){
        this.numeroTelefone = numeroTelefone;
    }
    
    public String getNumeroTelefone() {
        return this.numeroTelefone;
    }
    
    public void setFuncionario(Funcionario funcionario){
        this.funcionario = funcionario;
    }
    
    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        
        if(!(obj instanceof NumeroTelefoneFuncionario))
        return false;
        
        NumeroTelefoneFuncionario numeroTelefone = (NumeroTelefoneFuncionario) obj;
        
        return this.getNumeroTelefone().equals(numeroTelefone.getNumeroTelefone());
    }
    
}
