package br.com.springboot.myproject.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.springboot.myproject.entities.Categoria;

@Component
public class RepositorioCategoria {

	private Map<Long, Categoria> map = new HashMap<>();
	
	public void salvarCategoria(Categoria cat) {
		map.put(cat.getID(), cat);
	}
	
	public Categoria buscarPorId(Long id) {
		return map.get(id);
	}
	
	public List<Categoria> buscarTodos(){
		return new ArrayList<Categoria>(map.values());
	}
}
