package br.com.usuariosapi.projeto.controller;
import static br.com.usuariosapi.projeto.services.UsuarioService.autenticar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.usuariosapi.projeto.repositories.IUsuario;

@Controller
public class LoginController {

@Autowired
private IUsuario usu;

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

    @GetMapping("/login.html")
    public String showLoginPage() {
        // Aqui você pode adicionar a lógica necessária para exibir a página de login
        return "login"; // Retorna o nome da página HTML (sem extensão) que o Thymeleaf deve processar
    }

    @PostMapping("/logar")
    public String logar(Model model, @RequestParam String email, @RequestParam String senha) {
        // Verifica as credenciais usando o serviço de usuário
        if (autenticar(email, senha)) {
            // Se a autenticação for bem-sucedida, redireciona para a página inicial
            return "redirect:/";
        } else {
            // Se a autenticação falhar, exibe uma mensagem de erro
            model.addAttribute("error", "Credenciais inválidas");
            return "login/index"; // Verifique se o caminho está correto
        }
    }
    }

