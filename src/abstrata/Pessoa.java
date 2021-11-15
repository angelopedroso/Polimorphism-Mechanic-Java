/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrata;

/**
 *
 * @author angel
 */
abstract public class Pessoa {
    private String nome, cpf;
    
    public Pessoa(){
        this.setNome("NOME");
        this.setCpf("000.000.000-00");
    }
    
    public Pessoa(String nome,String cpf){
        this.setNome(nome);
        this.setCpf(cpf);
    }    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ? "NOME" : nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf.trim().isEmpty() ? "000.000.000-00" : cpf;
    }
    
}
