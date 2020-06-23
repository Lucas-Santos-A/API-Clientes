package io.github.Lucas_Santos_A.clientes.rest;

import io.github.Lucas_Santos_A.clientes.exception.UsuarioCadastradoException;
import io.github.Lucas_Santos_A.clientes.model.entity.Usuario;
import io.github.Lucas_Santos_A.clientes.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    //Da a resposta http aqui porque a camada de serviço não faz contato direto com o usuário/api
    public void salvar(@RequestBody @Valid Usuario usuario){
        try {
            service.salvar(usuario);
        }catch(UsuarioCadastradoException ex){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage() );
        }
    }
}
