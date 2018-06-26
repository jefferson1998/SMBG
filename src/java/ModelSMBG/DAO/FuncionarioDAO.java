package ModelSMBG.DAO;

import ModelSMBG.Entity.Funcionario;


public interface FuncionarioDAO extends DAO<Funcionario> {

	public Funcionario buscarPeloCpf(String cpf);

	public Funcionario buscarPelaIdentidade(String numeroIdentidade);

	public Funcionario buscarPelaCnh(String cnh);

}
