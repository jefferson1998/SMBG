/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelSMBG.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jessin
 */
public class GeradorDeEntityManager {
    
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;
    
    public static EntityManager getEntityManager() {
        if(entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("TesteSMBG");
        }
        return entityManagerFactory.createEntityManager();
    }
    
    public static void fecharEntityManager(EntityManager em) {
        em.close();
    }

}
