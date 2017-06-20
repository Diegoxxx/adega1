/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adega.teste;

import com.adega.tabela.Tabela;

/**
 *
 * @author Diego
 */
public class CriarTabelasBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Tabela tabela = new Tabela();
                
        tabela.criaTabelaVinho();
        tabela.criaTabelaRefeicao();
        
    }
    
}
