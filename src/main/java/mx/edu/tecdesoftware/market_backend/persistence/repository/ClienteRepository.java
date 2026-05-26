package mx.edu.tecdesoftware.market_backend.persistence.repository;

import mx.edu.tecdesoftware.market_backend.persistence.crud.ClienteCrudRepository;
import mx.edu.tecdesoftware.market_backend.persistence.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository implements mx.edu.tecdesoftware.market_backend.domain.repository.ClienteRepository {

    @Autowired
    private ClienteCrudRepository clienteCrudRepository;

    @Override
    public List<Cliente> getAll() {
        return (List<Cliente>) clienteCrudRepository.findAll();
    }

    @Override
    public Optional<Cliente> getCliente(String idCliente) {
        return clienteCrudRepository.findById(idCliente);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteCrudRepository.save(cliente);
    }

    @Override
    public void delete(String idCliente) {
        clienteCrudRepository.deleteById(idCliente);
    }
}