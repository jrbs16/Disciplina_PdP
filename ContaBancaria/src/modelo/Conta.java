/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ra189331
 */
public class Conta {
    private int conta;
    private int agencia;
    private float saldo;
    private float limite;
    
    private DadosPessoais dadosPessoais;
    private Endereco endereco;

    public Conta(int conta, int agencia, float saldo, float limite, DadosPessoais dadosPessoais, Endereco endereco) {
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
        this.dadosPessoais = dadosPessoais;
        this.endereco = endereco;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public void ImprimeConta(){
        System.out.println(":: Conta Pessoal ::");
        System.out.println("Conta: "+this.getConta());
        System.out.println("Agencia: "+this.getAgencia());
        System.out.println("Saldo Atual: "+this.getSaldo());
        System.out.println("Limite: "+this.getLimite());
        this.getDadosPessoais().ImprimeDadosPessoais();
        this.getEndereco().ImprimeEndereco();
    }
}
