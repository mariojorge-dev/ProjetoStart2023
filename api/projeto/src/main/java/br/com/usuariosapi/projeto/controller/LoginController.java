package br.com.usuariosapi.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.usuariosapi.projeto.services.AuthService;


@Controller
public class LoginController {

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

    @GetMapping ("/login.html")
    public String mostrarPaginaEsqueceu(){
        return "login";
    }

 @PostMapping("/logar")
public String logar(Model model, @RequestParam String email, @RequestParam String senha) {
    if (AuthService.autenticarUsuario(email, senha)) {
        return "redirect:/pagina-inicial"; // Redireciona para a página inicial após o login
    } else {
        model.addAttribute("error", "Credenciais inválidas");
        return "login"; // Retorna para a página de login
    }
}
}


