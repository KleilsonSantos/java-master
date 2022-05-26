package br.com.java.model.entities;

public class InvalideOperation extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public InvalideOperation(String msg) {
		super(msg);
	}
}
