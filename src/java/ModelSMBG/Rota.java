package modelSMBG;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "Rotas")
public class Rota /*extends Persistivel*/ implements Serializable {

    @Column(name = "Origem", length = 30, nullable = false)
    private String origem;
    
    @Column(name = "Destino", length = 30, nullable = false)
    private String destino;
    
    @Column(name = "horarioSaida", length = 5, nullable = false)
    private String horarioSaida;
    
    @Column(name = "horarioPrevisto", length = 5, nullable = false)
    private String horarioPrevistoDeChegada;
    
    @Column(name = "Cod_onibus", nullable = false, table = "Onibus")
    private Onibus OnibusQueFazEstaRota;
    
    
    private List<Endereco> pontosDeParada;

    public Rota(String origem, String destino, String horarioSaida, String horarioPrevistoDeChegada,
            List<Endereco> pontosDeParada) {
        this.origem = origem;
        this.destino = destino;
        this.horarioSaida = horarioSaida;
        this.horarioPrevistoDeChegada = horarioPrevistoDeChegada;
        this.pontosDeParada = pontosDeParada;
    }

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

    public List<Endereco> getPontosDeParada() {
        return pontosDeParada;
    }

    public void setPontosDeParada(List<Endereco> pontosDeParada) {
        this.pontosDeParada = pontosDeParada;
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
