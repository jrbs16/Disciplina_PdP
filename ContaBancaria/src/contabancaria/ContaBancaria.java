/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabancaria;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.DadosPessoais;
import modelo.Endereco;

/**
 *
 * @author ra189331
 */
public class ContaBancaria {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContaCorrente c1=new ContaCorrente();
        c1.setAgencia(1);
        c1.setConta(1);
        c1.setLimite(1000.0f);
        c1.setSaldo(50);
        c1.impressao();
       //Testando o método 2 de impressão
        ContaCorrente c2=new ContaCorrente();
        c2.setAgencia(1);
        c2.setConta(2);
        c2.setLimite(2000);
        c2.setSaldo(100);
        c2.ImpressaoPorObjeto(c2);
        //Construtor
        ContaCorrente c3=new ContaCorrente();
        c3.ImpressaoPorObjeto(c3);
        //Sobrecarga
        //Construtor com parâmetros; Testando metodos adicionais;
        ContaCorrente c4=new ContaCorrente(4,4 , 4000, 400);
        c4.ImpressaoPorObjeto(c4);
        System.out.println("Saldo total: "+c4.saldo());
        c4.saque(10000);
        c4.saldo();
        
        
        DadosPessoais jerbs=new DadosPessoais("Jarbas","Ribeiro","111.666.999-44",25,'M');
        
        Conta jerbsc= new Conta(1, 1, 100, 100, jerbs, endereco);
    }
    
}
