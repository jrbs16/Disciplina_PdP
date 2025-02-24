/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ra189331
 */
public class DadosPessoais {
    //Dados pessoais
    private String nome;
    private String sobrenome;
    private String cpf;
    private int idade;
    private char sexo;
    
    public DadosPessoais(String nome, String sobrenome, String cpf, int idade, char sexo){
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.cpf=cpf;
        this.idade=idade;
        this.sexo=sexo;   
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void ImprimeDadosPessoais(){
        System.out.println("..:: Dados pessoais ::..");
        System.out.println("Primeiro Nome: "+this.getNome());
        System.out.println("Sobrenome: "+this.getSobrenome());
        System.out.println("CPF: "+this.getSobrenome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Sexo: "+this.getSexo());   
    }
}
