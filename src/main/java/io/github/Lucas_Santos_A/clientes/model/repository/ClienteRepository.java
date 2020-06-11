package io.github.Lucas_Santos_A.clientes.model.repository;

import io.github.Lucas_Santos_A.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
