/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemafinal;

import Controle.UsuarioC;
import Modelo.UsuarioM;
import java.sql.Statement;
import java.sql.ResultSet;
import Controle.Database;

/**
 *
 * @author ra191009
 */
public class SistemaFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Statement teste;
        ResultSet dadosBD;
        try{
            UsuarioC banco=new UsuarioC();
           /* UsuarioM user1=new UsuarioM("maria", "123");
            UsuarioC banco=new UsuarioC();
            banco.Cadastrar(user1);
            */
          /* dadosBD=banco.ConsultaGeralLogin();
           while(dadosBD.next()){
               System.out.print("LOGIN: "+dadosBD.getString("usuario"));
               System.out.println(" SENHA : "+dadosBD.getString(2)); //Aqui a coluna é indexada
           }
           */
           dadosBD=banco.ConsultaGeralPorLogin("maria");
           while(dadosBD.next()){
               System.out.print("LOGIN: "+dadosBD.getString("usuario"));
               System.out.println(" SENHA : "+dadosBD.getString(2)); //Aqui a coluna é indexada
           }
           
           banco.AtualizaLogin("maria", "chega");
           dadosBD=banco.ConsultaGeralPorLogin("maria");
           while(dadosBD.next()){
               System.out.print("LOGIN: "+dadosBD.getString("usuario"));
               System.out.println(" SENHA : "+dadosBD.getString(2)); //Aqui a coluna é indexada
           }
          
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
    
}
