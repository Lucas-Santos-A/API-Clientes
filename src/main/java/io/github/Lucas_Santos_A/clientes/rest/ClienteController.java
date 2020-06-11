package io.github.Lucas_Santos_A.clientes.rest;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.github.Lucas_Santos_A.clientes.model.entity.Cliente;
import io.github.Lucas_Santos_A.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")//Mapeia URL base desse controller
public class ClienteController {

    private final ClienteRepository repository;

    @Autowired
    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar(@RequestBody Cliente cliente){
       return repository.save(cliente);
    }

}
