/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelSMBG;

import ModelSMBG.Entity.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TON
 */
public class IteratorFuncionario implements Iterator<Funcionario>{

    private List<Funcionario> lista = new ArrayList<>();
    private int contador;

    public IteratorFuncionario() {
    }

    public IteratorFuncionario(List<Funcionario> lista) {
        this.lista = lista;
        this.contador = 0;
    }
    
    @Override
    public boolean hasNext() {
        return this.contador < lista.size();
    }

    @Override
    public Funcionario next() {
        return lista.get(this.contador++);
    }
    
    
    
}
