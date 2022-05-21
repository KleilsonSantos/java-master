package br.com.springboot.myproject.db;

public class DBExcecao extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DBExcecao(String msg) {
		super(msg);
	}
}
