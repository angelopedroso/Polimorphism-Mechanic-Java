/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import abstrata.Pessoa;
import enums.Situacao;
/**
 *
 * @author angel
 */
public class Mecanico extends Pessoa{
    private Situacao situacao;

    public Mecanico(){
        super();
        this.setSituacao(situacao.L);
    }
    
    public Mecanico(String nome, String cpf, Situacao situacao){
        super(nome, cpf);
        this.setSituacao(situacao);
    }
    
    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return super.getNome();
    }
}
