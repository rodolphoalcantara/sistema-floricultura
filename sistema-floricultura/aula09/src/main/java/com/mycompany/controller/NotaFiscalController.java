/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.model.NotaFiscal;
import com.mycompany.DAO.NotaFiscalDAO;

/**
 *
 * @author aureliosantos
 */
public class NotaFiscalController {
    
    
    public static boolean salvar ( int numeroNF, double valorNF){
        NotaFiscal nota = new NotaFiscal();
        nota.setNumeroNF(numeroNF);
        nota.setValorNF(valorNF);
        
        NotaFiscalDAO.salvar(nota);
        
        
        return false;
    }
    
}
