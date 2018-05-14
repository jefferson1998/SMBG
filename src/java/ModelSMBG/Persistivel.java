//package ModelSMBG;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public abstract class Persistivel {
//    
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    protected long id;
//     
//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj)
//            return true;
//        
//        if(!(obj instanceof Persistivel))
//            return false;
//        
//        Persistivel persistivel = (Persistivel) obj;
//        return this.id == persistivel.id;
//    }
//}
