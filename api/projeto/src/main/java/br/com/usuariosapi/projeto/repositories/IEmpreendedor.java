package br.com.usuariosapi.projeto.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.usuariosapi.projeto.model.Empreendedor; // Importe a classe Empreendedor

public interface IEmpreendedor extends JpaRepository<Empreendedor, Integer>{
    List<Empreendedor> findAll(); // Recuperar uma lista de todos os empreendedores no repositório de dados.
}
