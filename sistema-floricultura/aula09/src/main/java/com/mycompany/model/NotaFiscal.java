/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

/**
 *
 * @author aureliosantos
 */
public class NotaFiscal {
    
    private int idNota;
    private int numeroNF;
    private double valorNF;

    public NotaFiscal() {
    }
    
    public NotaFiscal(int idNota,int numeroNF,double valorNota){
        this.idNota = idNota;
        this.numeroNF = numeroNF;
        this.valorNF = valorNota;
    }

    public int getIdNota() {
        return idNota;
    }

    public int getNumeroNF() {
        return numeroNF;
    }

    public double getValorNF() {
        return valorNF;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public void setNumeroNF(int numeroNF) {
        this.numeroNF = numeroNF;
    }

    public void setValorNF(double valorNF) {
        this.valorNF = valorNF;
    }
    
    
 
   
    
}
