package mx.edu.tecdesoftware.market_backend.domain.service;

import mx.edu.tecdesoftware.market_backend.domain.repository.CategoriaRepository;
import mx.edu.tecdesoftware.market_backend.persistence.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> getAll() {
        return categoriaRepository.getAll();
    }

    public Optional<Categoria> getCategoria(int idCategoria) {
        return categoriaRepository.getCategoria(idCategoria);
    }

    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public boolean delete(int idCategoria) {

        return getCategoria(idCategoria).map(categoria -> {
            categoriaRepository.delete(idCategoria);
            return true;
        }).orElse(false);
    }
}