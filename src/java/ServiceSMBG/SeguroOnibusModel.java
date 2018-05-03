package ServiceSMBG;

import DaoSMBG.SeguroDAO;
import java.util.List;
import DaoSMBG.DAO;
import modelSMBG.SeguroOnibus;
import DaoHibernate.SeguroOnibusHibernate;

public class SeguroOnibusModel {
	
	private DAO<SeguroOnibus> daoSeguroOnibus = new SeguroOnibusHibernate();
	
	public void cadastrarSeguroOnibus (SeguroOnibus seguroOnibus) {
		daoSeguroOnibus.inserir(seguroOnibus);
		
	}

	
	public void atualizarSeguroOnibus (SeguroOnibus seguroOnibus) {
		daoSeguroOnibus.atualizar(seguroOnibus);
	}

	public void removerSeguroOnibus(SeguroOnibus seguroOnibus) {
		daoSeguroOnibus.deletar(seguroOnibus);
	}

	public List<SeguroOnibus> listarTodoOsSegurosDosOnibus() {
		return daoSeguroOnibus.listarTodos();
	}


	public SeguroOnibus buscarPeloCodigoSusepDoCorretor(int codigoSusepDoCorretor) {
		return ((SeguroDAO) daoSeguroOnibus).buscarPeloCodigoSusepDoCorretor(codigoSusepDoCorretor);
	}

	public SeguroOnibus buscarSeguroDoOnibusPeloCodigoCpdDoCorretor(int codigoCpdDoCorretor) {
		return ((SeguroDAO) daoSeguroOnibus).buscarPeloCodigoCpdDoCorretor(codigoCpdDoCorretor);
	}

	public SeguroOnibus buscarSeguroDoOnibusPeloCodigoSusep(int codigoSusep) {
		return ((SeguroDAO) daoSeguroOnibus).buscarPeloCodigoSusep(codigoSusep);
	}

	public SeguroOnibus buscarSeguroDoOnibusPeloCnpjDaEmpresaDoSeguro(String cpnj) {
		return ((SeguroDAO) daoSeguroOnibus).buscarPeloCnpjDaEmpresaDoSeguro(cpnj);
	}

	public SeguroOnibus buscarSeguroDoOnibusPeloCpfOuCnpjDoSegurado(String cpfOuCnpjDoSegurado) {
		return ((SeguroDAO) daoSeguroOnibus).buscarPeloCpfOuCnpjDoSegurado(cpfOuCnpjDoSegurado);
	}

	
	public SeguroOnibus buscarSeguroDoOnibusPeloNumeroEndosso(int numeroEndosso) {
		return ((SeguroDAO) daoSeguroOnibus).buscarPeloNumeroEndosso(numeroEndosso);
	}

}
