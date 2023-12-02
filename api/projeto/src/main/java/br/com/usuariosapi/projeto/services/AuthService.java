package br.com.usuariosapi.projeto.services;

import org.springframework.stereotype.Service;

import br.com.usuariosapi.projeto.model.Usuario;
import br.com.usuariosapi.projeto.repositories.UsuarioRepository;

@Service
public class AuthService {

    private static UsuarioRepository UsuarioRepository;

    public AuthService(UsuarioRepository usuarioRepository) {
        AuthService.UsuarioRepository = usuarioRepository;
    }

    public static boolean autenticarUsuario(String email, String senha) {
        Usuario usuario = UsuarioRepository.findByEmail(email);

        // Verificar se o usuário existe e se a senha corresponde
        return usuario != null && usuario.getSenha().equals(senha);
    }
}