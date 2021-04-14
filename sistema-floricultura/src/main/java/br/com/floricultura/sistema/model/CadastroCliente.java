package br.com.floricultura.sistema.model;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author aureliosantos
 */
public class CadastroCliente {

    private String cpfCliente, nomeCliente, sexoCliente, dataNascimento, emailCliente, estadoCivil, ruaCliente, numeroC, bairroCliente, cidadeCliente, estadoCliente;

    public void setRuaCliente(String rua) {
        this.ruaCliente = rua;
    }

    public void setNumeroC(String numero) {
        this.numeroC = numero;
    }

    public void setBairroCliente(String bairro) {
        this.bairroCliente = bairro;
    }

    public void setCidadeCliente(String cidade) {
        this.cidadeCliente = cidade;
    }

    public void setEstadoCliente(String estado) {
        this.estadoCliente = estado;
    }

    public void setNomeCliente(String nome) {
        this.nomeCliente = nome;
    }

    public void setSexoCliente(String sexo) {
        this.sexoCliente = sexo;
    }

    public void setDataNascimento(String data) {
        this.dataNascimento = data;

    }
   
    public void setcpfCliente(String CPF) {
        this.cpfCliente = CPF;
       }
 

    public void setestadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setemailCliente(String email) {
        this.emailCliente = email;
    }

   

    
}
