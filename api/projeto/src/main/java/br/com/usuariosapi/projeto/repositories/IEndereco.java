package br.com.usuariosapi.projeto.repositories;

import org.springframework.stereotype.Repository;

import java.util.List;  

import org.springframework.data.repository.CrudRepository;

import br.com.usuariosapi.projeto.model.Endereco;

@Repository
public interface IEndereco extends CrudRepository<Endereco, Integer>{

	List<Endereco> findAll(); 
}