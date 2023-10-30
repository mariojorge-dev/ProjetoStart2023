package br.com.usuariosapi.projeto.DAO; // Define o pacote onde a interface IUsuario está localizada.

import java.util.List;  //Importa as classes e interfaces necessárias para o funcionamento da interface, incluindo List, CrudRepository e a classe Usuario.

import org.springframework.data.repository.CrudRepository;

import br.com.usuariosapi.projeto.model.Usuario;

//define a interface IUsuario. Ela estende CrudRepository, que é uma interface do Spring Framework para realizar operações CRUD em entidades.
public interface IUsuario extends CrudRepository<Usuario, Integer>{

	List<Usuario> findAll(); //Este método é uma declaração personalizada na interface. recuperar uma lista de todos os usuários no repositório de dados.

}
