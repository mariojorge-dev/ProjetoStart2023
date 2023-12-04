package br.com.usuariosapi.projeto.controller;

import br.com.usuariosapi.projeto.services.AuthService;
import br.com.usuariosapi.projeto.services.UsuarioService;
import lombok.Getter;
import lombok.Setter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Getter
@Setter
@Controller
public class LoginController {

    private UsuarioService usuarioService;

    @GetMapping("/index.html")
    public String mostrarPaginaInicio() {
        return "index"; // Retorna o nome do arquivo HTML para a página inicial
    }

    @GetMapping("/cursos.html")
    public String mostrarPaginaCursos() {
        return "cursos"; // Retorna o nome do arquivo HTML para a página de cursos
    }

    @GetMapping("/tela_sobreNos.html")
    public String mostrarPaginaSobreNos() {
        return "tela_sobreNos"; // Retorna o nome do arquivo HTML para a página sobre nós
    }

    @GetMapping("/form.html")
    public String mostrarPaginaFormulario() {
        return "form"; // Retorna o nome do arquivo HTML para a página de formulário
    }

    @GetMapping("/cadastrogeral.html")
    public String mostrarPaginaCadastroGeral() {
        return "cadastrogeral"; // Retorna o nome do arquivo HTML para a página de cadastro geral
    }

    @GetMapping("/cadastroempreendedor.html")
    public String mostrarPaginaCadastroEmpreendedor() {
        return "cadastroempreendedor"; // Retorna o nome do arquivo HTML para a página de cadastro de empreendedor
    }

    @GetMapping ("/senha.html")
    public String mostrarPaginaEsqueceu(){
        return "senha";
    }
/*@GetMapping ("/login.html")
public  String mostraPaginaLogin () {
        return "login";
}


    @PostMapping("/logar")
    public String logar(@RequestBody LoginDTO loginDTO ){
        loginDTO = this.usuarioService.findByEmailandSenha(loginDTO.getEmail(), loginDTO.getSenha());
        return "login";
    }
} */

    @GetMapping ("/login.html")
    public String mostrarPaginaLogin(){
        return "loin";
    }

    @PostMapping("/logar")
    public String logar(Model model, @RequestParam String email, @RequestParam String senha) {
        if (AuthService.autenticarUsuario(email, senha)) {
            return "login"; // Redireciona para a página inicial após o login
        } else {
            model.addAttribute("error", "Credenciais inválidas");
            return "index"; // Retorna para a página de login
        }
    }
}


