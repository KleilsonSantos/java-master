package br.com.springboot.myproject.entities;

import java.util.Objects;

public class Produto {

	private Long ID;
	private String nome;
	private Double preco;
	
	public Produto() {
	}
	
	public Produto(Long iD, String nome, Double preco) {
		ID = iD;
		this.nome = nome;
		this.preco = preco;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(ID, other.ID);
	}

	@Override
	public String toString() {
		return "Produto [ID=" + ID + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
}
