/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.sistema.dao;

import br.com.floricultura.sistema.model.CadastroCliente;
import br.com.floricultura.sistema.model.ItemVenda;
import br.com.floricultura.sistema.model.Produto;
import br.com.floricultura.sistema.model.Venda;
import br.com.floricultura.sistema.utils.GerenciadorConexao;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author rodolpho
 */
public class VendaDAO {
    
    public static List<Venda> listarVendasComItens() throws ClassNotFoundException{
        try{
            Venda anterior = null;
            List<Venda> vendas = new ArrayList<Venda>();
            String query = "select v.id_venda, v.data_venda, "
                    + "c.id_cli, c.nome, c.CPF, c.sexo, c.data_nasc, c.email, c.estado_civil, c.telefone, c.fk_id_endereco "
                    + "i.id_item, i.quantidade, i.valor_total, "
                    + "p.id_produto, p.nome, p.valor_unitario, p.estoque, p.descricao, p.tipo "
                    + "from venda v "
                    + "inner join cliente c on c.id_cli = v.fk_id_cli "
                    + "inner join item_venda i on v.id_venda = i.fk_id_venda "
                    + "inner join produto p on p.id_produto = i.fk_id_produto "
                    + "order by v.data_venda desc";
            
            try(PreparedStatement pstm = GerenciadorConexao.getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS)){
                pstm.execute();
                
                try(ResultSet rst = pstm.getResultSet()){
                    while(rst.next()){
                        if(anterior == null || anterior.getId() == rst.getInt(1)){
                            CadastroCliente cliente = new CadastroCliente(rst.getInt(3), rst.getString(4), rst.getString(5), rst.getString(6),rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getInt(11));
                            Venda venda = new Venda(cliente, rst.getDate(2));
                            vendas.add(venda);
                            anterior = venda;
                        }
                        Produto produto = new Produto(rst.getInt(15), rst.getString(16), rst.getDouble(17), rst.getInt(18), rst.getString(19), rst.getString(20));
                        ItemVenda item = new ItemVenda(rst.getInt(12), rst.getInt(13),rst.getBigDecimal(14), produto, rst.getInt(1));
                        anterior.adicionar(item);
                    }
                }
                return vendas;
            }
            
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }
    
    public static List<Venda> listarVendasComItensEmUmPeriodo(Date dataInicial, Date dataFinal) throws ClassNotFoundException{
        try{
            Venda anterior = null;
            List<Venda> vendas = new ArrayList<Venda>();
            String query = "select v.id_venda, v.data_venda, "
                    + "c.id_cli, c.nome, c.CPF, c.sexo, c.data_nasc, c.email, c.estado_civil, c.telefone, c.fk_id_endereco "
                    + "i.id_item, i.quantidade, i.valor_total, "
                    + "p.id_produto, p.nome, p.valor_unitario, p.estoque, p.descricao, p.tipo "
                    + "from venda v "
                    + "inner join cliente c on c.id_cli = v.fk_id_cli "
                    + "inner join item_venda i on v.id_venda = i.fk_id_venda "
                    + "inner join produto p on p.id_produto = i.fk_id_produto "
                    + "where v.data_venda between ? and ? "
                    + "order by v.data_venda desc ";
            
            try(PreparedStatement pstm = GerenciadorConexao.getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS)){
                
                pstm.setDate(1, dataInicial);
                pstm.setDate(2, dataFinal);
                
                pstm.execute();
                
                try(ResultSet rst = pstm.getResultSet()){
                    while(rst.next()){
                        if(anterior == null || anterior.getId() == rst.getInt(1)){
                            CadastroCliente cliente = new CadastroCliente(rst.getInt(3), rst.getString(4), rst.getString(5), rst.getString(6),rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getInt(11));
                            Venda venda = new Venda(cliente, rst.getDate(2));
                            vendas.add(venda);
                            anterior = venda;
                        }
                        Produto produto = new Produto(rst.getInt(15), rst.getString(16), rst.getDouble(17), rst.getInt(18), rst.getString(19), rst.getString(20));
                        ItemVenda item = new ItemVenda(rst.getInt(12), rst.getInt(13),rst.getBigDecimal(14), produto, rst.getInt(1));
                        anterior.adicionar(item);
                    }
                }
                return vendas;
            }
            
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }
    
