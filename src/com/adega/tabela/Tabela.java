package com.adega.tabela;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.adega.jdbc.ConnectionFactory;

public class Tabela {
	Connection conexao = new ConnectionFactory().getConnection();
	public void criaTabelaVinho(){
		String sql = "create table vinho("
                                + "id serial primary key not null,"
				+ "nome varchar(100) not null,"
				+ "fabricante varchar(100) not null,"
				+ "ano  varchar(100) not null,"
				+ "acucarado varchar(100) not null,"
				+ "aroma varchar(100) not null,"
				+ "preco varchar(100) not null);";
		
		try {
			PreparedStatement st = conexao.prepareStatement(sql);
			
			st.execute();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void criaTabelaRefeicao(){
		String sql = "create table refeicao(idrefeicao serial primary key not null,"
				+ "nome varchar(100) not null,"
				+ "descricao varchar(100) not null,"
				+ "nome_vinho varchar(100) not null);";
		
		try {
			PreparedStatement st = conexao.prepareStatement(sql);
			
			st.execute();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
