package ModelSMBG;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class NumeroTelefoneSegurado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     
    @Column(name = "Telefone", nullable = false, unique = true)
    private String numeroTelefoneSegurado;
      
    @JoinColumn(name = "Cod_Onibus", referencedColumnName = "Cod_Onibus")
    @OneToMany(cascade = CascadeType.ALL)
    private SeguroOnibus seguroOnibus;
    
    @JoinColumn(name = "Cod_Seguro", referencedColumnName = "Cod_Seguro")
    @OneToMany(cascade = CascadeType.ALL)
    SeguroOnibus seguroOnibus;
    
    public NumeroTelefoneSegurado() {
        
    }
    
     public NumeroTelefoneSegurado(String numeroTelefoneSegurado, SeguroOnibus seguroOnibus) {
        this.numeroTelefoneSegurado = numeroTelefoneSegurado;
        this.seguroOnibus = seguroOnibus;
    }
     
    public void setNumeroTelefoneSegurado(String numeroTelefoneSegurado){
        this.numeroTelefoneSegurado = numeroTelefoneSegurado;
    }
    
    public String getNumeroTelefoneSegurado() {
        return this.numeroTelefoneSegurado;
    }
    
    public void setSeguroOnibus (SeguroOnibus seguroOnibus){
        this.seguroOnibus = seguroOnibus;
    }
    
    public SeguroOnibus getSeguroOnibus() {
        return this.seguroOnibus;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        
        if(!(obj instanceof NumeroTelefoneSegurado))
        return false;
        
        NumeroTelefoneSegurado numeroTelefoneSegurado = (NumeroTelefoneSegurado) obj;
        
        return this.getNumeroTelefoneSegurado().equals(numeroTelefoneSegurado.getNumeroTelefoneSegurado());
    }
}
