package br.com.springboot.myproject.entities;

import java.io.Serializable;
import java.util.Objects;

public class Categoria implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long ID;
	private String name;

	public Categoria() {
	}

	public Categoria(Long iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		Categoria other = (Categoria) obj;
		return Objects.equals(ID, other.ID);
	}

}
