/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.sistema.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe modelo produto
 * Metodos gueters, setters e construtores
 * @author Naga
 */


public class Produto {
    private int id;
    private String nome;
    private Double valor;
    private int estoque;
    private String tipo;
    private String descricao;
    
    
    public Produto(){
    
    }

    public Produto(int id, String nome, Double valor, int estoque, String tipo, String descricao) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
        this.tipo = tipo;
        this.descricao = descricao;
    }
    
    public Produto(String nome, Double valor, int estoque, String tipo, String descricao) {
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
        this.tipo = tipo;
        this.descricao = descricao;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    @Override
    public String toString() {
        return "Flor{" + "id=" + id + ", nome=" + nome + ", valor=" + valor + ", estoque=" + estoque + ", tipo=" + tipo + ", descricao=" + descricao + '}';
    }
    
}
