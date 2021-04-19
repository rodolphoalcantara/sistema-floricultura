/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.sistema.model;

import java.time.LocalDateTime;

/**
 *
 * @author rodolpho
 */
public class Relatorio {

    private String nomeCliente, CPFCliente, emailCliente, nomeProduto;
    private Double valorProduto;
    private int quantidadeProdutoVendido;
    private LocalDateTime dataVenda;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCPFCliente() {
        return CPFCliente;
    }

    public void setCPFCliente(String CPFCliente) {
        this.CPFCliente = CPFCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getQuantidadeProdutoVendido() {
        return quantidadeProdutoVendido;
    }

    public void setQuantidadeProdutoVendido(int quantidadeProdutoVendido) {
        this.quantidadeProdutoVendido = quantidadeProdutoVendido;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    

}
