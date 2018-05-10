package modelSMBG;

import java.util.List;

public class Rota {

    private String origem;
    private String destino;
    private String horarioSaida;
    private String horarioPrevistoDeChegada;
    private List<Endereco> pontosDeParada;

    public Rota(String origem, String destino, String horarioSaida, String horarioPrevistoDeChegada,
            List<Endereco> pontosDeParada) {
        this.origem = origem;
        this.destino = destino;
        this.horarioSaida = horarioSaida;
        this.horarioPrevistoDeChegada = horarioPrevistoDeChegada;
        this.pontosDeParada = pontosDeParada;
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
}
