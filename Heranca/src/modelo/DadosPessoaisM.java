package modelo;

import java.sql.SQLOutput;

public class DadosPessoaisM {
    private String primeiroNome;
    private String sobrenome;
    private String cpf;
    private char sexo;
    private int idade;

    public DadosPessoaisM(String primeiroNome, String sobrenome, String cpf, char sexo, int idade) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprimeDadosPessoais(){
        System.out.println(" --- DADOS PESSOAIS --- ");
        System.out.println("Prim. Nome: "+this.getPrimeiroNome());
        System.out.println("Segundo Nome: "+this.getSobrenome());
        System.out.println("CPF: "+this.getCpf());
        System.out.println("Sexo: "+this.getSexo());
        System.out.println("Idade: "+this.getIdade());
    }

}
