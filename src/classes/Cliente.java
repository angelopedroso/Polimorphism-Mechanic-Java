/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import abstrata.Pessoa;
import enums.Sexo;

/**
 *
 * @author angel
 */
public class Cliente extends Pessoa{
    private Sexo sexo;
    private String endereco;
    private VeicAdd veiculo;
    
    public Cliente(){
        super();
        this.setSexo(sexo.M);
        this.setEndereco("Rua Afonso 123");
    }
    
    public Cliente(String nome, String cpf, Sexo sexo, String endereco){
        super(nome, cpf);
        this.setSexo(sexo);
        this.setEndereco(endereco);
    }    
    
    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco.trim().isEmpty() ? "Rua Afonso 123" : endereco;
    }
    
    @Override
    public String toString(){
        return super.getNome();
    }
}
