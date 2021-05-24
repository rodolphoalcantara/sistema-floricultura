
package br.com.floricultura.sistema.model;

import java.math.BigDecimal;

/**
 * Classe modelo de um ItemVenda
 * @see CadastroCliente 
 * @see EnderecoCliente 
 * @see Produto 
 * @see Relatorio
 * @see Venda
 * @author rodolpho
 */
public class ItemVenda {
    
    private int id;
    private int quantidade;
    private BigDecimal valorTotal; 
    private Produto produto;
    private int fk_id_venda;

    public ItemVenda(int id, int quantidade, BigDecimal valorTotal, Produto produto, int fk_id_venda) {
        this.id = id;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        this.produto = produto;
        this.fk_id_venda = fk_id_venda;
    }

    public ItemVenda(int quantidade, BigDecimal valorTotal, Produto produto, int fk_id_venda) {
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        this.produto = produto;
        this.fk_id_venda = fk_id_venda;
    }

    public ItemVenda(int quantidade, BigDecimal valorTotal, Produto produto) {
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        this.produto = produto;
    }
    
    
    
    public ItemVenda() {
    }
   
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getFk_id_venda() {
        return fk_id_venda;
    }

    public void setFk_id_venda(int fk_id_venda) {
        this.fk_id_venda = fk_id_venda;
    }
        
}
