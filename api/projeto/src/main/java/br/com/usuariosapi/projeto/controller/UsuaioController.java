//Define o pacote onde a classe UsuaioController está localizada.
package br.com.usuariosapi.projeto.controller;

//Importam as classes e interfaces necessárias para o funcionamento do controlador. Usuario e a interface IUsuario.
//As classes do Spring Framework
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.usuariosapi.projeto.dtos.CadastroDTO;
import br.com.usuariosapi.projeto.model.Usuario;
import br.com.usuariosapi.projeto.services.UsuarioService;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@RestController //UsuaioController como um controlador Spring, lidar com solicitações HTTP e retornar respostas HTTP.
@CrossOrigin("*") // solicitações de origens cruzadas, o que significa que a API pode ser acessada por clientes de diferentes domínios.
@RequestMapping("/usuarios") // Define o mapeamento de URL base para todas as solicitações tratadas por este controlador.
public class UsuaioController {
	
	
	@Autowired 		
	private UsuarioService usuarioService;

	
    @GetMapping("/cadastrogeral")
    public String cadastro(){
        return "cadastro/cadastrogeral";
    }
	
	@GetMapping //mapeia o método ListaUsuarios() para lidar com solicitações HTTP GET na URL base definida em @RequestMapping("/usuarios"). retorna uma lista de todos os usuários no repositório de dados.
	public List<Usuario> ListaUsuarios() {
		return (List<Usuario>) usuarioService.ListaUsuarios();
		}
	
	@GetMapping("/{id}")
	public Usuario buscarPorId(@PathVariable Integer id) {
		return usuarioService.buscarPorId(id);
	}
	
	@PostMapping //mapeia o método criarUsiario() para manipular solicitações HTTP POST na mesma URL base. O método recebe um objeto JSON de usuário no corpo da solicitação, cria um novo usuário no repositório de dados e retorna o novo usuário criado.
	public Usuario  criarUsiario (@RequestBody  CadastroDTO usuario) {
		var usuarioNovo = usuarioService.buildUsuario(usuario);
		return usuarioService.salvar(usuarioNovo);
		
	}
	
	@PutMapping // mapeia o método editarUsuario() para lidar com solicitações HTTP PUT. Assim como o método @PostMapping, ele recebe um objeto JSON de usuário no corpo da solicitação, atualiza o usuário existente no repositório de dados e retorna o usuário atualizado.
	public Usuario editarUsuario (@RequestBody Usuario usuario) {
		Usuario usuarioNovo = usuarioService.editarUsuario(usuario);
		return usuarioNovo;
	}
	@DeleteMapping("/{idusuario}") //mapeia o método excluirUsuario() para tratar solicitações HTTP DELETE na URL base com um ID de usuário fornecido como parte da URL. O método exclui o usuário com o ID especificado no repositório de dados e retorna o usuário excluído encapsulado em um objeto Optional.
	public Optional<Usuario> excluirUsuario (@PathVariable Integer idusuario){
    Optional<Usuario> usuario = usuarioService.excluirUsuario(idusuario);
	return usuario;
	}
	
}