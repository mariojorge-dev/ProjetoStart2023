package br.com.usuariosapi.projeto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.usuariosapi.projeto.dtos.CadastroEmpDTO;
import br.com.usuariosapi.projeto.model.Empreendedor; // Importe a classe Empreendedor
import br.com.usuariosapi.projeto.services.EmpreendedorService; // Importe o serviço correspondente

@RestController
@CrossOrigin("*")
@RequestMapping("/empreendedor")
public class EmpreendedorController {

    @Autowired
    private EmpreendedorService empreendedorService;

    @GetMapping
    public List<Empreendedor> ListaEmpreendedores() {
		return (List<Empreendedor>) empreendedorService.ListaEmpreendedor();
    }

    @GetMapping("/{id}")
    public Empreendedor buscarPorId(@PathVariable Integer id) {
        return empreendedorService.buscarPorId(id);
    }

    @PostMapping
    public Empreendedor criarEmpreendedor(@RequestBody CadastroEmpDTO empreendedor) {
        var empreendedorNovo = empreendedorService.buildEmpreendedor(empreendedor);
        return empreendedorService.salvar(empreendedorNovo);
    }

    @PutMapping
    public Empreendedor editarEmpreendedor(@RequestBody Empreendedor empreendedor) {
        Empreendedor empreendedorNovo = empreendedorService.editarEmpreendedor(empreendedor);
        return empreendedorNovo;
    }

    @DeleteMapping("/{idempreendedor}")
    public Optional<Empreendedor> excluirEmpreendedor(@PathVariable Integer idempreendedor) {
        Optional<Empreendedor> empreendedor = empreendedorService.excluirEmpreendedor(idempreendedor);
        return empreendedor;
    }
}