/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrata;

import classes.Mecanica;

/**
 *
 * @author angel
 */
abstract public class Reparo {
    private Mecanica mecanica;
    
    public Reparo(){
        this.setMecanica(null);
    }
    public Reparo(Mecanica mecanica){
        this.setMecanica(mecanica);
    }

    public Mecanica getMecanica() {
        return mecanica;
    }

    public void setMecanica(Mecanica mecanica) {
        this.mecanica = mecanica == null ? new Mecanica() : mecanica;
    }
    
    @Override
    public String toString(){
        return this.mecanica.toString();
    }
}
