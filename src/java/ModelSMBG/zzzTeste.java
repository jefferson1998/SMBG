/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelSMBG;

import java.time.Instant;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jessin
 */
public class zzzTeste {
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TesteSMBG");
        EntityManager em = emf.createEntityManager();
//        System.out.println("Está pegando!");
//        Date d = Date.from(Instant.EPOCH);        
//        Identidade i = new Identidade();
//        Endereco e = new Endereco("SP", 0, "Magano", "123");
//        Funcionario f = new Funcionario();
//  
//        f.setCpf("125.225.945/70");
//        f.setFuncionarioIdentidade(i);
//        f.setFuncionarioEndereco(e);
//        
//        em.getTransaction().begin();
//        em.persist(f);
//        em.getTransaction().commit();
        System.out.println("ModelSMBG.zzzTeste.main()");
        
    }
}
