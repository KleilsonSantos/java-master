package br.com.springboot.myproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.springboot.myproject.entities.Categoria;
import br.com.springboot.myproject.repositories.RepositorioCategoria;

@SpringBootApplication
public class MyFirstProjectSpringBootApplication implements CommandLineRunner {
	
	@Autowired
	private RepositorioCategoria categoriaRepositorio;
	
	public static void main(String[] args) {
		SpringApplication.run(MyFirstProjectSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	Categoria cat1 = new Categoria(1L, "Devops");
	Categoria cat2 = new Categoria(2L, "Infra");
	
	categoriaRepositorio.salvarCategoria(cat1);
	categoriaRepositorio.salvarCategoria(cat2);
	}

}
