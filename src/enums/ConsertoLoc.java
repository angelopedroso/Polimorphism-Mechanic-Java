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
public enum ConsertoLoc {
    RA("Radiador"), VE("Vela"), CA("Câmbio"), CO("Correia"), BA("Bateria");
    
    private String descricao;

    private ConsertoLoc(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
    
    
}
