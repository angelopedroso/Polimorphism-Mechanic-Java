/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrata;

import classes.Cliente;
import classes.Mecanica;
import classes.Mecanico;
import classes.VAReparar;
import classes.VeicAdd;
import java.util.LinkedList;

/**
 *
 * @author angel
 */
abstract public class Dados {
    private static double TaxaDeprec;
    private static LinkedList<VeicAdd> listaVeic = new LinkedList<>();
    private static LinkedList<Cliente> listaCliente = new LinkedList<>();
    private static LinkedList<Mecanico> listaMecanicos = new LinkedList<>();
    private static LinkedList<Mecanica> listaMecanica = new LinkedList<>();
    private static LinkedList<VAReparar> listaReparo = new LinkedList<>();
    
    
    //
    public static void setTaxaDeprec(double arg){
        TaxaDeprec = (arg < 0) ? 0:arg;
    }
    public static double getTaxaDeprec(){
        return TaxaDeprec;
    }
    
    //
    public static LinkedList<VeicAdd> getListaVeic(){
        return listaVeic;
    }

    public static LinkedList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public static void setListaCliente(LinkedList<Cliente> aListaCliente) {
        listaCliente = aListaCliente;
    }

    public static LinkedList<Mecanico> getListaMecanicos() {
        return listaMecanicos;
    }

    public static void setListaMecanicos(LinkedList<Mecanico> aListaMecanicos) {
        listaMecanicos = aListaMecanicos;
    }

    public static LinkedList<Mecanica> getListaMecanica() {
        return listaMecanica;
    }

    public static void setListaMecanica(LinkedList<Mecanica> aListaMecanica) {
        listaMecanica = aListaMecanica;
    }

    public static LinkedList<VAReparar> getListaReparo() {
        return listaReparo;
    }

    public static void setListaReparo(LinkedList<VAReparar> aListaReparo) {
        listaReparo = aListaReparo;
    }
}
