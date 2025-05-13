/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ra189331
 */
public class ProdutoM {
    
    private String codigoProduto;
    private String nomeProduto;
    private float valorUnitario;
    private int disponivel;

    public ProdutoM(String codigoProduto, String nomeProduto, float valorUnitario, int disponivel) {
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.valorUnitario = valorUnitario;
        this.disponivel = disponivel;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(int disponivel) {
        this.disponivel = disponivel;
    }
    
}
