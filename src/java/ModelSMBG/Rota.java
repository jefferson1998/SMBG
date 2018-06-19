package ModelSMBG;

import java.io.Serializable;
import java.util.List;
import javax.persistence.AttributeOverride;
import javax.persistence.CollectionTable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Table(name = "Rotas")
@AttributeOverride(name = "id", column = @Column(name = "Cod_Rota"))
public class Rota extends Persistivel implements Serializable {
     
    @Column(name = "Origem", length = 30, nullable = false)
    private String origem;
    
    @Column(name = "Destino", length = 30, nullable = false)
    private String destino;
    
    @Column(name = "horarioSaida", length = 5, nullable = false)
    private String horarioSaida;
    
    @Column(name = "horarioPrevisto", length = 5, nullable = false)
    private String horarioPrevistoDeChegada;
    
    @ManyToOne
    @JoinColumn(name = "Cod_onibus", referencedColumnName = "Cod_Onibus")
    private Onibus OnibusQueFazemEstaRota;
    
    //Falta mapear esses pontos de paradas
//    @ElementCollection
//    @CollectionTable(name="Pontos_de_parada", joinColumns = @JoinColumn(name="Cod_Rota"))
//    private List<Endereco> pontosDeParada;

//    public Rota(String origem, String destino, String horarioSaida, String horarioPrevistoDeChegada,
//            List<Endereco> pontosDeParada) {
//        this.origem = origem;
//        this.destino = destino;
//        this.horarioSaida = horarioSaida;
//        this.horarioPrevistoDeChegada = horarioPrevistoDeChegada;
//        this.pontosDeParada = pontosDeParada;
//    }

    public Rota() {
        
    }
    
    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(String horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public String getHorarioPrevistoDeChegada() {
        return horarioPrevistoDeChegada;
    }

    public void setHorarioPrevistoDeChegada(String horarioPrevistoDeChegada) {
        this.horarioPrevistoDeChegada = horarioPrevistoDeChegada;
    }

//    public List<Endereco> getPontosDeParada() {
//        return pontosDeParada;
//    }
//
//    public void setPontosDeParada(List<Endereco> pontosDeParada) {
//        this.pontosDeParada = pontosDeParada;
//    }

    public Onibus getOnibusQueFazemEstaRota() {
        return OnibusQueFazemEstaRota;
    }

    public void setOnibusQueFazemEstaRota(Onibus OnibusQueFazemEstaRota) {
        this.OnibusQueFazemEstaRota = OnibusQueFazemEstaRota;
    }

    
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        
        if(!(obj instanceof Rota))
            return false;
        
        Rota rota = (Rota) obj;
        
        return this.origem.equals(rota.origem) && this.destino.equals(rota.destino) && this.horarioSaida.equals(rota.horarioSaida);
        
    }

}
