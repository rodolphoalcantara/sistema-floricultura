/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.sistema.utils;

import br.com.floricultura.sistema.model.CadastroCliente;
import br.com.floricultura.sistema.model.EnderecoCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author aureliosantos
 */
public class EnderecoDAO {
    public static boolean salvar(EnderecoCliente edC)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
       
            conexao = GerenciadorConexao.getConnection();
            //conexao = GerenciadorConexao.abrirConexao();
            
            
            //Passo 3 - Executar uma instrução SQL
          
            instrucaoSQL = conexao.prepareStatement("INSERT INTO endereco (rua,numero,bairro,cidade,estado) VALUES(?, ?, ?, ?, ?)"
                                                    , Statement.RETURN_GENERATED_KEYS);
            
  
            instrucaoSQL.setString(1, edC.getRuaCliente());
            instrucaoSQL.setString(2, edC.getNumeroC());
            instrucaoSQL.setString(3, edC.getBairroCliente());
            instrucaoSQL.setString(4, edC.getCidadeCliente());
            instrucaoSQL.setString(5, edC.getEstadoCliente());
           
            
            
            //Executar a instrução SQL
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
                
                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                        edC.setId_end(generatedKeys.getInt(1));
                }
                else {
                    throw new SQLException("Falha ao obter o ID do cliente.");
                }
            }
            else{
                retorno = false;
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally{
            
            //Libero os recursos da memória
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
//                GerenciadorConexao.fecharConexao();
                conexao.close();
                
              } catch (SQLException ex) {
             }
        }
      
        return retorno;
    }
    
    
    public static ArrayList<EnderecoCliente> consultarEndereco() {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<EnderecoCliente> listaEndereco = new ArrayList<EnderecoCliente>();

        try {

            conexao = GerenciadorConexao.getConnection();

            instrucaoSQL = conexao.prepareStatement("SELECT * FROM Endereco;");

            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                EnderecoCliente c = new EnderecoCliente();
                
                c.setId_end(rs.getInt("id_end"));
               
                listaEndereco.add(c);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaEndereco = null;
        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                conexao.close();

            } catch (SQLException ex) {
            }
        }

        return listaEndereco;
    }
    
    
    
       public static ArrayList<EnderecoCliente> consultarClientePorCPF(int id) {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<EnderecoCliente> listaEndereco = new ArrayList<EnderecoCliente>();

        try {

            conexao = GerenciadorConexao.getConnection();

            instrucaoSQL = conexao.prepareStatement("SELECT * FROM endereco WHERE id_end = ?;");

            
            instrucaoSQL.setInt(1, id);
            
            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                EnderecoCliente c = new EnderecoCliente();
                c.setId_end(rs.getInt("id_end"));
               
                listaEndereco.add(c);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaEndereco = null;
        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                conexao.close();

            } catch (SQLException ex) {
            }
        }

        return listaEndereco;
    }
    
       
    public static boolean excluirEndereco(int id_end)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
              
            
            
            
                      
            conexao = GerenciadorConexao.getConnection();
            
            instrucaoSQL = conexao.prepareStatement("DELETE FROM endereco WHERE id_end = ?");
            
          
            instrucaoSQL.setInt(1, id_end);

            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
            }
            else{
                retorno = false;
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally{
            
            
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                                
                conexao.close();
                
              } catch (SQLException ex) {
             }
        }
        
        return retorno;
    }
    
}
