package br.com.floricultura.sistema.model;

import java.awt.Color;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author aureliosantos
 */
public class CadastroCliente {

    private String cpfCliente, nomeCliente, sexoCliente, emailCliente, estadoCivil, 
                   tipotelefone,telefoneCliente, dataNascimento;
    
    private int id_cli;

    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        this.id_cli = id_cli;
    }

    public CadastroCliente() {
        
    }
    
    public String getCpfCliente() {
        return cpfCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getSexoCliente() {
        return sexoCliente;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getTipotelefone() {
        return tipotelefone;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSexoCliente(String sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setTipotelefone(String tipotelefone) {
        this.tipotelefone = tipotelefone;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }
    
    
    public CadastroCliente(String nomeCliente,String cpfCliente,String sexoCliente,
            String dataNascimento,String emailCliente,String estadoCivil,String ruaCliente,String numeroC,
    String bairroCliente,String cidadeCliente,String estadoCliente,String tipotelefone,String telefoneCliente){
        
      this.cpfCliente = cpfCliente;
      this.nomeCliente = nomeCliente;
      this.sexoCliente = sexoCliente;
      this.emailCliente = emailCliente; 
      this.dataNascimento = dataNascimento;
      this.estadoCivil = estadoCivil;
      this.tipotelefone = tipotelefone;
      this.telefoneCliente = telefoneCliente;
      
    }
        
        
    
    
    
 
    
    
}
