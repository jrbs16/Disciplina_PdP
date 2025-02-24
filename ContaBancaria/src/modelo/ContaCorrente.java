/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ra189331
 */
public class ContaCorrente {
    //Dados da conta
    private int conta;
    private int agencia;
    private float saldo;
    private float limite;
  
  
    /*Construtor Padrão: Inicializa com valores do mesmo tipo*/
    public ContaCorrente(){
        this.conta=0;
        this.agencia=0;
        this.limite=0.0f;
        this.saldo=0.0f;
    }
    //Construtor com Parâmetro
    public ContaCorrente(int conta, int agencia, float limite, float saldo){
        this.conta=conta;
        this.agencia=agencia;
        this.limite=limite;
        this.saldo=saldo;
    }    
     
    public void deposito(float valor){
        this.saldo=this.saldo+valor;
    }    
    public float saldo(){
        return this.saldo+this.limite;
    }
    
    public void saque(float valor){
        this.saldo=this.saldo-valor;
        if(valor>this.saldo){
            System.out.println("Uso de Cheque Especial");
            System.out.println("Saldo atual: "+this.saldo());
        }
        else{
            System.out.println("Nao usou cheque especial");
            System.out.println("Saldo atual: "+this.saldo);
        }
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
    
//  Impressão
    public void impressao(){
            System.out.println("Dados atuais - por Objeto");
            System.out.println("Agencia: "+this.getAgencia());
            System.out.println("Conta: "+this.getConta());
            System.out.println("Limite: "+this.getLimite());
            System.out.println("Saldo: "+this.getSaldo());
        }
    
    public void ImpressaoPorObjeto(ContaCorrente obj){
            System.out.println("Dados atuais - por Objeto");
            System.out.println("Agencia: "+obj.getAgencia());
            System.out.println("Conta: "+obj.getConta());
            System.out.println("Limite: "+obj.getLimite());
            System.out.println("Saldo: "+obj.getSaldo());     
    }
    
    
    
    
}
