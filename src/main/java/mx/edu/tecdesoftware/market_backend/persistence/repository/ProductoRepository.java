package mx.edu.tecdesoftware.market_backend.persistence.repository;

import mx.edu.tecdesoftware.market_backend.persistence.crud.ProductoCrudRepository;
import mx.edu.tecdesoftware.market_backend.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements mx.edu.tecdesoftware.market_backend.domain.repository.ProductoRepository {

    @Autowired
    private ProductoCrudRepository productoCrudRepository;

    @Override
    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }

    @Override
    public Optional<Producto> getProducto(int idProducto) {
        return productoCrudRepository.findById(idProducto);
    }

    @Override
    public Producto save(Producto producto) {
        return productoCrudRepository.save(producto);
    }

    @Override
    public void delete(int idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }
}