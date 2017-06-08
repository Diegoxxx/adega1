package com.adega.modelo;

public class Refeicao {

    public Refeicao() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getIdRefeicao() {
        return idRefeicao;
    }

    public void setIdRefeicao(Integer idRefeicao) {
        this.idRefeicao = idRefeicao;
    }

    public String getNome_Vinho() {
        return Nome_Vinho;
    }

    public void setNome_Vinho(String Nome_Vinho) {
        this.Nome_Vinho = Nome_Vinho;
    }

    public Refeicao(String nome, String descricao, Integer idRefeicao, String Nome_Vinho) {
        this.nome = nome;
        this.descricao = descricao;
        this.idRefeicao = idRefeicao;
        this.Nome_Vinho = Nome_Vinho;
    }

    public Refeicao(String nome, String descricao, String Nome_Vinho) {
        this.nome = nome;
        this.descricao = descricao;
        this.Nome_Vinho = Nome_Vinho;
    }
	private String nome;
	private String descricao;
	private Integer idRefeicao;
	private String Nome_Vinho;

    
	
	
	
}
