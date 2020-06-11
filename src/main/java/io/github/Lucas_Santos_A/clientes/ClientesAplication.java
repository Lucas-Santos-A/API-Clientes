package io.github.Lucas_Santos_A.clientes;

import io.github.Lucas_Santos_A.clientes.model.entity.Cliente;
import io.github.Lucas_Santos_A.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientesAplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientesAplication.class, args);
    }
}
