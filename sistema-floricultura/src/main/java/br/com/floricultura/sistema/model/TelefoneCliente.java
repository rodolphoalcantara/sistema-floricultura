/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.sistema.model;

/**
 *
 * @author aureliosantos
 */
public class TelefoneCliente {
     int id_tel;
     String tipotelefone, telefoneCliente;

    public void setId_tel(int id_tel) {
        this.id_tel = id_tel;
    }

    public void setTipotelefone(String tipotelefone) {
        this.tipotelefone = tipotelefone;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public int getId_tel() {
        return id_tel;
    }

    public String getTipotelefone() {
        return tipotelefone;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }
    
    public TelefoneCliente(String tipotelefone, String telefoneCliente){
        
        this.tipotelefone = tipotelefone;
        this.telefoneCliente = this.telefoneCliente;
    }
}
