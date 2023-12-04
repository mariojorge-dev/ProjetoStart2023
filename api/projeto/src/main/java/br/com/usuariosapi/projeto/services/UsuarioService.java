package br.com.usuariosapi.projeto.services;

import br.com.usuariosapi.projeto.dtos.CadastroDTO;
import br.com.usuariosapi.projeto.dtos.LoginDTO;
import br.com.usuariosapi.projeto.model.Endereco;
import br.com.usuariosapi.projeto.model.Usuario;
import br.com.usuariosapi.projeto.repositories.IUsuario;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

	@Autowired
	IUsuario iUsuario;

	public Usuario salvar(Usuario usuario) {
		return iUsuario.save(usuario);
	}

	public List<Usuario> ListaUsuarios() {
		return (List<Usuario>) iUsuario.findAll();
	}

	public Usuario editarUsuario(Usuario usuario) {
		return iUsuario.save(usuario);
	}

	public Optional<Usuario> excluirUsuario(Integer idusuario) {
		Optional<Usuario> usuario = iUsuario.findById(idusuario);
		iUsuario.deleteById(idusuario);
		return usuario;

	}

	/**
	 * Metodo usado para Converter um CadastroDTo para Usuario.
	 *
	 * @param cadastroDTO Dto com os dados endereço e usuario.
	 */

	@Autowired
	private EmailService emailService;

	public Usuario buildUsuario(CadastroDTO cadastroDTO) {
		Usuario usuario = new Usuario();
		Endereco endereco = new Endereco();

		// usuario.setContato(cadastroDTO.getContato());
		// usuario.setCpf(cadastroDTO.getCpf());
		// usuario.setDatanascimento(cadastroDTO.getDatanascimento());
		// usuario.setNome(cadastroDTO.getNome());
		// usuario.setSenha(cadastroDTO.getSenha());
		// usuario.setSexo(cadastroDTO.getSexo());

		usuario.setEndereco(endereco);
		endereco.setUsuario(usuario);

		BeanUtils.copyProperties(cadastroDTO, usuario);
		BeanUtils.copyProperties(cadastroDTO, endereco);

		// endereco.setCep(cadastroDTO.getCep());
		// endereco.setCidade(cadastroDTO.getCidade());
		// endereco.setEndereco(cadastroDTO.getEndereco());
		// endereco.setEstado(cadastroDTO.getEstado());
		// endereco.setIdempreendedor(cadastroDTO.getIdempreendedor());
		// emailService.enviarEmailTexto(usuario.getEmail(), "QQ", "QQ");
		emailService.enviarEmailTexto(usuario.getEmail(), "QQ", "QQ");

		return usuario;
	}

	public Usuario buscarPorId(Integer id) {
		return iUsuario.findById(id).orElseThrow(() -> new RuntimeException("Usuario Não Encontrado"));
	}

	public static boolean autenticar(String email, String senha) {
		return false;
	}

	public LoginDTO findByEmailandSenha(String email, String senha) {

		return null;
	}

    public void salvarUsuario(Usuario novoUsuario) {
    }
}
