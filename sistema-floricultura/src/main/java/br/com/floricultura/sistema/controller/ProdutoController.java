/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.sistema.controller;

import br.com.floricultura.sistema.dao.ProdutoDAO;
import br.com.floricultura.sistema.model.Produto;

/**
 *
 * @author Naga
 */


public class ProdutoController {
    /**
     * 
     */
    public static Produto SalvarProduto(String nome,int estoque,String tipo,String descricao,double valor){
        Produto produto = new Produto(nome,valor,estoque,tipo,descricao);
        
        ProdutoDAO.salvar(produto);
        return produto;
    }
    
    public static Produto AlterarProduto(int id,String nome,int estoque,String tipo,String descricao,double valor){
        Produto produto = new Produto(id,nome,valor,estoque,tipo,descricao);
        
        ProdutoDAO.atualizar(produto);
        return produto;
    }
    
    public static boolean ExcluirProduto(int id){
        return ProdutoDAO.excluir(id);
    }
    
    
}

