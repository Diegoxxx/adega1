package com.adega.teste;

import com.adega.dao.RefeicaoDao;
import com.adega.dao.VinhoDao;
import com.adega.modelo.Refeicao;
import com.adega.modelo.Vinho;
import com.adega.tabela.Tabela;

public class teste {
	public static void main(String[] args) {
		Vinho vinho;
		VinhoDao dao = new VinhoDao();
                
                Refeicao refei;
                RefeicaoDao addRef = new RefeicaoDao();
		
		
		//VinhoDao vinho2 = new VinhoDao();
		//Vinho vinho2 = new Vinho(1,"Sangue de vaca", "10/10/2005", "italac", "2005", "tinto", "roxo", "muito bom");
		
		//dao.alteraVinho(vinho2);
		//dao.removeVinho("1");
		
                Tabela tabela = new Tabela();
                //tabela.criaTabelaVinho();
                //tabela.criaTabelaRefeicao();
                
                vinho = new Vinho("Gato Negro", "Vinhos Burgues", "2015", "Medio", "citrico", "25,00");
                dao.adicionaVinho(vinho);
                vinho = new Vinho("Black Cat", "Aurora", "1995", "Moderado", "amadeirado", "45,00");
                dao.adicionaVinho(vinho);
                vinho = new Vinho("Sangue de Boi", "Italac", "2000", "Doce", "doce", "85,00");
                dao.adicionaVinho(vinho);
                vinho = new Vinho("Digestivo Padrão", "Nestle", "2016", "Amargo", "forte", "20,00");
                dao.adicionaVinho(vinho);
                
                refei = new Refeicao("Caviar", "De bacalhau", "Gato Negro");
                addRef.adicionaRefeicao(refei);
                refei = new Refeicao("Escargot", "Ostras ao molho xadrez", "Black Cat");
                addRef.adicionaRefeicao(refei);
                refei = new Refeicao(" Vitela ao Porto", "Carne de vitela macia e suculenta.", "Sangue de Boi");
                addRef.adicionaRefeicao(refei);
                refei = new Refeicao("Magret de pato", "Ao perfume de mel e especiarias.", "Digestivo Padrão");
                addRef.adicionaRefeicao(refei);
	}
	
}
