package com.adega.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.adega.jdbc.ConnectionFactory;
import com.adega.modelo.Vinho;

public class VinhoDao {
	Connection conexao = new ConnectionFactory().getConnection();
	
	
	public void adicionaVinho(Vinho vinho){
		String sql = "insert into vinho (nome,fabricante,ano,acucarado,aroma,preco)" +
				"values(?,?,?,?,?,?)";
		
		try {
			PreparedStatement st = conexao.prepareStatement(sql);
	
			st.setString(1, vinho.getNome());
			st.setString(2, vinho.getFabricante());
			st.setString(3, vinho.getAno());
			st.setString(4, vinho.getAcucarado());
			st.setString(5, vinho.getAroma());
			st.setString(6, vinho.getPreco());
			
			st.execute();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void alteraVinho(Vinho vinho){
		String sql = "update vinho set fabricante=?,ano=?,acucarado=?,aroma=?,preco=? where nome=?";
		
		try {
			PreparedStatement st = conexao.prepareStatement(sql);
			
			
			st.setString(1, vinho.getFabricante());
			st.setString(2, vinho.getAno());
			st.setString(3, vinho.getAcucarado());
			st.setString(4, vinho.getAroma());
			st.setString(5, vinho.getPreco());
			st.setString(6, vinho.getNome());
			
			st.execute();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void removeVinho(String vinho){
		String sql = "delete from vinho where nome=?";
		
		try {
			PreparedStatement st = conexao.prepareStatement(sql);

			st.setString(1, vinho);

			st.execute();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Vinho> getVinhos(){
		List<Vinho> vinhos = new ArrayList<Vinho>();
		String sql = "select * from vinho";
		PreparedStatement st;
		try {
			st = conexao.prepareStatement(sql);
			ResultSet result = st.executeQuery();
			while (result.next()){
				Vinho vinho= new Vinho();
				vinho.setId(result.getInt("id"));
                                //System.out.println(result.getInt("id"));
				vinho.setNome(result.getString("nome"));
                                //System.out.println(result.getString("nome"));
				vinho.setFabricante(result.getString("fabricante"));
                                //System.out.println(result.getString("fabricante"));
				vinho.setAno(result.getString("ano"));
                                //System.out.println(result.getString("ano"));
				vinho.setAcucarado(result.getString("acucarado"));
                                //System.out.println(result.getString("acucarado"));
				vinho.setAroma(result.getString("aroma"));
                                //System.out.println(result.getString("aroma"));
				vinho.setPreco(result.getString("preco"));
                                //System.out.println(result.getString("preco"));
				
				vinhos.add(vinho);
			}
			result.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vinhos;
	}
        
        public List<String> getVinho(String vinho){
            List<String> list = new ArrayList<String>();
            String sql = "select nome from vinho where nome=?";
            PreparedStatement st;
            try {
                st = conexao.prepareStatement(sql);
                st.setString(1, vinho);
                ResultSet result = st.executeQuery();
                list.add(result.getString("nome"));
		list.add(result.getString("fabricante"));
                list.add(result.getString("ano"));
		list.add(result.getString("acucarado"));
                list.add(result.getString("aroma"));
		list.add(result.getString("preco"));
                               
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
            return list;
        }
        
}
