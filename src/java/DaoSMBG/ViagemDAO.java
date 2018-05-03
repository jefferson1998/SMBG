package DaoSMBG;

import modelSMBG.Viagem;

public interface ViagemDAO extends DAO<Viagem> {
	
	public Viagem buscarPelaData(String data);
	
	public Viagem buscarPeloCpfDoFuncionario (String cpf);
	
}
