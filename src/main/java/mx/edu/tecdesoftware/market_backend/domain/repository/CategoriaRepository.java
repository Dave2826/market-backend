package mx.edu.tecdesoftware.market_backend.domain.repository;

import mx.edu.tecdesoftware.market_backend.persistence.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaRepository {

    List<Categoria> getAll();

    Optional<Categoria> getCategoria(int idCategoria);

    Categoria save(Categoria categoria);

    void delete(int idCategoria);
}