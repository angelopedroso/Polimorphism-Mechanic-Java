/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import enums.ConsertoLoc;

/**
 *
 * @author angel
 */
public class Mecanica {
    private ConsertoLoc reparoloc;
    private boolean pneu;

    public Mecanica(){
        this.setReparoloc(reparoloc.BA);
        this.setPneu(false);
    }
    
    public Mecanica(ConsertoLoc reparoloc, boolean pneu){
        this.setReparoloc(reparoloc);
        this.setPneu(pneu);
    }    
    
    public ConsertoLoc getReparoloc() {
        return reparoloc;
    }

    public void setReparoloc(ConsertoLoc reparoloc) {
        this.reparoloc = reparoloc;
    }

    public boolean isPneu() {
        return pneu;
    }

    public void setPneu(boolean pneu) {
        this.pneu = pneu;
    }
    
    
}
