package ModelSMBG;

import ModelSMBG.Entity.Viagem;
import ModelSMBG.Entity.Rota;
import ModelSMBG.DAO.ViagemHibernate;
import ModelSMBG.DAO.DAO;
import ModelSMBG.DAO.ViagemDAO;
import java.util.List;

public class ViagemModel {

    DAO<Viagem> daoViagem = new ViagemHibernate();

    // inserir, atualizar, deletar, buscar todos, buscar pela data, buscar pelo CPF do funcionario
    public void cadastrarViagem(Viagem viagem) {
        daoViagem.inserir(viagem);
    }

    public void atualizarViagem(Viagem viagem) {
        daoViagem.atualizar(viagem);
    }

    public void removerViagem(Viagem viagem) {
        daoViagem.deletar(viagem);
    }

    public List<Viagem> listarTodasAsViagems() {
        return daoViagem.listarTodos();
    }

    public Viagem buscarPelaData(String data) {
        return ((ViagemDAO) daoViagem).buscarPelaData(data);
    }

    public Viagem buscarPeloCpfDoFuncionario(String cpf) {
        return ((ViagemDAO) daoViagem).buscarPeloCpfDoFuncionario(cpf);
    }

    public Viagem buscarPeloDiaDaSemana(String diaDaSemana) {
        return ((ViagemDAO) daoViagem).buscarPeloDiaDaSemana(diaDaSemana);
    }

    public Viagem buscarPeloRenavaDoOnibus(String codigoRenavam) {
        return ((ViagemDAO) daoViagem).buscarPeloRenavaDoOnibus(codigoRenavam);
    }

    public Viagem buscarPelaPlacaDoOnibus(String placa) {
        return ((ViagemDAO) daoViagem).buscarPelaPlacaDoOnibus(placa);
    }

    public Viagem buscarPeloChassisDoOnibus(String chassi) {
        return ((ViagemDAO) daoViagem).buscarPeloChassisDoOnibus(chassi);
    }

    public Viagem buscarPelaRota(Rota rota) {
        return ((ViagemDAO) daoViagem).buscarPelaRota(rota);
    }

}
