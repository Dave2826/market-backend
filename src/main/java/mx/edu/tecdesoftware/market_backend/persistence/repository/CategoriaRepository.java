package mx.edu.tecdesoftware.market_backend.persistence.repository;

import mx.edu.tecdesoftware.market_backend.persistence.crud.CategoriaCrudRepository;
import mx.edu.tecdesoftware.market_backend.persistence.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoriaRepository implements mx.edu.tecdesoftware.market_backend.domain.repository.CategoriaRepository {

    @Autowired
    private CategoriaCrudRepository categoriaCrudRepository;

    @Override
    public List<Categoria> getAll() {
        return (List<Categoria>) categoriaCrudRepository.findAll();
    }

    @Override
    public Optional<Categoria> getCategoria(int idCategoria) {
        return categoriaCrudRepository.findById(idCategoria);
    }

    @Override
    public Categoria save(Categoria categoria) {
        return categoriaCrudRepository.save(categoria);
    }

    @Override
    public void delete(int idCategoria) {
        categoriaCrudRepository.deleteById(idCategoria);
    }
}