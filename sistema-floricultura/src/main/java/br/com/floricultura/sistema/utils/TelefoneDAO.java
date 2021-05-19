/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.sistema.utils;


import br.com.floricultura.sistema.model.TelefoneCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aureliosantos
 */
public class TelefoneDAO {
    
    public static boolean salvarTelefone(TelefoneCliente tC)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
       
            conexao = GerenciadorConexao.getConnection();
            //conexao = GerenciadorConexao.abrirConexao();
            
            
            //Passo 3 - Executar uma instrução SQL
          
            instrucaoSQL = conexao.prepareStatement("INSERT INTO Telefone (tipo, NumeroTelefone) VALUES(?, ?)"
                                                    , Statement.RETURN_GENERATED_KEYS);
            
  
            instrucaoSQL.setString(1, tC.getTipotelefone());
            instrucaoSQL.setString(2, tC.getTelefoneCliente());
         
           
            
            
            //Executar a instrução SQL
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
                
                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                        tC.setId_tel(generatedKeys.getInt(1));
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
