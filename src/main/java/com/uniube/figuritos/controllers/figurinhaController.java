package com.uniube.figuritos.controllers;

import com.uniube.figuritos.models.figurinhas;
import com.uniube.figuritos.services.figurinhasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/figurinhas")
public class figurinhaController {

    @Autowired
    private figurinhasService service; // Injeta o Service aqui!

    // Inserir dados (POST)
    @PostMapping
    public figurinhas salvarFigurinha(@RequestBody figurinhas novaFigurinha) {
        return service.cadastrarFigurinhas(novaFigurinha); // Chama o método do seu Service
    }

    // Listar todos (GET)
    @GetMapping
    public List<figurinhas> listarTodas() {
        return service.getfigurinhas(); // Chama o seu Service
    }

    // Buscar por número/id específico (GET)
    @GetMapping("/{id}")
    public Optional<figurinhas> buscarPorId(@PathVariable Integer id) {
        return service.getfigurinhas(id); // Chama o método com ID do seu Service
    }
}