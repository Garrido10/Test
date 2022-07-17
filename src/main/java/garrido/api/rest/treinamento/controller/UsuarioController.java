package garrido.api.rest.treinamento.controller;

import garrido.api.rest.treinamento.model.UsuarioModel;
import garrido.api.rest.treinamento.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;


    @GetMapping(path = "/api/usuario/")
    public ResponseEntity getAll() {
        return ResponseEntity.ok(repository.findAll());
    }


    @GetMapping(path = "/api/usuario/{codigo}")
    public ResponseEntity getUsuario(@PathVariable("codigo") Integer codigo) {
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }


    @PostMapping(path = "/api/usuario/salvar")
    public UsuarioModel postUsuario(@RequestBody UsuarioModel usuario) {
        return repository.save(usuario);
    }



    @DeleteMapping("/api/usuario/apagar/{codigo}")
    public void deleteUsuario(@PathVariable("codigo") Integer codigo){
        this.repository.deleteById(codigo);

    }


}
