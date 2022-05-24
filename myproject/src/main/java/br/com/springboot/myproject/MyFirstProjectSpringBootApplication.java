package br.com.springboot.myproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.springboot.myproject.entities.Categoria;
import br.com.springboot.myproject.entities.Produto;
import br.com.springboot.myproject.repositories.RepositorioCategoria;
import br.com.springboot.myproject.repositories.RepositorioProduto;

@SpringBootApplication
public class MyFirstProjectSpringBootApplication implements CommandLineRunner {

	@Autowired
	private RepositorioCategoria repositorioCategoria;
	@Autowired
	private RepositorioProduto repositorioProduto;

	public static void main(String[] args) {
		SpringApplication.run(MyFirstProjectSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(1L, "Devops");
		Categoria cat2 = new Categoria(2L, "Infra");
		repositorioCategoria.salvarCategoria(cat1);
		repositorioCategoria.salvarCategoria(cat2);

		Produto produto1 = new Produto(1L, "NoteBook Gamer Acer", 5000.00);
		Produto produto2 = new Produto(2L, "Celular iPhone XS Max", 11000.00);
		repositorioProduto.salvarProduto(produto1);
		repositorioProduto.salvarProduto(produto2);
	}

}
