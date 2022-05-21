package br.com.springboot.myproject.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

	private static Connection conexao = null;

	public static Connection abrirConexao() {
		if(conexao == null) {
			Properties propriedades = carregarPropriedades();
			String url = propriedades.getProperty("dburl");
			try {
				conexao = DriverManager.getConnection(url, propriedades);
			} catch (SQLException e) {
				throw new DBExcecao(e.getMessage());
			}
		}
		return conexao;
	}

	public static void fecharConexao(){
		if(conexao != null) {
			try {
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		
	}

	private static Properties carregarPropriedades() {
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties propriedades = new Properties();
			propriedades.load(fs);
			return propriedades;
		} catch (IOException e) {
			throw new DBExcecao("Erro no metodo carregarPropriedades() " + e.getMessage());
		}

	}

}
