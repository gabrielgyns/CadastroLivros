package br.edu.faculdadedelta.readingcontrol.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.edu.faculdadedelta.readingcontrol.model.Livro;
import br.edu.faculdadedelta.readingcontrol.model.type.StatusLivro;
import br.edu.faculdadedelta.readingcontrol.repository.LivroRepository;

@Controller
public class LivroController {
	
	@Autowired
	private LivroRepository livroRepository;
	
	@RequestMapping(method = RequestMethod.GET, value = "/cadastroLivro")
	public ModelAndView inicio() {
		ModelAndView andView = new ModelAndView("cadastro/cadastroLivro");
		andView.addObject("livroobj", new Livro());
		return andView;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "**/salvarLivro")
	public ModelAndView salvar(Livro livro) {
		livroRepository.save(livro);
		
		ModelAndView andView = new ModelAndView("cadastro/cadastroLivro");
		Iterable<Livro> livrosIt = livroRepository.findAll();
		andView.addObject("livros", livrosIt);
		andView.addObject("livroobj", new Livro());
		
		return andView;
	}
	
	@GetMapping("/editarLivro/{id}")
	public ModelAndView editar(@PathVariable("id") Long id) {
		Optional<Livro> livro = livroRepository.findById(id);

		ModelAndView andView = new ModelAndView("cadastro/cadastroLivro");
		andView.addObject("livroobj", livro.get());
		
		return andView;
	}
	
	@GetMapping("/excluirLivro/{id}")
	public ModelAndView excluir(@PathVariable("id") Long id) {
		this.livroRepository.deleteById(id);

		ModelAndView andView = new ModelAndView("cadastro/cadastroLivro");
		andView.addObject("livros", livroRepository.findAll());
		andView.addObject("livroobj", new Livro());
		
		return andView;
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/listaLivros")
	public ModelAndView livros() {
		ModelAndView andView = new ModelAndView("lista/listaLivro");
		Iterable<Livro> livrosIt = livroRepository.findAll();
		andView.addObject("livros", livrosIt);
		andView.addObject("livroobj", new Livro());
		
		return andView;
	}
	
	@ModelAttribute("todosStatusLivro")
	public StatusLivro[] todosStatusLivro() {
		return StatusLivro.values();
	}
	
	
}
