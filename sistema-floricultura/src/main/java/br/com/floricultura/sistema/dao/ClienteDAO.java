/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.sistema.dao;

import br.com.floricultura.sistema.model.CadastroCliente;
import br.com.floricultura.sistema.model.EnderecoCliente;
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
 * @author aureliosantos
 */
public class ClienteDAO {

    public static boolean salvar(CadastroCliente Cd, EnderecoCliente eC) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            conexao = GerenciadorConexao.getConnection();
            //conexao = GerenciadorConexao.abrirConexao();

            //Executar uma instrução SQL
            instrucaoSQL = conexao.prepareStatement("INSERT INTO cliente (CPF,nome,email,estado_civil,data_nasc,sexo,Telefone,fk_id_endereco) VALUES(?, ?, ?, ?, ?, ?, ?, ?)",
                     Statement.RETURN_GENERATED_KEYS);

            instrucaoSQL.setString(1, Cd.getCpfCliente());
            instrucaoSQL.setString(2, Cd.getNomeCliente());
            instrucaoSQL.setString(3, Cd.getEmailCliente());
            instrucaoSQL.setString(4, Cd.getEstadoCivil());
            instrucaoSQL.setString(5, Cd.getDataNascimento());
            instrucaoSQL.setString(6, Cd.getSexoCliente());
            instrucaoSQL.setString(7, Cd.getTelefoneCliente());
            instrucaoSQL.setInt(8, eC.getId_end());

            //Executar a instrução SQL
            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                    Cd.setId_cli(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Falha ao obter o ID do cliente.");
                }
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

//                GerenciadorConexao.fecharConexao();
                conexao.close();

            } catch (SQLException ex) {
            }
        }

        return retorno;
    }

    public static ArrayList<CadastroCliente> consultarCliente() {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<CadastroCliente> listaClientes = new ArrayList<CadastroCliente>();

        try {

            conexao = GerenciadorConexao.getConnection();

            instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente;");

            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                CadastroCliente c = new CadastroCliente();
                c.setId_cli(rs.getInt("id_cli"));
                c.setNomeCliente(rs.getString("nome"));
                c.setCpfCliente(rs.getString("CPF"));
                c.setEmailCliente(rs.getString("email"));
                c.setFk_id_endereco(rs.getInt("fk_id_endereco"));

                listaClientes.add(c);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaClientes = null;
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

        return listaClientes;
    }
    
    
    
       public static ArrayList<CadastroCliente> consultarClientePorCPF(String cpfPesquisa ) {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<CadastroCliente> listaClientes = new ArrayList<CadastroCliente>();

        try {

            conexao = GerenciadorConexao.getConnection();

            instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente WHERE CPF  LIKE ?;");

            
            instrucaoSQL.setString(1,"%"+cpfPesquisa+"%");
            
            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                CadastroCliente c = new CadastroCliente();
                c.setId_cli(rs.getInt("id_cli"));
                c.setNomeCliente(rs.getString("nome"));
                c.setCpfCliente(rs.getString("CPF"));
                c.setEmailCliente(rs.getString("email"));
                c.setFk_id_endereco(rs.getInt("fk_id_endereco"));

                listaClientes.add(c);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaClientes = null;
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

        return listaClientes;
    }
       
       
       public static boolean excluirCliente(int id_cli)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
              
            
            
            
                      
            conexao = GerenciadorConexao.getConnection();
            
            instrucaoSQL = conexao.prepareStatement("DELETE FROM cliente WHERE id_cli = ?");
            
          
            instrucaoSQL.setInt(1, id_cli);

            
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
       
       
       public static boolean atualizarCliente(CadastroCliente aC)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
          
                       
            conexao = GerenciadorConexao.getConnection();
            
            instrucaoSQL = conexao.prepareStatement("UPDATE cliente SET CPF = ?, nome=?, email=?, estado_civil=?, data_nasc=?, sexo=?, Telefone=? WHERE id_cli =?");
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, aC.getCpfCliente());
            instrucaoSQL.setString(2, aC.getNomeCliente());
            instrucaoSQL.setString(3, aC.getEmailCliente());
            instrucaoSQL.setString(4, aC.getEstadoCivil());
            instrucaoSQL.setString(5, aC.getDataNascimento());
            instrucaoSQL.setString(6, aC.getSexoCliente());
            instrucaoSQL.setString(7, aC.getTelefoneCliente());
            instrucaoSQL.setInt(8, aC.getId_cli());
            
            
            //Mando executar a instrução SQL
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
            
            //Libero os recursos da memória
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                //GerenciadorConexao.fecharConexao();
                conexao.close();
                
              } catch (SQLException ex) {
             }
        }
        
        return retorno;
    }

}
