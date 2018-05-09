package ModelSMBG;

import java.util.List;

public interface RotaDAO extends DAO<Rota> {
	
	public List<Rota> buscarPelaOrigem(String origem);
	
	public List<Rota> buscarPeloDestino(String destino);
	
	public List<Rota> buscarPeloHorarioDeSaida(String horarioDeSaida);
	
	public Rota buscarPelaRota(String origem, String destino, String horarioDeSaida);

}
