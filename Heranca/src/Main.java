// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import controlador.DadosPessoaisC;
import controlador.EnderecoC;
import modelo.EnderecoM;
import modelo.DadosPessoaisM;
import modelo.AlunoM;
import modelo.EnderecoProfissionalM;

public class Main {

    public static void main(String[] args) {
        DadosPessoaisM dp= new DadosPessoaisM("Jarbas","Ribeiro",
                "1236",'M',25);
        EnderecoM end=new EnderecoM("Rua X",1,"56884","MS",
                "CG","..");
        AlunoM jarbas=new AlunoM(7,24,'M',
                dp,end);

        EnderecoM end1=new EnderecoM("Rue Xis",2,"79556","MS",
                "P Pora","..");
        EnderecoM end2=new EnderecoM("Ruaz J",3,"5669","MS",
                "Nova Andradina","...");

        EnderecoC endc=new EnderecoC();
        endc.cadastroEndereco(end);
        endc.cadastroEndereco(end1);
        endc.cadastroEndereco(end2);
        endc.buscaCompletaEndereco();

        int posicao=endc.buscaCEPPorPosicao("5669");
        System.out.println("Posição do Objeto: "+posicao);

        DadosPessoaisC dadosc= new DadosPessoaisC();
        DadosPessoaisM dp1= new DadosPessoaisM("Jules","Ronco",
                "5599",'F',22);
        DadosPessoaisM dp2= new DadosPessoaisM("Fabio","Jr","787889",
                'F',45);

        dadosc.cadastroDados(dp1);
        dadosc.cadastroDados(dp2);
        dadosc.buscaCompletaDados();

        int pos=dadosc.buscaDadosPosicao("5599");
        System.out.println("Posição Dados: "+pos);

        EnderecoProfissionalM endProf=new EnderecoProfissionalM("Av",56,"8899","Naruto"
        ,"Vila da Folha","..",58,10);
        endProf.imprimeEnderecoProfissional();
    }
}