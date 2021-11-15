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
public enum Sexo {
    M("Masculino"), F("Feminino");
    
    private String descricao;
    
    private Sexo(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString(){
        return descricao;
    }
}