    public static List<Venda> listarVendasComItensEmUmPeriodoPorCliente(Date dataInicial, Date dataFinal, int idCliente) throws ClassNotFoundException{
        try{
            Venda anterior = null;
            List<Venda> vendas = new ArrayList<Venda>();
            String query = "select v.id_venda, v.data_venda, "
                    + "c.id_cli, c.nome, c.CPF, c.sexo, c.data_nasc, c.email, c.estado_civil, c.telefone, c.fk_id_endereco "
                    + "i.id_item, i.quantidade, i.valor_total, "
                    + "p.id_produto, p.nome, p.valor_unitario, p.estoque, p.descricao, p.tipo "
                    + "from venda v "
                    + "inner join cliente c on c.id_cli = v.fk_id_cli "
                    + "inner join item_venda i on v.id_venda = i.fk_id_venda "
                    + "inner join produto p on p.id_produto = i.fk_id_produto "
                    + "where c.id_cli like ? and v.data_venda between ? and ? "
                    + "order by v.data_venda desc ";
            
            try(PreparedStatement pstm = GerenciadorConexao.getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS)){
                
                pstm.setDate(2, dataInicial);
                pstm.setDate(3, dataFinal);
                
                pstm.execute();
                
                try(ResultSet rst = pstm.getResultSet()){
                    while(rst.next()){
                        if(anterior == null || anterior.getId() == rst.getInt(1)){
                            CadastroCliente cliente = new CadastroCliente(rst.getInt(3), rst.getString(4), rst.getString(5), rst.getString(6),rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getInt(11));
                            Venda venda = new Venda(cliente, rst.getDate(2));
                            vendas.add(venda);
                            anterior = venda;
                        }
                        Produto produto = new Produto(rst.getInt(15), rst.getString(16), rst.getDouble(17), rst.getInt(18), rst.getString(19), rst.getString(20));
                        ItemVenda item = new ItemVenda(rst.getInt(12), rst.getInt(13),rst.getBigDecimal(14), produto, rst.getInt(1));
                        anterior.adicionar(item);
                    }
                }
                return vendas;
            }
            
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }
    
    public static List<Venda> listarVendasComItensPorCliente(int idCliente) throws ClassNotFoundException{
        try{
            Venda anterior = null;
            List<Venda> vendas = new ArrayList<Venda>();
            String query = "select v.id_venda, v.data_venda, "
                    + "c.id_cli, c.nome, c.CPF, c.sexo, c.data_nasc, c.email, c.estado_civil, c.telefone, c.fk_id_endereco "
                    + "i.id_item, i.quantidade, i.valor_total, "
                    + "p.id_produto, p.nome, p.valor_unitario, p.estoque, p.descricao, p.tipo "
                    + "from venda v "
                    + "inner join cliente c on c.id_cli = v.fk_id_cli "
                    + "inner join item_venda i on v.id_venda = i.fk_id_venda "
                    + "inner join produto p on p.id_produto = i.fk_id_produto "
                    + "where c.id_cli like ?"
                    + "order by v.data_venda desc ";
            
            try(PreparedStatement pstm = GerenciadorConexao.getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS)){
                
                pstm.setInt(1, idCliente);
                
                pstm.execute();
                
                try(ResultSet rst = pstm.getResultSet()){
                    while(rst.next()){
                        if(anterior == null || anterior.getId() == rst.getInt(1)){
                            CadastroCliente cliente = new CadastroCliente(rst.getInt(3), rst.getString(4), rst.getString(5), rst.getString(6),rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getInt(11));
                            Venda venda = new Venda(cliente, rst.getDate(2));
                            vendas.add(venda);
                            anterior = venda;
                        }
                        Produto produto = new Produto(rst.getInt(15), rst.getString(16), rst.getDouble(17), rst.getInt(18), rst.getString(19), rst.getString(20));
                        ItemVenda item = new ItemVenda(rst.getInt(12), rst.getInt(13),rst.getBigDecimal(14), produto, rst.getInt(1));
                        anterior.adicionar(item);
                    }
                }
                return vendas;
            }
            
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }
    
    public static Venda save(Venda venda) throws ClassNotFoundException{
        
         try{
            String query = "insert into venda (data_venda, fk_id_cli) values (?,?)";
            
            try(PreparedStatement pstm = GerenciadorConexao.getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS)){
                
                pstm.setDate(1, new Date(venda.getData().getTime()));
                pstm.setInt(2, venda.getCliente().getId_cli());
                
                
                pstm.execute();
                
                try(ResultSet rst = pstm.getGeneratedKeys()){
                    while(rst.next()){
                        venda.setId(rst.getInt(1));
                    }
                }
               return venda;         
            }
            
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
        
    }
    
    
    
}
