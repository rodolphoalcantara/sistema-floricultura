/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.sistema.dao;

import br.com.floricultura.sistema.model.ItemVenda;
import br.com.floricultura.sistema.utils.GerenciadorConexao;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Classe de persistencia ao banco de dados
 * @see ProdutoDAO 
 * @see VendaDAO 
 * @see ClienteDAO 
 * @see EnderecoDAO 
 * @author rodolpho
 */
public class ItemVendaDAO {
    
    
    /**
     * Salva um ItemVenda no banco de dados
     * @param item Objeto da classe ItemVenda
     * @throws ClassNotFoundException caso não encontre o Drive de conexao com o mySQL
     */
    public static void save(ItemVenda item) throws ClassNotFoundException {
        try {
            String query = "insert into item_venda (quantidade, valor_total, fk_id_venda, fk_id_produto) values (?,?,?,?)";

            try ( PreparedStatement pstm = GerenciadorConexao.getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

                pstm.setInt(1, item.getQuantidade());
                pstm.setBigDecimal(2, item.getValorTotal());
                pstm.setInt(3, item.getFk_id_venda());
                pstm.setInt(4, item.getProduto().getId());

                pstm.execute();

                try ( ResultSet rst = pstm.getGeneratedKeys()) {
                    while (rst.next()) {
                        item.setId(rst.getInt(1));
                    }
                }

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}

