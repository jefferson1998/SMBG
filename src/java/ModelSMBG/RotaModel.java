package ModelSMBG;

import ModelSMBG.DAO.RotaHibernate;
import ModelSMBG.DAO.RotaDAO;
import ModelSMBG.Entity.Rota;
import ModelSMBG.DAO.DAO;
import java.util.List;

public class RotaModel {
	
	private DAO<Rota> rotaDAO = new RotaHibernate();
	
	public void cadastrarRota (Rota rota) {
		rotaDAO.inserir(rota);
	}
	
	public void atualizarRota (Rota rota) {
		rotaDAO.atualizar(rota);
	}
	
	public void removerRota(Rota rota) {
		rotaDAO.deletar(rota);
	}

	
	public List<Rota> listarTodasAsRotas() {
		return rotaDAO.listarTodos();
	}

	
	public List<Rota> buscarPelaOrigem(String origem) {
		return ((RotaDAO) rotaDAO).buscarPelaOrigem(origem);
	}

	
	public List<Rota> buscarPeloDestino(String destino) {
		return ((RotaDAO) rotaDAO).buscarPeloDestino(destino);
	}

	
	public List<Rota> buscarPeloHorarioDeSaida(String horarioDeSaida) {
		return ((RotaDAO) rotaDAO).buscarPeloHorarioDeSaida(horarioDeSaida);
	}

}
