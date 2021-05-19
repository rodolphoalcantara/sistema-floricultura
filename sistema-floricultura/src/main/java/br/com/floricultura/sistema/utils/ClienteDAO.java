/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.sistema.utils;

import br.com.floricultura.sistema.model.CadastroCliente;
import br.com.floricultura.sistema.model.EnderecoCliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aureliosantos
 */
public class ClienteDAO {
    
     public static boolean salvar(CadastroCliente Cd, EnderecoCliente eC)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        
             
        try {
       
            conexao = GerenciadorConexao.getConnection();
            //conexao = GerenciadorConexao.abrirConexao();
            
            //Passo 3 - Executar uma instrução SQL
            instrucaoSQL = conexao.prepareStatement("INSERT INTO cliente (CPF,nome,email,estado_civil,data_nasc,sexo,fk_id_endereco) VALUES(?, ?, ?, ?, ?, ?, ?)"
                                                    , Statement.RETURN_GENERATED_KEYS);
            
  
            instrucaoSQL.setString(1, Cd.getCpfCliente());
            instrucaoSQL.setString(2, Cd.getNomeCliente());
            instrucaoSQL.setString(3, Cd.getEmailCliente());
            instrucaoSQL.setString(4, Cd.getEstadoCivil());
            instrucaoSQL.setString(5, Cd.getDataNascimento());
            instrucaoSQL.setString(6, Cd.getSexoCliente());
            instrucaoSQL.setInt(7, eC.getId_end());
            
            //Executar a instrução SQL
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
                
                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                        Cd.setId_cli(generatedKeys.getInt(1));
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

    
    
}
