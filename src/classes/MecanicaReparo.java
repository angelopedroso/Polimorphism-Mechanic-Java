/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import abstrata.Reparo;

/**
 *
 * @author angel
 */
public class MecanicaReparo extends Reparo{
    public MecanicaReparo(){
        super();
    }
    
    public MecanicaReparo(Mecanica mecanica){
        super(mecanica);
    }
    
    @Override
    public String toString(){
        return super.getMecanica()+"";
    }
}
