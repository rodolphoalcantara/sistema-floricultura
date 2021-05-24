/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.sistema.controller;

import br.com.floricultura.sistema.dao.VendaDAO;
import br.com.floricultura.sistema.model.CadastroCliente;
import br.com.floricultura.sistema.model.Venda;
import java.util.Date;


/**
 * Classe Controller para vendas
 * @see CadastroClienteController
 * @see ProdutoController
 * @author rodolpho
 */
public class VendaController {
    
    /**
     * 
     * @param cliente pertencenta a classe CadastroCliente 
     * @param data Data em formato java.uti.Date
     * @return Objeto Venda atualizado com o id
     * @see java.util.Date
     */
    public static Venda salvar(CadastroCliente cliente, Date data){
        Venda venda = new Venda(cliente, data);
        
        try {
            VendaDAO.save(venda);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        
        
        return venda;
    }
    
}
