package br.com.usuariosapi.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.usuariosapi.projeto.dtos.CadastroDTO;
import br.com.usuariosapi.projeto.services.UsuarioService;
import lombok.Getter;
import lombok.Setter;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
@Getter
@Setter
@Controller
public class UserController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/cadastrogeral")
    public String cadastrarUsuario(@ModelAttribute CadastroDTO cadastroDTO) {
        String senha = cadastroDTO.getPassword();
        String senhaEncriptada = bCryptPasswordEncoder.encode(senha);

        // Define a senha encriptada no DTO antes de salvar
        cadastroDTO.setPassword(senhaEncriptada);

        // Implemente a lógica para salvar o usuário com o DTO CadastroDTO
        // usuarioService.salvarUsuario(cadastroDTO);

        // Redireciona para alguma página após o cadastro
        return "redirect:/pagina-de-cadastro-concluido";
    }

    // Outros métodos do controller...
}