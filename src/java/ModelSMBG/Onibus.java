package modelSMBG;

public class Onibus {
	
	private String codigoRenavam;
	private String chassi;
	private String placa;
	private int ano;
	private String modelo;
	private String marca;
	private String tipo;
	private double combustivel;
	private int numeroDePortas;
	private int numeroDeEixos;
	private int capacidade;
	private boolean arCondicionado;
	private boolean direcaoHidraulica;
	private boolean freioABS;
	private boolean cambioAutomatico;
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
}
