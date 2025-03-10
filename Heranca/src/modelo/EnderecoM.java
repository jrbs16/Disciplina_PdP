package modelo;

public class EnderecoM {
    private String rua;
    private int numero;
    private  String cep;
    private String estado;
    private String municipio;
    private String complemento;

    public EnderecoM(String rua, int numero, String cep, String estado, String municipio, String complemento) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.estado = estado;
        this.municipio = municipio;
        this.complemento = complemento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void imprimeEndereco(){
        System.out.println(" --- Endereço --- ");
        System.out.println(" RUA: "+this.getRua());
        System.out.println(" Número: "+this.getNumero());
        System.out.println(" CEP: "+this.getCep());
        System.out.println(" Estado: "+this.getEstado());
        System.out.println(" Municipio: "+this.getMunicipio());
        System.out.println(" Complemento "+this.getComplemento());
    }
}
