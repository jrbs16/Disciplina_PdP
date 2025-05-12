/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;
import java.sql.ResultSet;
import Modelo.ProdutoM;

/**
 * @author ra189331
 */
public class ProdutoC {
   
    private Database dao=new Database();
    public ResultSet dadosConsulta;
   
    //Insert
    public void CadastrarProduto(ProdutoM produtom){
        try{
            dao.conexao();
            String SQL = "insert into produto(codigoProduto,nomeProduto,"
                    + "valorUnitario,disponivel) values ('"+produtom.getCodigoProduto()+"', '"+produtom.getNomeProduto()+"'"
                    + ", '"+produtom.getValorUnitario()+"','"+produtom.getDisponivel()+"')";
            
            dao.getStatement().execute(SQL);
            dao.desconecta();
        }catch(Exception tipoExcecao){
            System.out.println("ERRO!");
            tipoExcecao.printStackTrace();
        }
    }
    //Select
    public ResultSet ConsultaGeralProdutos(){
        //1. Try e Catch
        //2. Conexão com Database
        //3. Comando SQL: String e Statement
        //4. Fechar a conexão
        try{
            dao.conexao();
            String SQL="select * from produto";
            dadosConsulta=dao.getStatement().executeQuery(SQL);
            dao.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }
        return dadosConsulta;
    }
    
    
     public ResultSet  ConsultaGeralPorNomeProduto(String produto){
        //1. Try e Catch
        //2. Conexão com Database
        //3. Comando SQL: String e Statement
        //4. Fechar a conexão
        try{
            dao.conexao();
            String SQL="Select * from produto where nomeProduto='"+produto+"'";
            dadosConsulta=dao.getStatement().executeQuery(SQL);
            dao.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }
        return dadosConsulta;
        
        
    }
    
}
