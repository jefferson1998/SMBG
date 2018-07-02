package ModelSMBG.DAO;

import ModelSMBG.Entity.Rota;
import ModelSMBG.Entity.Viagem;
import java.util.List;
import javax.persistence.EntityManager;


public class ViagemHibernate implements ViagemDAO{
    
    private EntityManager em = GeradorDeEntityManager.getEntityManager();

    @Override
    public void inserir(Viagem viagem) {
        
        try {
            em.getTransaction().begin();
            em.persist(viagem);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public void atualizar(Viagem viagem) {
        try {
            em.getTransaction().begin();
            em.merge(viagem);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public void deletar(Viagem viagem) {
        try {
            em.getTransaction().begin();
            em.remove(viagem);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<Viagem> listarTodos() {
        List<Viagem> lista;
        try{
            lista = this.em.createQuery("from Viagem").getResultList();
            return lista;
        } catch (Exception erro) {
            lista = null;
        }
       return lista;
    }
    
    @Override
    public Viagem buscarPelaData(String data) {
        Viagem viagem;
        try {
            viagem = (Viagem) em.createQuery("from Viagem WHERE data = ?").
                    setParameter(1, data).getSingleResult();
            return viagem;
        } catch (Exception e) {
            viagem = null;
        }
        return viagem;
    }

    @Override
    public Viagem buscarPeloCpfDoFuncionario(String cpf) {
        Viagem viagem;
        try {
            viagem = (Viagem) em.createQuery("from Viagem AS v JOIN Funcionario AS f\n" +
            "ON v.cod_motorista = f.cod_funcionario\n" +
            "WHERE f.cpf = ?;").
                    setParameter(1, cpf).getSingleResult();
            return viagem;
        } catch (Exception e) {
            viagem = null;
        }
        return viagem;
    }

    @Override
    public Viagem buscarPeloDiaDaSemana(String diaDaSemana) {
        Viagem viagem;
        try {
            viagem = (Viagem) em.createQuery("from Viagem WHERE diaDaSemana = ?").
                    setParameter(1, diaDaSemana).getSingleResult();
            return viagem;
        } catch (Exception e) {
            viagem = null;
        }
        return viagem;
    }

    @Override
    public Viagem buscarPeloRenavaDoOnibus(String codigoRenavam) {
        Viagem viagem;
        try {
            viagem = (Viagem) em.createQuery("from Viagem AS v JOIN Onibus AS o\n" +
                "ON v.cod_motorista = o.cod_onibus\n" +
                "WHERE o.codigoRenavam = ?;").
                    setParameter(1, codigoRenavam).getSingleResult();
            return viagem;
        } catch (Exception e) {
            viagem = null;
        }
        return viagem;
    }

    @Override
    public Viagem buscarPelaPlacaDoOnibus(String placa) {
        Viagem viagem;
        try {
            viagem = (Viagem) em.createQuery("from Viagem AS v JOIN Onibus AS o\n" +
                "ON v.cod_motorista = o.cod_onibus\n" +
                "WHERE o.placa = ?;").
                    setParameter(1, placa).getSingleResult();
            return viagem;
        } catch (Exception e) {
            viagem = null;
        }
        return viagem;
    }

    @Override
    public Viagem buscarPeloChassisDoOnibus(String chassi) {
        Viagem viagem;
        try {
            viagem = (Viagem) em.createQuery("from Viagem AS v JOIN Onibus AS o\n" +
                "ON v.cod_motorista = o.cod_onibus\n" +
                "WHERE o.chassi = ?;").
                    setParameter(1, chassi).getSingleResult();
            return viagem;
        } catch (Exception e) {
            viagem = null;
        }
        return viagem;
    }

    @Override
    public Viagem buscarPelaRota(Rota rota) {
        Viagem viagem;
        try {
            viagem = (Viagem) em.createQuery("from Viagem AS v JOIN Rotas AS r\n" +
            "ON v.cod_rota = r.cod_rota").
                    setParameter(1, rota).getSingleResult();
            return viagem;
        } catch (Exception e) {
            viagem = null;
        }
        return viagem;
    }
    
}
