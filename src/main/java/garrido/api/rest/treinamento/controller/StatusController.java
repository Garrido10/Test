package garrido.api.rest.treinamento.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //anotacao que me diz que esta é uma API Rest
public class StatusController {

    @GetMapping(path = "/api/status")  //mapa para encontrar a minha aplicação
    public String check() {  //metodo para verificar se a API esta online
        return "O pai tá ON";    //retorno do meu metodo
    }

}
