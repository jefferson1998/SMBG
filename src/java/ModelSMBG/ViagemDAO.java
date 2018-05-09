package ModelSMBG;


public interface ViagemDAO extends DAO<Viagem> {
	
	public Viagem buscarPelaData(String data);
	
	public Viagem buscarPeloCpfDoFuncionario (String cpf);
        
        public Viagem buscarPeloDiaDaSemana(String diaDaSemana);
        
        public Viagem buscarPeloRenavaDoOnibus(String codigoRenavam);
        
        public Viagem buscarPelaPlacaDoOnibus(String placa);
        
        public Viagem buscarPeloChassisDoOnibus(String chassi);
        
        public Viagem buscarPelaRota(Rota rota);
	
}
