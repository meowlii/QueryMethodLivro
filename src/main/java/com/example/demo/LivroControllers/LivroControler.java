package com.example.demo.LivroControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.LivroEntities.Livro;
import com.example.demo.LivroSevices.LivroService;

@RestController
@RequestMapping("/livros")

public class LivroControler {
    private final LivroService livroService;

    @Autowired
    public LivroControler(LivroService livroService) {
        this.livroService = livroService;
    }

    @PostMapping
    public Livro createLivro(@RequestBody Livro livro) {
        return livroService.saveLivro(livro);
    }

    @GetMapping("/{id}")
    public Livro getLivro(@PathVariable Long id) {
        return livroService.getLivroById(id);
    }

    @GetMapping
    public List<Livro> getAllLivros() {
        return livroService.getAllLivros();
    }

    @DeleteMapping("/{id}")
    public void deleteLivro(@PathVariable Long id) {
    	livroService.deleteLivro(id);
    }
    
  //query method buscar titulo controler
  	@GetMapping("/titulo/{titulo}")
  	public List<Livro> buscarPorTitulo(@PathVariable String titulo) {
  		return livroService.buscarPorTitulo(titulo);
  	}
  	
  	@GetMapping("/autor/{autor}")
  	public List<Livro> buscarPorAutor(@PathVariable String autor) {
  		return livroService.buscarPorAutor(autor);
  	}
}