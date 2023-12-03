package br.com.usuariosapi.projeto.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDTO {
    
    private String email;
    private String senha;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
