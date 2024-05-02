package com.example.demo.LivroRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.LivroEntities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
	
	// Nenhuma implementação é necessária. Spring Data JPA cuidará disso.
}
