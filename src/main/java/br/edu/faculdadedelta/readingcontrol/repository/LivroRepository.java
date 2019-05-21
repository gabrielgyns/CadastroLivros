package br.edu.faculdadedelta.readingcontrol.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.edu.faculdadedelta.readingcontrol.model.Livro;

@Repository
@Transactional
public interface LivroRepository extends CrudRepository<Livro, Long> {

}
