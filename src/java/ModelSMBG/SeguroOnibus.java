package modelSMBG;

public class SeguroOnibus {

    private int codigoSusepDoCorretor;
    private int codigoCpdDoCorretor;
    private String sucursalCorretor;
    private String inspetoriaDoCorretor;
    private String proposta;
    private String dataEmissao;
    private String apolice;
    private String sucursal;
    private String processoSusep;
    private int codigoSusep;
    private String cnpj;
    private String nomeSeguradora;
    private String telefoneDoSegurado;
    private Endereco enderecoDoSegurado;
    private String nomeCorretor;
    private String cpfOuCnpjDoSegurado;
    private String nomeDoSegurado;
    private String dataInicioDaVigencia;
    private String dataFinalDaVigencia;
    private int numeroEndosso;
    private String ramo;
    private Onibus onibus;

    public SeguroOnibus(int codigoSusepDoCorretor, int codigoCpdDoCorretor, String sucursalCorretor,
            String inspetoriaDoCorretor, String proposta, String dataEmissao, String apolice, String sucursal,
            String processoSusep, int codigoSusep, String cnpj, String nomeSeguradora, String telefoneDoSegurado,
            Endereco enderecoDoSegurado, String nomeCorretor, String cpfOuCnpjDoSegurado, String nomeDoSegurado,
            String dataInicioDaVigencia, String dataFinalDaVigencia, int numeroEndosso, String ramo, Onibus onibus) {
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
        this.cnpj = cnpj;
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

    public int getCodigoSusepDoCorretor() {
        return codigoSusepDoCorretor;
    }

    public void setCodigoSusepDoCorretor(int codigoSusepDoCorretor) {
        this.codigoSusepDoCorretor = codigoSusepDoCorretor;
    }

    public int getCodigoCpdDoCorretor() {
        return codigoCpdDoCorretor;
    }

    public void setCodigoCpdDoCorretor(int codigoCpdDoCorretor) {
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

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
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

    public int getCodigoSusep() {
        return codigoSusep;
    }

    public void setCodigoSusep(int codigoSusep) {
        this.codigoSusep = codigoSusep;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeSeguradora() {
        return nomeSeguradora;
    }

    public void setNomeSeguradora(String nomeSeguradora) {
        this.nomeSeguradora = nomeSeguradora;
    }

    public String getTelefoneDoSegurado() {
        return telefoneDoSegurado;
    }

    public void setTelefoneDoSegurado(String telefoneDoSegurado) {
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

    public String getDataInicioDaVigencia() {
        return dataInicioDaVigencia;
    }

    public void setDataInicioDaVigencia(String dataInicioDaVigencia) {
        this.dataInicioDaVigencia = dataInicioDaVigencia;
    }

    public String getDataFinalDaVigencia() {
        return dataFinalDaVigencia;
    }

    public void setDataFinalDaVigencia(String dataFinalDaVigencia) {
        this.dataFinalDaVigencia = dataFinalDaVigencia;
    }

    public int getNumeroEndosso() {
        return numeroEndosso;
    }

    public void setNumeroEndosso(int numeroEndosso) {
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
        return (this.onibus.equals(seguroOnibus.getOnibus()) && 
                (this.codigoCpdDoCorretor == seguroOnibus.getCodigoCpdDoCorretor() 
                || this.codigoSusep == seguroOnibus.getCodigoSusep() 
                || this.codigoSusepDoCorretor == seguroOnibus.getCodigoSusepDoCorretor()));
    }
}
