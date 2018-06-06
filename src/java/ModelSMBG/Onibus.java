package modelSMBG;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Table(name = "Onibus")
public class Onibus extends Persistivel implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "codigoRenavam", length = 11, nullable = false)
    private String codigoRenavam;
    
    @Column(name = "chassis", length = 20, nullable = false)
    private String chassi;
    
    @Column(name = "placa", length = 7, nullable = false)
    private String placa;
    
    @Column(name = "ano", nullable = false)
    private int ano;
    
    @Column(name = "modelo", length = 25, nullable = false)
    private String modelo;
    
    @Column(name = "marca", length = 25, nullable = false)
    private String marca;
    
    @Column(name = "tipo", length = 25, nullable = false)
    private String tipo;

    @Column(name = "combustivel", nullable = false)
    private double combustivel;
    
    @Column(name = "numeroPortas", nullable = false)
    private int numeroDePortas;
    
    @Column(name = "numeroEixos", nullable = false)
    private int numeroDeEixos;
    
    @Column(name = "capacidade", nullable = false)
    private int capacidade;
    
    @Column(name = "arCondicionado", nullable = true)
    private boolean arCondicionado;
    
    @Column(name = "direcaoHidra", nullable = true)
    private boolean direcaoHidraulica;
    
    @Column(name = "freioAbs", nullable = true)
    private boolean freioABS;
    
    @Column(name = "cambioAuto", nullable = true)
    private boolean cambioAutomatico;
    
    @Column(name = "direcaoEletrica", nullable = true)
    private boolean direcaoEletrica;

    public Onibus(String codigoRenavam, String chassi, String placa, int ano, String modelo, String marca, String tipo,
            double combustivel, int numeroDePortas, int numeroDeEixos, int capacidade, boolean arCondicionado,
            boolean direcaoHidraulica, boolean freioABS, boolean cambioAutomatico, boolean direcaoEletrica) {
        this.codigoRenavam = codigoRenavam;
        this.chassi = chassi;
        this.placa = placa;
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.combustivel = combustivel;
        this.numeroDePortas = numeroDePortas;
        this.numeroDeEixos = numeroDeEixos;
        this.capacidade = capacidade;
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
        this.freioABS = freioABS;
        this.cambioAutomatico = cambioAutomatico;
        this.direcaoEletrica = direcaoEletrica;
    }
    
    public Onibus() {
        
    }

    public String getCodigoRenavam() {
        return codigoRenavam;
    }

    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
 
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDeEixos() {
        return numeroDeEixos;
    }

    public void setNumeroDeEixos(int numeroDeEixos) {
        this.numeroDeEixos = numeroDeEixos;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean isDirecaoHidraulica() {
        return direcaoHidraulica;
    }

    public void setDirecaoHidraulica(boolean direcaoHidraulica) {
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public boolean isFreioABS() {
        return freioABS;
    }

    public void setFreioABS(boolean freioABS) {
        this.freioABS = freioABS;
    }

    public boolean isCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public boolean isDirecaoEletrica() {
        return direcaoEletrica;
    }

    public void setDirecaoEletrica(boolean direcaoEletrica) {
        this.direcaoEletrica = direcaoEletrica;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(!(o instanceof Onibus))
            return false;
        
        Onibus onibus = (Onibus) o;
        return this.chassi.equals(onibus.getChassi()) || this.placa.equals(onibus.getPlaca()) || this.codigoRenavam.equals(onibus.getCodigoRenavam());
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoRenavam, chassi, ano, placa, ano, modelo, marca, tipo, combustivel, 
                numeroDePortas, numeroDeEixos, capacidade);
    }
}
