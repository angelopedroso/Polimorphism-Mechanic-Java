/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import abstrata.Reparo;
import java.time.LocalDate;
import java.util.LinkedList;

/**
 *
 * @author angel
 */
public class VAReparar {
    private Cliente cliente;
    private Mecanico mecanico;
    private LocalDate prazo;
    private LinkedList<Reparo> list = new LinkedList<>();

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente == null ? new Cliente() : cliente;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico == null ? new Mecanico() : mecanico;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo == null ? LocalDate.now() : prazo;
    }

    public LinkedList<Reparo> getList() {
        return list;
    }

    public void setList(LinkedList<Reparo> list) {
        this.list = list;
    }
    
    public void addReparoLista(Reparo reparo){
        this.list.add(reparo);
    }    
    
    @Override
    public String toString(){
        return this.cliente + "(Prazo: " + this.prazo + ")";
    }    
}
