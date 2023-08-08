package rest.api.springboot.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.api.springboot.java.model.UsuarioModel;
import rest.api.springboot.java.repository.UsuarioRepository;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    //Rotas
    @GetMapping(path = "/api/usuario/{codigo}") //GetById
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo){
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/usuario/salvar")
    public UsuarioModel salvar(@RequestBody UsuarioModel usuario){ //POST
        return repository.save(usuario);
    }
}
