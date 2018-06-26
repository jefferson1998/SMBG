package ModelSMBG;

import ModelSMBG.Entity.Admissao;
import ModelSMBG.DAO.AdmissaoDAO;
import ModelSMBG.DAO.AdmissaoHibernate;
import ModelSMBG.DAO.DAO;
import java.util.List;

public class AdmissaoModel {
	private DAO<Admissao> daoAdmissao = new AdmissaoHibernate();
        
	public void cadastrarAdmissao(Admissao admissao) {
		daoAdmissao.inserir(admissao);
	}
	
	public void atualizarAdmissao(Admissao admissao) {
		daoAdmissao.atualizar(admissao);
	}
	
	public void removerAdmissao(Admissao admissao) {
		daoAdmissao.deletar(admissao);
	}
	
	public List<Admissao> buscaTodosAsAdmissoes() {
		return daoAdmissao.listarTodos();
	}
	
	public Admissao buscarAdmissaoPeloCpfDoFuncionario(String cpf) {
		return ((AdmissaoDAO) daoAdmissao).buscarPeloCpfDoFuncionario(cpf);
	}

	public Admissao buscarAdmissaoPelaIdentidadeDoFuncionario(String numeroIdentidade) {
		return ((AdmissaoDAO) daoAdmissao).buscarPelaIdentidadeDoFuncionario(numeroIdentidade);
	}

	public Admissao buscarAdmissaoPelaCnhDoFuncionario(String cnh) {
		return ((AdmissaoDAO) daoAdmissao).buscarPelaCnhDoFuncionario(cnh);
	}
	
	
}
