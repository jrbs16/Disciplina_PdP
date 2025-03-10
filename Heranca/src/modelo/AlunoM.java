package modelo;

public class AlunoM {
    private int ra;
    private int codCurso;
    private char turno;
    private DadosPessoaisM dadosPessoais;
    private EnderecoM endereco;

    public AlunoM(int ra, int codCurso, char turno, DadosPessoaisM dadosPessoais, EnderecoM endereco) {
        this.ra = ra;
        this.codCurso = codCurso;
        this.turno = turno;
        this.dadosPessoais = dadosPessoais;
        this.endereco = endereco;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public DadosPessoaisM getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoaisM dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public EnderecoM getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoM endereco) {
        this.endereco = endereco;
    }

    public void imprimeAluno(){
        System.out.println(" Aluno - Impressão");
        System.out.println(" RA: "+this.getRa());
        System.out.println(" Curso: "+this.getCodCurso());
        System.out.println(" Turno: "+this.getTurno());
        this.getDadosPessoais().imprimeDadosPessoais();
        this.getEndereco().imprimeEndereco();
    }

    public int anoNascimento(int idade, int anoAtual){
        return anoAtual-idade;
    }

}
