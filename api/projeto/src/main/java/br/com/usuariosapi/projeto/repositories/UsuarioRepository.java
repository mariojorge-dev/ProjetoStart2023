package br.com.usuariosapi.projeto.repositories;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.usuariosapi.projeto.model.Usuario;



@SpringBootApplication
@EnableJpaRepositories("br.com.usuariosapi.projeto.repositories")
public class UsuarioRepository {

    public Usuario findByEmail(String email) {
        return null;
    }

}
