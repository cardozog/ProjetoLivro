package br.com.bg.livraria02rafael.modelo;

import java.util.ArrayList;
import java.util.List;

public class Livro {
	
	private Integer id;
	private String titulo;
	private String isbn;
	private double preco;
	private String dataLancamento;
	private List<Autor> autores = new ArrayList<Autor>();
	
	public void adicionarAutor(Autor autor) {
		if(!this.autores.contains(autor)) {
			this.autores.add(autor);
		}
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

}
