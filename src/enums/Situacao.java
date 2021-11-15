/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author angel
 */
public enum Situacao {
    O("Ocupado"), L("Livre");
    
    private String descricao;

    private Situacao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString(){
        return this.descricao;
    }
}
