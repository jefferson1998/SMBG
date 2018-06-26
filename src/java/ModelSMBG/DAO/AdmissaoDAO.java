package ModelSMBG.DAO;

import ModelSMBG.Entity.Admissao;


public interface AdmissaoDAO extends DAO<Admissao> {
	
	public Admissao buscarPeloCpfDoFuncionario(String cpf);

	public Admissao buscarPelaIdentidadeDoFuncionario(String numeroIdentidade);

	public Admissao buscarPelaCnhDoFuncionario(String cnh);

	
}
