package br.com.springboot.myproject.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.springboot.myproject.entities.Produto;

@Component
public class RepositorioProduto {
	
	private Map<Long, Produto> map = new HashMap<>();
	
	public void salvarProduto(Produto produto) {
		map.put(produto.getID(), produto);
	}

	public Produto buscarPorId(Long id) {
		return map.get(id);
	}

	public List<Produto> buscarTodos() {
			return new ArrayList<Produto>(map.values());
	}
}
