/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author angel
 */
public class VeicAdd {
    private String modelo;
    private String placa;
    private int AnoFabricacao;
    private Cliente dono;
    
    public VeicAdd(){
        this.setModelo("Opala");
        this.setPlaca("ABC1234");
        this.setAnoFabricacao(2010);
        this.setDono(null);
    }
    
    public VeicAdd( String modelo, String placa, int AnoFabricacao){
        this.setModelo(modelo);
        this.setPlaca(placa);
        this.setAnoFabricacao(AnoFabricacao);
        this.setDono(dono);
    }
    
    public void setPlaca(String placa) {
        this.placa = placa.trim().isEmpty()?"ABC1234":placa.toUpperCase();
    }
    public String getPlaca() {
        return placa;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo.trim().isEmpty()?"Opala":modelo.toUpperCase();
    }
    public String getModelo() {
        return modelo;
    }


    public void setAnoFabricacao(int AnoFabricacao) {
        this.AnoFabricacao = (AnoFabricacao<=1910)||(AnoFabricacao>2022)?1911:AnoFabricacao;
    }
    public int getAnoFabricacao() {
        return AnoFabricacao;
    }
    
    
    public Cliente getDono() {
        return dono;
    }
    public void setDono(Cliente dono) {
        this.dono = dono == null ? new Cliente() : dono;
    }

    
    @Override
    public String toString(){
        return this.modelo+"("+this.dono+"("+this.placa+"))";
    }       
}
