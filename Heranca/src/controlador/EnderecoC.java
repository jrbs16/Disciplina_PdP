package controlador;

import modelo.EnderecoM;

import java.util.ArrayList;

public class EnderecoC {
    public ArrayList<EnderecoM> vetEndereco;
    public EnderecoC(){
        vetEndereco= new ArrayList<EnderecoM>();
    }
    public void cadastroEndereco(EnderecoM enderecom){
        vetEndereco.add(enderecom);
    }
    public void buscaCompletaEndereco(){
        for(EnderecoM dados:vetEndereco){
            dados.imprimeEndereco();
        }
    }
    public int buscaCEPPorPosicao(String cep){
        int pos=-1;
        for(int i=0;i<vetEndereco.size();i++){
            if(vetEndereco.get(i).getCep().equals(cep)){
                pos=i;
            }
        }
        return pos;
    }
}
