package ModelSMBG;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Persistivel implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    protected Integer id;
     
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        
        if(!(obj instanceof Persistivel))
            return false;
        
        Persistivel persistivel = (Persistivel) obj;
        return this.id == persistivel.id;
    }
}
