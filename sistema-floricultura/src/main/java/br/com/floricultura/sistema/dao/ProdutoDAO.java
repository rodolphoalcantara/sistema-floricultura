/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.sistema.dao;

import br.com.floricultura.sistema.model.Produto;
import br.com.floricultura.sistema.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author gesouza
 */
public class ProdutoDAO {
    
       public static boolean salvar(Produto p) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            //Passo 1
            //Class.forName("com.mysql.cj.jdbc.Driver");

            //conexao = DriverManager.getConnection(GerenciadorConexao.URL, "root", "");
            conexao = GerenciadorConexao.getConnection();
            //conexao = GerenciadorConexao.abrirConexao();

            //Passo 3 - Executar uma instrução SQL
            instrucaoSQL = conexao.prepareStatement("INSERT INTO produto (nome,valor_unitario,estoque,descricao,tipo) VALUES(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, p.getNome());
            instrucaoSQL.setDouble(2, p.getValor());
            instrucaoSQL.setInt(3, p.getEstoque());
            instrucaoSQL.setString(4, p.getDescricao());
            instrucaoSQL.setString(5, p.getTipo());

            //Executar a instrução SQL
            retorno = instrucaoSQL.execute();
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
            retorno = false;
        } finally {
            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                conexao.close();
//              GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex.getMessage());
            }
        }

        return retorno;
    }

    public static boolean atualizar(Produto p) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            conexao = GerenciadorConexao.getConnection();

            instrucaoSQL = conexao.prepareStatement("UPDATE produto SET nome = ?, valor_unitario=?,estoque=?,tipo=?,descricao=? WHERE id_produto =?");

            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setInt(6, p.getId());
            instrucaoSQL.setString(1, p.getNome());
            instrucaoSQL.setDouble(2, p.getValor());
            instrucaoSQL.setInt(3, p.getEstoque());
            instrucaoSQL.setString(4, p.getTipo());
            instrucaoSQL.setString(5, p.getDescricao());
            

            //Mando executar a instrução SQL
            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                //GerenciadorConexao.fecharConexao();
                conexao.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return retorno;
    }

    public static boolean excluir(int pID) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            conexao = GerenciadorConexao.getConnection();

            instrucaoSQL = conexao.prepareStatement("DELETE FROM produto WHERE id_produto = ?");

            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setInt(1, pID);

            //Mando executar a instrução SQL
            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                //GerenciadorConexao.fecharConexao();
                conexao.close();

            } catch (SQLException ex) {
            }
        }

        return retorno;
    }

    public static ArrayList<Produto> consultarProduto() {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        //Armazeno as informaçoes da tabela (resultSet) em um ArrayList
        ArrayList<Produto> listaProduto = new ArrayList<>();

        try {

           conexao = GerenciadorConexao.getConnection();

            //Passo 3 - Executo a instrução SQL
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto;");

            //Executa a Query (Consulta) - Retorna um objeto da classe ResultSet
            rs = instrucaoSQL.executeQuery();

            //Percorrer o resultSet
            while (rs.next()) {
                Produto c = new Produto();
                c.setId(rs.getInt("id_produto"));
                c.setNome(rs.getString("nome"));
                c.setValor(rs.getDouble("valor_unitario"));
                c.setEstoque(rs.getInt("estoque"));
                c.setTipo(rs.getString("tipo"));
                c.setDescricao(rs.getString("descricao"));

                //Adiciono na listaClientes
                System.out.println(" teste: "+c.toString());
                listaProduto.add(c);
            }
               
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaProduto = null;
        } finally {
            //Libero os recursos da memória
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                conexao.close();
                //GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }

        return listaProduto;
    }

    public static ArrayList<Produto> consultarProduto(String pNome) {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<Produto> listaProduto = new ArrayList<Produto>();

        try {

            conexao = GerenciadorConexao.getConnection();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE nome LIKE ?;");

            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, "%" + pNome + '%');

            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                Produto c = new Produto();
                c.setId(rs.getInt("id_produto"));
                c.setNome(rs.getString("nome"));
                c.setValor(rs.getDouble("valor_unitario"));
                c.setEstoque(rs.getInt("estoque"));
                c.setTipo(rs.getString("tipo"));
                c.setDescricao(rs.getString("descricao"));
                listaProduto.add(c);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaProduto = null;
        } finally {
            //Libero os recursos da memória
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                GerenciadorConexao.closeConnection();

            } catch (SQLException ex) {
            }
        }

        return listaProduto;
    }
    
    public static ArrayList<Produto> listarPorTipo(String tipo) {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<Produto> listaProduto = new ArrayList<Produto>();

        try {

            conexao = GerenciadorConexao.getConnection();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE tipo LIKE ?;");

            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, "%" + tipo + '%');

            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                Produto c = new Produto();
                c.setId(rs.getInt("id_produto"));
                c.setNome(rs.getString("nome"));
                c.setValor(rs.getDouble("valor_unitario"));
                c.setEstoque(rs.getInt("estoque"));
                c.setTipo(rs.getString("tipo"));
                c.setDescricao(rs.getString("descricao"));
                listaProduto.add(c);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaProduto = null;
        } finally {
            //Libero os recursos da memória
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                GerenciadorConexao.closeConnection();

            } catch (SQLException ex) {
            }
        }

        return listaProduto;
    }
    
    public static ArrayList<String> listarTipos() {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<String> listaTipos = new ArrayList<String>();

        try {

            conexao = GerenciadorConexao.getConnection();
            instrucaoSQL = conexao.prepareStatement("SELECT tipo FROM produto group by tipo");


            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                listaTipos.add(rs.getString("tipo"));
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaTipos = null;
        } finally {
            //Libero os recursos da memória
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                GerenciadorConexao.closeConnection();

            } catch (SQLException ex) {
            }
        }

        return listaTipos;
    }
        
}
    
    
    
    
