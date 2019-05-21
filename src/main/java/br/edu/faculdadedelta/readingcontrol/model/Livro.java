package br.edu.faculdadedelta.readingcontrol.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import br.edu.faculdadedelta.readingcontrol.model.type.StatusLivro;

@Entity
public class Livro implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull(message = "O campo TITULO não pode ser nulo!")
	@Column(nullable = false, unique = true)
	private String titulo;
	
	private String isbn;
	
	private String descricao;
	
	@NotNull(message = "O campo PAGINAS não pode ser nulo!")
	private int paginas; 
	
	@NotNull(message = "O campo AUTOR não pode ser nulo!")
	private String autor;
	
	@NotNull(message = "O campo EDITORA não pode ser nulo!")
	private String editora;
	
	@NotNull(message = "O campo GENERO não pode ser nulo!")
	private String genero;
	
	//@NotNull(message = "O campo STATUS não pode ser nulo!")
	@Enumerated(EnumType.STRING)
	private StatusLivro statusLivro;
	
	
	public Livro() {
		super();
	}

	public Livro(Long id, String titulo, String isbn, String descricao, int paginas, 
			String autor, String editora, String genero, StatusLivro statusLivro) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.isbn = isbn;
		this.descricao = descricao;
		this.paginas = paginas;
		this.autor = autor;
		this.editora = editora;
		this.genero = genero;
		this.statusLivro = statusLivro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public StatusLivro getStatusLivro() {
		return statusLivro;
	}

	public void setStatusLivro(StatusLivro statusLivro) {
		this.statusLivro = statusLivro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
}
