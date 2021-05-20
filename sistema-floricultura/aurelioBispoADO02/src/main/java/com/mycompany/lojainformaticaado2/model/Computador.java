/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lojainformaticaado2.model;

/**
 *
 * @author aureliosantos
 */
public class Computador {
    
   private int ID_computador; 
   private static String marca =  "Aurélio Bispo";
   private String HD;
   private String processador;
   private String SO;

    public Computador() {
        
    }

   public void setmarca(String marca){
       
       this.marca =  marca ;
   }
    
    public String getmarca(){
        return marca;
    }

    public void setHD(String HD) {
        this.HD = HD;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public String getHD() {
        return HD;
    }

    public String getProcessador() {
        return processador;
    }

    public String getSO() {
        return SO;
    }
    public void setID_computador(int ID_computador) {
        this.ID_computador = ID_computador;
    }

    public int getID_computador() {
        return ID_computador;
    }
    public Computador(String marca,String SO, String tamanhohd , String processador){
        
        this.marca = marca;
        this.SO = SO;
        this.HD = tamanhohd;
        this.processador = processador;
    }
    

    
}
