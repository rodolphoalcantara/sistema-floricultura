/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DAO;

import com.mycompany.model.NotaFiscal;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.Statement;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;


/**
 *
 * @author aureliosantos
 */
public class NotaFiscalDAO {
    
    public static String URL = "jdbc:mysql://localhost:3306/basenotafiscal?useTimezone=true&serverTimezone=UTC&useSSL=false";

    public static String login = "root";

    public static String senha = "";
    
    
    public static boolean salvar(NotaFiscal p){
        
        boolean retorno = false;

        Connection conexao = null;

        PreparedStatement instrucaoSQL = null;


    try {

       

      Class.forName("com.mysql.cj.jdbc.Driver");

       

      //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão

      conexao = DriverManager.getConnection(URL, login, senha);

       

      instrucaoSQL = conexao.prepareStatement("INSERT INTO NotaFiscal (numeroNF,ValorNF) VALUES(?, ?)", Statement.RETURN_GENERATED_KEYS); //Caso queira retornar o ID

       

      //Adiciono os parâmetros ao meu comando SQL

      instrucaoSQL.setInt(1, p.getNumeroNF());

      instrucaoSQL.setDouble(2, p.getValorNF());

       

      int linhasAfetadas = instrucaoSQL.executeUpdate();

       

      if(linhasAfetadas>0)

      {

        retorno = true;

         

        ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente

        if (generatedKeys.next()) {

            p.setIdNota(generatedKeys.getInt(1));

        }else {

            throw new SQLException("Falha ao obter o ID da Nota Fiscal!.");

        }

      }else{

        retorno = false;

      }

    }catch (SQLException | ClassNotFoundException ex) {



      System.out.println(ex.getMessage());

      retorno = false;

    }finally{

       

      //Libero os recursos da memória

      try {

        if(instrucaoSQL!=null)

          instrucaoSQL.close();

         

        conexao.close();

//        GerenciadorConexao.fecharConexao();

         

       } catch (SQLException ex) {

       }

    }

     

    return retorno;
        
       
        
        
   
    }
    
    
    public static NotaFiscal consultarPorID(int pID){

   

    NotaFiscal retorno = null;

    Connection conexao = null;

    PreparedStatement instrucaoSQL = null;

    ResultSet rs = null;

     

         

    try {

       

      Class.forName("com.mysql.cj.jdbc.Driver");

       

      //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão

      conexao = DriverManager.getConnection(URL, login, senha);

       

      instrucaoSQL = conexao.prepareStatement("SELECT * FROM NotaFiscal WHERE idNota=?");

       

      //Adiciono os parâmetros ao meu comando SQL

      instrucaoSQL.setInt(1, pID);

       

      rs = instrucaoSQL.executeQuery();

       

      while(rs.next()){

        retorno.setIdNota(rs.getInt("idNota"));

        retorno.setNumeroNota(rs.getInt("numeroNota"));

        retorno.setValorNota(rs.getDouble("valorNota"));

      }

       

    }catch (SQLException | ClassNotFoundException ex) {



      System.out.println(ex.getMessage());

      retorno = null;

    }finally{

       

      //Libero os recursos da memória

      try {

        if(instrucaoSQL!=null)

          instrucaoSQL.close();

         

        conexao.close();

//        GerenciadorConexao.fecharConexao();

         

       } catch (SQLException ex) {

       }

    }

     

     

    return retorno;

  }
    
}
