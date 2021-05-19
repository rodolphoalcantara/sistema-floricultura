/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lojainfromaticaMain;

import com.mycompany.lojainformaticaado2Views.LojaInformaticaView;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.time.LocalDate;
import java.time.Month;


/**
 *
 * @author aureliosantos
 */
public class Main {
    public static void main(String[] args)  {

     String data = "10/10/2010";
             
      String dataVet [] = data.split("/");
     
        LocalDate dataFormatada = LocalDate.of(Integer.parseInt(dataVet[2]), Integer.parseInt(dataVet[1]),Integer.parseInt(dataVet[0]));
        
        
        System.out.println(dataFormatada);
    }
    
}
