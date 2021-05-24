/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.sistema.controller;

import br.com.floricultura.sistema.dao.VendaDAO;
import br.com.floricultura.sistema.model.Venda;
import java.util.List;

/**
 *
 * @author rodolpho
 */
public class teste {
    
    public static void main(String[] args) throws ClassNotFoundException {
        List<Venda> lv = VendaDAO.listarVendasComItens();
        
        System.out.println(lv.size());
        
        for(int i = 0; i < lv.size(); i++){
            System.out.println("Venda id: " + lv.get(i).getId() +" | cliente: "+ lv.get(i).getCliente().getNomeCliente());
            System.out.println("Produtos: ");
                   
            for (int j = 0; j < lv.get(i).getItens().size(); j++) {
                System.out.println(j + " : " + lv.get(i).getItens().get(j).getProduto().getNome());
            }
                  
        }
        
    }
    
    
    
}
