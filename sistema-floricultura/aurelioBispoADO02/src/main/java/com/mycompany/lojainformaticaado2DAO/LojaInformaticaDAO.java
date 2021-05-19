package com.mycompany.lojainformaticaado2DAO;

import com.mycompany.lojainformaticaado2.model.Computador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class LojaInformaticaDAO {
    
   public static String URL = "jdbc:mysql://localhost:3306/lojainformatica?useTimezone=true&serverTimezone=UTC&useSSL=false";   
   
   public static String login = "root";

    public static String senha = "";
    
    
    public static boolean salvar(Computador p){
        
    boolean retorno = false;

    Connection conexao = null;

    PreparedStatement instrucaoSQL = null;

    

    try {

      Class.forName("com.mysql.cj.jdbc.Driver");

      conexao = DriverManager.getConnection(URL, login, senha);

      instrucaoSQL = conexao.prepareStatement("INSERT INTO computador (marca,SO,HD,processador) VALUES(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

      instrucaoSQL.setString(1, p.getmarca());
      instrucaoSQL.setString(2, p.getSO());
      instrucaoSQL.setString(3, p.getHD());
      instrucaoSQL.setString(4, p.getProcessador());
   
      int linhasAfetadas = instrucaoSQL.executeUpdate();

     if(linhasAfetadas>0)

      {

        retorno = true;
        ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys();

       if (generatedKeys.next()) {

           p.setID_computador(generatedKeys.getInt(1));

       }else {

           throw new SQLException("Falha ao obter o ID do Computador.");

        }

      }else{

        retorno = false;

      }

    }catch (SQLException | ClassNotFoundException ex) {

      System.out.println(ex.getMessage());

      retorno = false;

    }finally{

     try {

        if(instrucaoSQL!=null)

          instrucaoSQL.close();

        conexao.close();


       } catch (SQLException ex) {

       }

    }

    return retorno;
        
 
    }
   
    
    public static boolean excluir(int pID)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
              
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
                      
            conexao = DriverManager.getConnection(URL, login, senha);
            
            instrucaoSQL = conexao.prepareStatement("DELETE FROM computador WHERE ID_computador = ?");
            
          
            instrucaoSQL.setInt(1, pID);

            
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
    
    public static ArrayList<Computador> consultarComputador(String marca)
    {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        ArrayList<Computador> listaComputadores = new ArrayList<Computador>();
        
        try {
            
           
            Class.forName("com.mysql.cj.jdbc.Driver");
                                  
            conexao = DriverManager.getConnection(URL, login, senha);
            
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM computador WHERE marca LIKE ?;");
            
            instrucaoSQL.setString(1,"%" + marca + '%' );

            rs = instrucaoSQL.executeQuery();
            
           
            while(rs.next())
            {
                Computador c = new Computador();
                c.setID_computador(rs.getInt("ID_computador"));
                c.setmarca(rs.getString("marca"));
                c.setSO(rs.getString("SO"));
                c.setHD(rs.getString("HD"));
                c.setProcessador(rs.getString("processador"));
                
              
                listaComputadores.add(c);
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaComputadores = null;
        } finally{
          
            try {
                if(rs!=null)
                    rs.close();                
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                conexao.close();
               
                        
              } catch (SQLException ex) {
             }
        }
        
        return listaComputadores;
    }
    
     public static boolean editar(Computador p) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
  
           
            Class.forName("com.mysql.cj.jdbc.Driver");
                                             
            conexao = DriverManager.getConnection(URL, login, senha);
            
            instrucaoSQL = conexao.prepareStatement("UPDATE computador SET SO = ?, marca=?, HD=?,processador=? WHERE ID_computador =? ");
          
            
            
            instrucaoSQL.setString(1, p.getSO());
            instrucaoSQL.setString(2, p.getmarca());
            instrucaoSQL.setString(3, p.getHD());
            instrucaoSQL.setString(4, p.getProcessador());
            instrucaoSQL.setInt(5, p.getID_computador());
            
           
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

   

