package br.com.floricultura.sistema.model;

/**
 *Metodos gueters e setters e metodos de endereco para o setar os valores na model
 * @author aureliosantos
 */
public class EnderecoCliente {
    int id_end;
    String ruaCliente, numeroC, bairroCliente, cidadeCliente, estadoCliente;

    public EnderecoCliente() {
       
    }
    public void setId_end(int id_end) {
        this.id_end = id_end;
    }

    public void setRuaCliente(String ruaCliente) {
        this.ruaCliente = ruaCliente;
    }

    public void setNumeroC(String numeroC) {
        this.numeroC = numeroC;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    public int getId_end() {
        return id_end;
    }

    public String getRuaCliente() {
        return ruaCliente;
    }

    public String getNumeroC() {
        return numeroC;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }
    
    public EnderecoCliente(String ruaCliente,String numeroC, String bairroCliente, String cidadeCliente, String estadoCliente){
        
       
        this.ruaCliente = ruaCliente;
        this.numeroC = numeroC;
        this.bairroCliente = bairroCliente;
        this.cidadeCliente = cidadeCliente;
        this.estadoCliente = estadoCliente;
        
    }
    
    
    
}
