package ModelSMBG.DAO;

import ModelSMBG.Entity.Rota;
import ModelSMBG.DAO.DAO;
import java.util.List;

public interface RotaDAO extends DAO<Rota> {
	
	public List<Rota> buscarPelaOrigem(String origem);
	
	public List<Rota> buscarPeloDestino(String destino);
	
	public List<Rota> buscarPeloHorarioDeSaida(String horarioDeSaida);
	

}
