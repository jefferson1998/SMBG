package ModelSMBG;

import java.util.ArrayList;
import java.util.List;
import java.security.InvalidParameterException;

public class AdmissaoModel {

    private DAO<Admissao> daoAdmissao = new AdmissaoHibernate();
    private List<Admissao> listaDeAdmissao = new ArrayList<>();

    public void cadastrarAdmissao(Admissao admissao) {

        for (int i = 0; i < listaDeAdmissao.size(); i++) {
            if (listaDeAdmissao.getClass(i).equals(admissao)) {
                throw new InvalidParameterException("Admissão não existe");
            }
        }

        listaDeAdmissao.add(daoAdmissao.inserir(admissao));

    }

    public void atualizarAdmissao(Admissao admissao) {

        for (int i = 0; i < listaDeAdmissao.size(); i++) {
            if (listaDeAdmissao.getClass(i).equals(admissao)) {
                listaDeAdmissao.set(i, daoAdmissao.atualizar(admissao));
            }
        }

        throw new InvalidParameterException("Admissão não existe");
    }

    public void removerAdmissao(Admissao admissao) {

        for (int i = 0; i < listaDeAdmissao.size(); i++) {
            if (listaDeAdmissao.getClass(i).equals(admissao)) {
                listaDeAdmissao.remove(daoAdmissao.deletar(admissao));
            }
        }

        throw new InvalidParameterException("Admissão não existe");
    }

    public List<Admissao> buscaTodosAsAdmissoes() {
        return daoAdmissao.listarTodos();
    }

    public Admissao buscarAdmissaoPeloCpfDoFuncionario(String cpf) {

        for (int i = 0; i < listaDeAdmissao.size(); i++) {
            if (listaDeAdmissao.getClass(i).getFuncionario.getCpf.equals(cpf)) {
                return ((AdmissaoDAO) daoAdmissao).buscarPeloCpfDoFuncionario(cpf);
            }
        }
        throw new InvalidParameterException("Admissão não existe");
    }

    public Admissao buscarAdmissaoPelaIdentidadeDoFuncionario(String numeroIdentidade) {

        for (int i = 0; i < listaDeAdmissao.size(); i++) {
            if (listaDeAdmissao.getClass(i).getFuncionario.getIdentidade.getNumeroIdentidade.equals(numeroIdentidade)) {
                return ((AdmissaoDAO) daoAdmissao).buscarPelaIdentidadeDoFuncionario(numeroIdentidade);
            }
        }

        throw new InvalidParameterException("Admissão não existe");
    }

    public Admissao buscarAdmissaoPelaCnhDoFuncionario(String cnh) {

        for (int i = 0; i < listaDeAdmissao.size(); i++) {
            if (listaDeAdmissao.getClass(i).getFuncionario.getCNH.getNumeroCNH.equals(cnh)) {
                return ((AdmissaoDAO) daoAdmissao).buscarPelaIdentidadeDoFuncionario(cnh);
            }
        }

        throw new InvalidParameterException("Admissão não existe");
    }

}
