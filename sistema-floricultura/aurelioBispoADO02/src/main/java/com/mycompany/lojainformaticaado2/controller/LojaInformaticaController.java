/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lojainformaticaado2.controller;

import com.mycompany.lojainformaticaado2.model.Computador;
import com.mycompany.lojainformaticaado2DAO.LojaInformaticaDAO;

/**
 *
 * @author aureliosantos
 */
public class LojaInformaticaController {
    public static Computador comp = new Computador();
    
    public static boolean salvar(String marca, String SO, String tamanhohd , String processador ){
       
        comp.setmarca(marca);
        comp.setSO(SO);
        comp.setProcessador(processador);
        comp.setHD(tamanhohd);
       
       return  LojaInformaticaDAO.salvar(comp);
        
       
    }
    
    
    public static boolean excluir(int ID_computador ){
                 
        comp.setID_computador(ID_computador);
       
        return  LojaInformaticaDAO.excluir(comp.getID_computador());
        
       
    }
    
    public static boolean editar(int ID_computador, String marca, String SO, String tamanhohd , String processador){
         
        comp.setID_computador(ID_computador);
        comp.setmarca(marca);
        comp.setSO(SO);
        comp.setProcessador(processador);
        comp.setHD(tamanhohd);
        
        return LojaInformaticaDAO.editar(comp);
    }
    
    
}
