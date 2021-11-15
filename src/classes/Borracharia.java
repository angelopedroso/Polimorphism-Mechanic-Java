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
public class Borracharia extends Reparo{
    private int quant;
    //
    public Borracharia(){
        super();
        this.setQuant(1);
    }
    public Borracharia(Mecanica mecanica,int quant){
        super(mecanica);
        this.setQuant(quant);
    }
    
    public void setQuant(int quant){
        this.quant = (quant < 1 && quant > 4) ? 1 : quant; 
    }
    public int getQuant(){
        return this.quant;
    }
    
    @Override
    public String toString(){
        return super.getMecanica() + " Pneus: " + this.quant;
    }
}   
