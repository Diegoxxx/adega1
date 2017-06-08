package com.adega.modelo;


//import java.util.Date;

public class Vinho {

    public Vinho() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getAcucarado() {
        return acucarado;
    }

    public void setAcucarado(String acucarado) {
        this.acucarado = acucarado;
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public Vinho(Integer id, String nome, String fabricante, String ano, String acucarado, String aroma, String preco) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.ano = ano;
        this.acucarado = acucarado;
        this.aroma = aroma;
        this.preco = preco;
    }

    public Vinho(String nome, String fabricante, String ano, String acucarado, String aroma, String preco) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.ano = ano;
        this.acucarado = acucarado;
        this.aroma = aroma;
        this.preco = preco;
    }
	private Integer id;
	private String nome;
	//private String validade;
	private String fabricante;
	private String ano;
	private String acucarado;
	private String aroma;
	private String preco;
        
	
	
	
	
}
