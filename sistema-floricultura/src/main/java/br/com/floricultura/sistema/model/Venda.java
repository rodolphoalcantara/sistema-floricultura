/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.sistema.model;

import java.time.LocalDateTime;
import java.util.List;


public class Venda {
    
    private Cliente cliente;
    private List<Produto> produtos;
    private LocalDateTime data;
}
