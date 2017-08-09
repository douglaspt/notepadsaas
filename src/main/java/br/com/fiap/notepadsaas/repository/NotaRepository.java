package br.com.fiap.notepadsaas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.fiap.notepadsaas.model.Nota;

public interface NotaRepository extends MongoRepository<Nota, String> {

}
