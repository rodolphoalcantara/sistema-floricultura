/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.sistema.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Classe modelo de uma Venda
 * @see CadastroCliente 
 * @see EnderecoCliente 
 * @see Produto 
 * @see Relatorio
 * @see ItemVenda
 * @author rodolpho
 */
public class Venda {

    private int id;
    private CadastroCliente cliente;
    private Date data;
    private List<ItemVenda> itens;

    public Venda(){
       itens = new ArrayList<ItemVenda>(); 
    }
    
    public Venda(CadastroCliente cliente, Date data){
        this.cliente = cliente;
        this.data = data;
        itens = new ArrayList<ItemVenda>();
    }
    
    
    public void adicionar(ItemVenda item){
        itens.add(item);
    }
    
    public List<ItemVenda> getItens() {
        return itens;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CadastroCliente getCliente() {
        return cliente;
    }

    public void setCliente(CadastroCliente cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
