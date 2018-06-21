/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelSMBG;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jessin
 */
public class ConexaoBancoDeDados {
    
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("TesteSMBG");;
    private static EntityManager em;
    
    private ConexaoBancoDeDados() {
        
    }
    
    public static EntityManager getConexao() {
        if(em == null) {
            em =  emf.createEntityManager();
        }
        
        return em;
    }
    
}
