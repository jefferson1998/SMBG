package modelSMBG;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "Seguro")
public class SeguroOnibus extends Persistivel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "codigoSusepCorretor", nullable = false)
    private String codigoSusepDoCorretor;
    
    @Column(name = "codigoCpdCorretor", nullable = false)
    private String codigoCpdDoCorretor;
    
    @Column(name = "codigoSusepCorretor", nullable = false)
    private String sucursalCorretor;
    
    @Column(name = "inspetoriaCorretor", nullable = false)
    private String inspetoriaDoCorretor;
    
    @Column(name = "proposta", nullable = false)
    private String proposta;
    
    @Column(name = "dataEmissao", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEmissao;
    
    @Column(name = "apolice", nullable = false)
    private String apolice;
    
    @Column(name = "apolice", nullable = false)
    private String sucursal;
    
    @Column(name = "processoSusep", nullable = false)
    private String processoSusep;
    
    @Column(name = "codigoSusep", nullable = false)
    private String codigoSusep;
    
    @Column(name = "cnpjSeguradora", nullable = false)
    private String cnpjSeguradora;
    
    @Column(name = "nomeSeguradora", nullable = false)
    private String nomeSeguradora;
    
    @OneToMany
    private List<NumeroTelefoneSegurado> telefoneDoSegurado;
    
    @Embedded
    private Endereco enderecoDoSegurado;
    
    @Column(name = "nomeCorretor", nullable = false)
    private String nomeCorretor;
    
    @Column(name = "cpfOuCnpjSegurado", nullable = false)
    private String cpfOuCnpjDoSegurado;
    
    @Column(name = "nomeSegurado", nullable = false)
    private String nomeDoSegurado;
    
    @Column(name = "inicioVigencia", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInicioDaVigencia;
    
    @Column(name = "fimVigencia", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataFinalDaVigencia;
    
    @Column(name = "numeroEndosso", nullable = false)
    private String numeroEndosso;
    
    @Column(name = "ramo", nullable = false)
    private String ramo;
    
    @JoinColumn(name = "Cod_onibus", referencedColumnName = "Cod_onibus")
    private Onibus onibus;

    public SeguroOnibus(String codigoSusepDoCorretor, String codigoCpdDoCorretor, String sucursalCorretor,
            String inspetoriaDoCorretor, String proposta, Date dataEmissao, String apolice, String sucursal,
            String processoSusep, String codigoSusep, String cnpjSeguradora, String nomeSeguradora, String telefoneDoSegurado,
            Endereco enderecoDoSegurado, String nomeCorretor, String cpfOuCnpjDoSegurado, String nomeDoSegurado,
            Date dataInicioDaVigencia, Date dataFinalDaVigencia, String numeroEndosso, String ramo, Onibus onibus) {
        this.codigoSusepDoCorretor = codigoSusepDoCorretor;
        this.codigoCpdDoCorretor = codigoCpdDoCorretor;
        this.sucursalCorretor = sucursalCorretor;
        this.inspetoriaDoCorretor = inspetoriaDoCorretor;
        this.proposta = proposta;
        this.dataEmissao = dataEmissao;
        this.apolice = apolice;
        this.sucursal = sucursal;
        this.processoSusep = processoSusep;
        this.codigoSusep = codigoSusep;
        this.cnpjSeguradora = cnpjSeguradora;
        this.nomeSeguradora = nomeSeguradora;
        this.telefoneDoSegurado = telefoneDoSegurado;
        this.enderecoDoSegurado = enderecoDoSegurado;
        this.nomeCorretor = nomeCorretor;
        this.cpfOuCnpjDoSegurado = cpfOuCnpjDoSegurado;
        this.nomeDoSegurado = nomeDoSegurado;
        this.dataInicioDaVigencia = dataInicioDaVigencia;
        this.dataFinalDaVigencia = dataFinalDaVigencia;
        this.numeroEndosso = numeroEndosso;
        this.ramo = ramo;
        this.onibus = onibus;
    }
    
    public SeguroOnibus() {
        
    }
    
    public String getCodigoSusepDoCorretor() {
        return codigoSusepDoCorretor;
    }

    public void setCodigoSusepDoCorretor(String codigoSusepDoCorretor) {
        this.codigoSusepDoCorretor = codigoSusepDoCorretor;
    }

    public String getCodigoCpdDoCorretor() {
        return codigoCpdDoCorretor;
    }

    public void setCodigoCpdDoCorretor(String codigoCpdDoCorretor) {
        this.codigoCpdDoCorretor = codigoCpdDoCorretor;
    }

    public String getSucursalCorretor() {
        return sucursalCorretor;
    }
 
    public void setSucursalCorretor(String sucursalCorretor) {
        this.sucursalCorretor = sucursalCorretor;
    }

    public String getInspetoriaDoCorretor() {
        return inspetoriaDoCorretor;
    }

    public void setInspetoriaDoCorretor(String inspetoriaDoCorretor) {
        this.inspetoriaDoCorretor = inspetoriaDoCorretor;
    }

    public String getProposta() {
        return proposta;
    }

    public void setProposta(String proposta) {
        this.proposta = proposta;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getApolice() {
        return apolice;
    }

    public void setApolice(String apolice) {
        this.apolice = apolice;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getProcessoSusep() {
        return processoSusep;
    }

    public void setProcessoSusep(String processoSusep) {
        this.processoSusep = processoSusep;
    }

    public String getCodigoSusep() {
        return codigoSusep;
    }

    public void setCodigoSusep(String codigoSusep) {
        this.codigoSusep = codigoSusep;
    }

    public String getCnpj() {
        return cnpjSeguradora;
    }

    public void setCnpj(String cnpj) {
        this.cnpjSeguradora = cnpj;
    }

    public String getNomeSeguradora() {
        return nomeSeguradora;
    }

    public void setNomeSeguradora(String nomeSeguradora) {
        this.nomeSeguradora = nomeSeguradora;
    }

    public List<NumeroTelefoneSegurado> getTelefoneDoSegurado() {
        return telefoneDoSegurado;
    }

    public void setTelefoneDoSegurado(List<NumeroTelefoneSegurado> telefoneDoSegurado) {
        this.telefoneDoSegurado = telefoneDoSegurado;
    }

    public Endereco getEnderecoDoSegurado() {
        return enderecoDoSegurado;
    }

    public void setEnderecoDoSegurado(Endereco enderecoDoSegurado) {
        this.enderecoDoSegurado = enderecoDoSegurado;
    }

    public String getNomeCorretor() {
        return nomeCorretor;
    }

    public void setNomeCorretor(String nomeCorretor) {
        this.nomeCorretor = nomeCorretor;
    }

    public String getCpfOuCnpjDoSegurado() {
        return cpfOuCnpjDoSegurado;
    }

    public void setCpfOuCnpjDoSegurado(String cpfOuCnpjDoSegurado) {
        this.cpfOuCnpjDoSegurado = cpfOuCnpjDoSegurado;
    }

    public String getNomeDoSegurado() {
        return nomeDoSegurado;
    }

    public void setNomeDoSegurado(String nomeDoSegurado) {
        this.nomeDoSegurado = nomeDoSegurado;
    }

    public Date getDataInicioDaVigencia() {
        return dataInicioDaVigencia;
    }

    public void setDataInicioDaVigencia(Date dataInicioDaVigencia) {
        this.dataInicioDaVigencia = dataInicioDaVigencia;
    }

    public Date getDataFinalDaVigencia() {
        return dataFinalDaVigencia;
    }

    public void setDataFinalDaVigencia(Date dataFinalDaVigencia) {
        this.dataFinalDaVigencia = dataFinalDaVigencia;
    }

    public String getNumeroEndosso() {
        return numeroEndosso;
    }

    public void setNumeroEndosso(String numeroEndosso) {
        this.numeroEndosso = numeroEndosso;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public Onibus getOnibus() {
        return onibus;
    }

    public void setOnibus(Onibus onibus) {
        this.onibus = onibus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SeguroOnibus)) {
            return false;
        }
        SeguroOnibus seguroOnibus = (SeguroOnibus) o;
        return this.onibus.equals(seguroOnibus.getOnibus()) && 
                (this.codigoSusep.equals(seguroOnibus.getCodigoSusep())
                || this.codigoCpdDoCorretor.equals(seguroOnibus.getCodigoCpdDoCorretor())
                || this.codigoSusepDoCorretor.equals(seguroOnibus.getCodigoSusepDoCorretor()));
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(codigoSusepDoCorretor, codigoCpdDoCorretor, sucursalCorretor, inspetoriaDoCorretor,
                proposta, dataEmissao, apolice, sucursal, processoSusep, codigoSusep, cnpjSeguradora, nomeSeguradora,
                enderecoDoSegurado, nomeCorretor, cpfOuCnpjDoSegurado, nomeDoSegurado, dataInicioDaVigencia, dataFinalDaVigencia,
                numeroEndosso, ramo, onibus);
    }
    
}
