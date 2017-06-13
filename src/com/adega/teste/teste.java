package com.adega.teste;

import com.adega.dao.VinhoDao;
import com.adega.modelo.Vinho;
import com.adega.tabela.Tabela;

public class teste {
	public static void main(String[] args) {
		Vinho vinho = new Vinho("Gato Negro", "11/11/2011", "aurora", "2010", "tinto", "vermelho");
		VinhoDao dao = new VinhoDao();
		
		//System.out.println("Adicionado com sucesso");
		//VinhoDao vinho2 = new VinhoDao();
		//Vinho vinho2 = new Vinho(1,"Sangue de vaca", "10/10/2005", "italac", "2005", "tinto", "roxo", "muito bom");
		
		//dao.alteraVinho(vinho2);
		//dao.removeVinho("1");
		//System.out.println("removido com sucesso");
                Tabela tabela = new Tabela();
                tabela.criaTabelaVinho();
                tabela.criaTabelaRefeicao();
                
                dao.adicionaVinho(vinho);
	}
	
}
