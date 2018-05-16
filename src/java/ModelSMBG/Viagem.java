package modelSMBG;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "Viagem")
public class Viagem /*extends Persistivel*/ implements Serializable {
    @Column(name = "Cod_onibus", nullable = false, table = "Onibus")
    private Onibus onibus;
    
    @Column(name = "Cod_Rota", nullable = false, table = "Rota")
    private Rota rota;
    
    private List<Funcionario> listaDeFuncionarios;
    
    @Column(name = "dataViagem")
    private Date data;
    
    @Column(name="diaDaSemana", length = 12)
    private String diaDaSemana;

    public Viagem(Onibus onibus, Rota rota, List<Funcionario> listaDeFuncionarios, Date data, String diaDaSemana) {
        this.onibus = onibus;
        this.rota = rota;
        this.listaDeFuncionarios = listaDeFuncionarios;
        this.data = data;
        this.diaDaSemana = diaDaSemana;
    }

    public Viagem() {
        
    }
    
    public Onibus getOnibus() {
        return onibus;
    }

    public void setOnibus(Onibus onibus) {
        this.onibus = onibus;
    }

    public Rota getRota() {
        return rota;
    }

    public void setRota(Rota rota) {
        this.rota = rota;
    }

    public List<Funcionario> getListaDeFuncionarios() {
        return listaDeFuncionarios;
    }

    public void setListaDeFuncionarios(List<Funcionario> listaDeFuncionarios) {
        this.listaDeFuncionarios = listaDeFuncionarios;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        
        if(!(obj instanceof Viagem))
            return false;
        
        Viagem viagem = (Viagem) obj;
        
        for(int i = 0; i < this.listaDeFuncionarios.size(); i++) {
            if(this.listaDeFuncionarios.get(i).getCPF().equals(viagem.getListaDeFuncionarios().get(i).getCPF())){
                return true;
            }
        }
        
        return this.data.equals(viagem.data)
                && this.onibus.getPlaca().equals(viagem.onibus.getPlaca())
                && this.rota.equals(viagem.rota);
    }
    
}
