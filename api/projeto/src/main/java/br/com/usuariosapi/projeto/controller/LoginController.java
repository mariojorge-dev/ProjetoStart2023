package br.com.usuariosapi.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @Autowired
    private UsuaioController repo;

    @GetMapping("/login")
    public String index(){
        return"login/index";
    }
    @PostMapping("/logar")
            public String index(Model model ,String email, String senha, String Lembrar){
        return"login/index";
    }
}
