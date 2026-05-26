package mx.edu.tecdesoftware.market_backend.domain.repository;

import mx.edu.tecdesoftware.market_backend.persistence.entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository {

    List<Cliente> getAll();

    Optional<Cliente> getCliente(String idCliente);

    Cliente save(Cliente cliente);

    void delete(String idCliente);
}