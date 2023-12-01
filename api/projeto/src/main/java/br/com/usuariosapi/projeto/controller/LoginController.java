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

    @GetMapping("/login")
    public String index() {
        return "login/index";
    }

    @PostMapping("/logar")
    public String logar(Model model, @RequestParam String email, @RequestParam String senha) {
        // Verifica as credenciais usando o serviço de usuário
        if (autenticar(email, senha)) {
            // Se a autenticação for bem-sucedida, redireciona para a página de dashboard
            return "redirect:/dashboard";
        } else {
            // Se a autenticação falhar, exibe uma mensagem de erro
            model.addAttribute("error", "Credenciais inválidas");
            return "login/index";
        }
    }
}
