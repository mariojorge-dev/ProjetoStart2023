package br.com.usuariosapi.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.usuariosapi.projeto.model.Endereco;
import br.com.usuariosapi.projeto.repositories.IEndereco;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private IEndereco enderecoDao;

    @GetMapping
    public List<Endereco> listarEnderecos() {
        return (List<Endereco>) enderecoDao.findAll();
    }
    
    @PostMapping
    public Endereco criarEndereco(@RequestBody Endereco endereco) {
        Endereco enderecoNovo = enderecoDao.save(endereco);
        return enderecoNovo;
    }

    @PutMapping
    public Endereco atualizarEndereco(@RequestBody Endereco endereco) {
        Endereco enderecoAtualizado = enderecoDao.save(endereco);
        return enderecoAtualizado;
    }

    @DeleteMapping("/{idendereco}")
    public Optional<Endereco> excluirEndereco(@PathVariable Integer idendereco) {
        Optional<Endereco> endereco = enderecoDao.findById(idendereco);
        enderecoDao.deleteById(idendereco);
        return endereco;
    }
}