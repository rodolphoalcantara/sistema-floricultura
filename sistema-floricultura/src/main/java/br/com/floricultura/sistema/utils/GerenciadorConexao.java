/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.sistema.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rodolpho
 */
public class GerenciadorConexao {
    public static String STATUS = "Não conectado";
    public static String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static String SERVER = "localhost";
    public static String DATABASE = "sistema_floricultura";
    public static String LOGIN = "root";
    public static String SENHA = "root"; //senha da minha conexao com mysql. Favor alterar
    public static String URL = "";
    public static Connection CONEXAO;

    public GerenciadorConexao() {
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        URL = "jdbc:mysql://" + SERVER + ":3306/" + DATABASE + "?useTimezone=true&serverTimezone=UTC&useSSL=false";

        if (CONEXAO == null) {

            try {
                Class.forName(DRIVER);

                CONEXAO = DriverManager.getConnection(URL, LOGIN, SENHA);

                if (CONEXAO != null) {
                    STATUS = "Conexão bem sucedida";
                } else {
                    STATUS = "Não foi possível realizar a conexão";
                }

            } catch (ClassNotFoundException e) {
                throw new ClassNotFoundException("O driver expecificado nao foi encontrado.");
            } catch (SQLException e) {
                throw new SQLException("Erro ao estabelecer a conexão (Ex: login ou senha incorretos).");
            }

        } else {
            try {
                if (CONEXAO.isClosed()) {
                    CONEXAO = DriverManager.getConnection(URL, LOGIN, SENHA);
                }
            } catch (SQLException ex) {
                throw new SQLException("Falha ao fechar a conexão.");
            }
        }
        return CONEXAO;
    }

    public static String getStatus() {
        return STATUS;
    }

    public static Boolean closeConnection() throws SQLException {
        Boolean success = false;

        try {
            if (CONEXAO != null) {
                if (!CONEXAO.isClosed()) {
                    CONEXAO.close();
                }
            }

            STATUS = "Não conectado";
            success = true;

        } catch (SQLException e) {
            success = false;
        }

        return success;
    }

}
