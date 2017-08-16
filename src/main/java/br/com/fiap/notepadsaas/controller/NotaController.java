package br.com.fiap.notepadsaas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.notepadsaas.model.Nota;
import br.com.fiap.notepadsaas.repository.NotaRepository;

@RestController
@CrossOrigin
@RequestMapping(value = "/nota")
public class NotaController {
	
	private NotaRepository notaRepository;

	public NotaController(NotaRepository notaRepository) {
		this.notaRepository = notaRepository;
	}
	
	@GetMapping(value = "/")
	public List<Nota> findAll() {
		return notaRepository.findAll();
	}
	
    @GetMapping(value = "/titulo/{titulo}")
    private List<Nota> findByTitulo(@PathVariable(value = "titulo") String q) {
        return notaRepository.findByTitulo(q);
    }
	
	@PostMapping(value = "/")
	public void save(@RequestBody Nota nota){
		notaRepository.save(nota);
	}
	

}
