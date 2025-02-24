/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.HashSet;

/**
 *
 * @author ra189331
 */
public class Endereco {
    //Dados de Endereco
    private String rua;
    private int numero;
    private String bairro;
    private String cep;
    private String estado;
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
   public void ImprimeEndereco(){
       System.out.println("...: Endereço :...");
       System.out.println("Rua: "+this.getRua());
       System.out.println("Numero: "+this.getNumero());
       System.out.println("Bairro: "+this.getBairro());
       System.out.println("CEP: "+ this.getCep());
       System.out.println("Endereco: "+this.getEstado());
   }  
    
}
