package controlador;

import modelo.DadosPessoaisM;

import java.util.ArrayList;

public class DadosPessoaisC {
    public ArrayList<DadosPessoaisM> vetDados;
    public DadosPessoaisC(){
        vetDados=new ArrayList<DadosPessoaisM>();
    }
    public void cadastroDados(DadosPessoaisM dadospessoaism){
        vetDados.add(dadospessoaism);
    }
    public void buscaCompletaDados(){
        for(DadosPessoaisM dados:vetDados){
            dados.imprimeDadosPessoais();
        }
    }
    public int buscaDadosPosicao(String cpf){
        int pos=-1;
        for(int i=0;i<vetDados.size();i++){
            if(vetDados.get(i).getCpf().equals(cpf)){
                pos=i;
            }
        }
        return pos;
    }

}
