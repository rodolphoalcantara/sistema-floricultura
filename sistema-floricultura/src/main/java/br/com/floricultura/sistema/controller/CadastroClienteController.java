/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.sistema.controller;

import br.com.floricultura.sistema.model.CadastroCliente;
import br.com.floricultura.sistema.model.EnderecoCliente;
import br.com.floricultura.sistema.utils.ClienteDAO;
import br.com.floricultura.sistema.utils.EnderecoDAO;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

/**
 *
 * @author aureliosantos
 */
public class CadastroClienteController {
    
  public static CadastroCliente cadastraCli = new CadastroCliente();
  public static EnderecoCliente cadastraEnd = new EnderecoCliente();
  
  public static boolean SalvarEndereco( String ruaCliente,String numeroC,String bairroCliente,String cidadeCliente,String estadoCliente){
      
      cadastraEnd.setRuaCliente(ruaCliente);
      cadastraEnd.setNumeroC(numeroC);
      cadastraEnd.setBairroCliente(bairroCliente);
      cadastraEnd.setCidadeCliente(cidadeCliente);
      cadastraEnd.setEstadoCliente(estadoCliente);
      
      
      return EnderecoDAO.salvar(cadastraEnd);
  }
  
    public static boolean salvarCliente(String nomeCliente,String cpfCliente,String sexoCliente,String dataNascimento,String emailCliente,String estadoCivil){
                                        
       String cpfNumeros = cpfCliente.replace(".", "").replace("-", "");
     
       cadastraCli.setNomeCliente(nomeCliente);
       cadastraCli.setCpfCliente(cpfNumeros);
       cadastraCli.setSexoCliente(sexoCliente);
       cadastraCli.setDataNascimento(dataNascimento);
       cadastraCli.setEmailCliente(emailCliente);
       cadastraCli.setEstadoCivil(estadoCivil);
   
        return ClienteDAO.salvar(cadastraCli , cadastraEnd);
    }
    
}
