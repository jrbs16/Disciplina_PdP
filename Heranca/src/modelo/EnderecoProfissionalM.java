package modelo;

public class EnderecoProfissionalM extends EnderecoM{
    private int numeroDaSala;
    private int Andar;
    public EnderecoProfissionalM(String rua, int numero, String cep, String estado, String municipio,
                                 String complemento, int numeroDaSala, int andar) {
        super(rua, numero, cep, estado, municipio, complemento);
        this.numeroDaSala = numeroDaSala;
        Andar = andar;
    }
    public int getNumeroDaSala() {
        return numeroDaSala;
    }
    public void setNumeroDaSala(int numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }
    public int getAndar() {
        return Andar;
    }
    public void setAndar(int andar) {
        Andar = andar;
    }
    public void imprimeEnderecoProfissional(){
        System.out.println("..:: END. Profissional ::..");
        System.out.println("***************************");
        this.imprimeEndereco();
        System.out.println("Num. da Sala: "+this.getNumeroDaSala());
        System.out.println("Andar: "+this.getAndar());
    }
}
