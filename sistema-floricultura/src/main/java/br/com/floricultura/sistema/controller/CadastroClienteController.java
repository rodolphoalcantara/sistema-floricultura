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
import java.text.ParseException;
import java.util.ArrayList;

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
  
    public static boolean salvarCliente(String nomeCliente,String cpfCliente,String sexoCliente,String dataNascimento,String emailCliente,String estadoCivil,String telefone){
                                        
       String cpfNumeros = cpfCliente.replace(".", "").replace("-", "");
       String telefonenumeros = telefone.replace("(","").replace(")", "").replace("-", "");
      
        System.out.println(telefonenumeros);
       cadastraCli.setNomeCliente(nomeCliente);
       cadastraCli.setCpfCliente(cpfNumeros);
       cadastraCli.setSexoCliente(sexoCliente);
       cadastraCli.setDataNascimento(dataNascimento);
       cadastraCli.setEmailCliente(emailCliente);
       cadastraCli.setEstadoCivil(estadoCivil);
       cadastraCli.setTelefoneCliente(telefonenumeros);
   
        return ClienteDAO.salvar(cadastraCli , cadastraEnd);
    }
 
    public static ArrayList<CadastroCliente> consultarCliente (){
      
        ArrayList<CadastroCliente> consultaCli = ClienteDAO.consultarCliente();
        
        
        return consultaCli;
    }
    
    public static ArrayList<EnderecoCliente> consultarEndereco (){
      
        ArrayList<EnderecoCliente> consultaEnd =EnderecoDAO.consultarEndereco();
        
        
        return consultaEnd;
    }
    
    
    
        public static ArrayList<CadastroCliente> consultarPorCPF (String cpfPesquisa){
      
        ArrayList<CadastroCliente> consultaCli = ClienteDAO.consultarClientePorCPF(cpfPesquisa);
        
        
        return consultaCli;
    }
     
       public static ArrayList<EnderecoCliente> consultarEnderecoid (int id){
      
        ArrayList<EnderecoCliente> consultaEnd =EnderecoDAO.consultarEndereco();
        
        
        return consultaEnd;
    }
     
     
     
     public static boolean excluirCliente(int id_cli){
               
        return ClienteDAO.excluirCliente(id_cli);
     }
     
      public static boolean excluirEndereco(int id_end){
               
        return EnderecoDAO.excluirEndereco(id_end);
     }
}
