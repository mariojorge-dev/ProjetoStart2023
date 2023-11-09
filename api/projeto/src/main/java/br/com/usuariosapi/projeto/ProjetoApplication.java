// raiz do projeto
package br.com.usuariosapi.projeto;

// importa as classes do srping framework
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// marca a classe como uma classe de aplicativo Spring Boot.
@SpringBootApplication
public class ProjetoApplication {
	
	//Ela usa o método run da classe SpringApplication para iniciar a classe ProjetoApplication 
	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}

}
