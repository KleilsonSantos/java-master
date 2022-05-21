package br.com.springboot.myproject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.myproject.entities.Produto;
import br.com.springboot.myproject.repositories.RepositorioProduto;

@RestController
@RequestMapping(value = "/produtos")
public class RecursoProduto {

	@Autowired
	private RepositorioProduto repositorioProduto;

	@GetMapping
	public ResponseEntity<List<Produto>> buscarTodos(Produto produto) {
		List<Produto> list = repositorioProduto.buscarTodos();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Produto> buscarPorId(@PathVariable Long id) {
		Produto produto = repositorioProduto.buscarPorId(id);
		return ResponseEntity.ok().body(produto);
	}
}
