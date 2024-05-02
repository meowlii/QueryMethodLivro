package com.example.demo.LivroSevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.LivroEntities.Livro;
import com.example.demo.LivroRepositories.LivroRepository;

@Service
public class LivroService {
	private final LivroRepository livroRepository;

	//construtor que recebe a dependencia
	@Autowired
    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

	public Livro saveLivro(Livro livro) {
		return livroRepository.save(livro);
	}

	public Livro getLivroById(Long id) {
		return livroRepository.findById(id).orElse(null);
	}

	public List<Livro> getAllLivros() {
		return livroRepository.findAll();
	}

	public void deleteLivro(Long id) {
		livroRepository.deleteById(id);
	}
}
