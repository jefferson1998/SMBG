/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelSMBG;

/**
 *
 * @author Rodrigo
 */
public class ChecarNulo {

    public static boolean ehNulo(Object... obj) {
        for (Object obj1 : obj) {
            if (obj1 == null) {
                return true;
            }
        }
        return false;
    }

}
