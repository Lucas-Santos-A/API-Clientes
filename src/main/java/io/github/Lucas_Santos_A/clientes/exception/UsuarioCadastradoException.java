package io.github.Lucas_Santos_A.clientes.exception;

public class UsuarioCadastradoException extends RuntimeException{

    public UsuarioCadastradoException( String login ){
        super("Usuário já cadastrado para o login" + login);
    }
}
