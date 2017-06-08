package com.adega.dao;

import java.sql.Connection;
//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.adega.jdbc.ConnectionFactory;
import com.adega.modelo.Refeicao;
import com.adega.modelo.Vinho;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RefeicaoDao {
	Connection conexao = new ConnectionFactory().getConnection();
	
	
	public void adicionaRefeicao(Refeicao refeicao){
		String sql = "insert into refeicao (nome,descricao,nome_vinho)" +
				"values(?,?,?)";
		
		try {
			PreparedStatement st = conexao.prepareStatement(sql);
			
			st.setString(1, refeicao.getNome());
			st.setString(2, refeicao.getDescricao());
			st.setString(3, refeicao.getNome_Vinho());
			
			st.execute();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void alteraRefeicao(Refeicao refeicao){
		String sql = "update refeicao set nome=?,descricao=?,nome_vinho=? where nome=?";
		
		try {
			PreparedStatement st = conexao.prepareStatement(sql);
			
			st.setString(1, refeicao.getNome());
			st.setString(2, refeicao.getDescricao());
			st.setString(3, refeicao.getNome_Vinho());
			st.setString(4, refeicao.getNome());
			
			st.execute();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void removeRefeicao(String refeicao){
		String sql = "delete from refeicao where nome=?";
		
		try {
			PreparedStatement st = conexao.prepareStatement(sql);

			st.setString(1, refeicao);

			st.execute();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Refeicao> getRefeicoes(){
		List<Refeicao> refeicoes = new ArrayList<Refeicao>();
		String sql = "select * from refeicao";
		PreparedStatement st;
		try {
			st = conexao.prepareStatement(sql);
			ResultSet result = st.executeQuery();
			while (result.next()){
				Refeicao refeicao = new Refeicao();
				refeicao.setIdRefeicao(result.getInt("idrefeicao"));
				refeicao.setNome(result.getString("nome"));
				refeicao.setDescricao(result.getString("descricao"));
				refeicao.setNome_Vinho(result.getString("nome_vinho"));

				
				refeicoes.add(refeicao);
			}
			result.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return refeicoes;
	}
        
        public List<String> retornaDescr(String refeicao){
            List<String> list = new ArrayList<String>();
            String sql = "select descricao,nome_vinho from refeicao where nome=?";
            PreparedStatement st;
            try {
                st = conexao.prepareStatement(sql);
                st.setString(1, refeicao);
                ResultSet result = st.executeQuery();
                list.add(result.getString("descricao"));
		list.add(result.getString("nome_vinho"));
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
            return list;
        }
}
